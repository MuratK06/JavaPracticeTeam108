package test.day09;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    /*
     ============= İŞLEMLER =============
		 1-EKLEME
		 2-ARAMA
		 3-LİSTELEME
		 4-SİLME
		 Q-ÇIKIŞ

	SEÇİMİNİZ:

  ŞEKLİNDE BİR MENÜ OLUŞTURULMALI.

3. ARAMA VE SİLME İŞLEMLERİ KİMLİK NO YA GÖRE YAPILMALIDIR.
     */
Scanner scan=new Scanner(System.in);
static  int numara=1000;
ArrayList<Ogrenci> ogrList=new ArrayList<>();
    void islemler(){
        System.out.print("============= İŞLEMLER =============\n" +
                "\t\t 1-EKLEME\n" +
                "\t\t 2-ARAMA\n" +
                "\t\t 3-LİSTELEME\n" +
                "\t\t 4-SİLME\n" +
                "\t\t Q-ÇIKIŞ\n" +
                "\n" +
                "\tSEÇİMİNİZ: ");



        try {
            int secim=scan.nextInt();
            System.out.println(" ");

            switch (secim) {
                case 1: {
                    ekleme();
                }
                case 2: {
                    System.out.print("ARANACAK TC NOYU GIRINIZ:");
                    arama(scan.next());
                }
                case 3: {
                    listeleme();
                }
                case 4: {
                    silme();
                }
                default:{
                    System.out.println("HATALI DEGER GIRDINIZ!!!");
                    islemler();
                }
            }
        }catch (InputMismatchException e){
            String islem=scan.next();
            if (islem.equalsIgnoreCase("q")){
                System.out.println("***** SISTEMDE CIKILIYOR+++++++++++");
                System.exit(0);
            }else{
                System.out.println(" HATALI GIRIS YAPILDI . !!!!");
                islemler();
            }
        }

    }

    private void silme() {
        System.out.print("SILINECEK OGRENCINI TC NOSUNU GIRINIZ: ");
        String tcNo=scan.next();
        boolean kontrol=true;
        for (int i = 0; i <=ogrList.size() ; i++) {

            if (ogrList.get(i).getTcNo().equals(tcNo)){
                ogrList.remove(i);
                listeleme();
                islemler();
            }

        }
        if (kontrol){
            System.out.println("BU TC NOYA AIT TCNO YOKTUR!!!");
            islemler();
        }
    }

    private void listeleme() {
        for (Ogrenci each:ogrList
        ) {
            System.out.println(each);
            System.out.println();
        }
        islemler();
    }

    private void arama(String tcNo) {
        boolean kontrol = true;
        for (Ogrenci each : ogrList
        ) {
            if (each.getTcNo().equals(tcNo)) {
                System.out.print("ARANAN OGRENCI= " + each);
                kontrol=false;
                islemler();
            }
        }
        if (kontrol) {
            System.out.println("BU TC NOYA AIT TCNO YOKTUR!!!");
            islemler();
        }
    }

    private void ekleme(){
        scan.nextLine();
        System.out.print(" OGRENCININ ADI: ");
        String ad=scan.nextLine();
        System.out.print("OGRENCININ SOYADI: ");
        String sAd=scan.nextLine();
        System.out.print("OGRENCI KIMLIK NO: ");
        String tcNo=tcNoKontrol(scan.next());
        System.out.print("OGRENCININ YASI: ");
        int yas =scan.nextInt();
        System.out.print("OGRENCININ SINIFI:");
        String sinif= scan.next();
        Ogrenci ogrenci=new Ogrenci(ad,sAd,tcNo,yas,++numara,sinif);
        ogrList.add(ogrenci);

        for (Ogrenci each:ogrList
             ) {
            System.out.println(each);
        }
        islemler();
    }

    private String tcNoKontrol(String tcNo) {
        String tcNoArr []=tcNo.split("");
        boolean kontrol=true;
        for (String each:tcNoArr
        ) {
        if (!Character.isDigit(each.charAt(0))){ //sayisal bir ifade degilse Digit
            kontrol=false;
        }
        }
        if (!kontrol){
            System.out.println("GIRILEN TC NO HATALI !!!");
           tcNoKontrol(scan.next());
        }
        return tcNo;
    }
}
