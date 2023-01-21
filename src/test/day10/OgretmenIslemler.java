package test.day10;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class OgretmenIslemler implements IIslemler{

    Scanner scan = new Scanner(System.in);
    static int sicilNo = 1000;
   static ArrayList<Ogretmen> ogretmenList = new ArrayList<>();

    void ogrtMenu() {
        System.out.println("=============OGRETMEN  İŞLEMLER =============\n" +
                "\t\t 1-EKLEME\n" +
                "\t\t 2-ARAMA\n" +
                "\t\t 3-LİSTELEME\n" +
                "\t\t 4-SİLME\n" +
                "\t\t Q-ÇIKIŞ\n" +
                "\n" +
                "\tSEÇİMİNİZ:");
        try {
            int secim = scan.nextInt();
            switch (secim) {
                case 1: {
                    ekleme();
                }
                case 2: {
                    arama();
                }
                case 3: {
                    listeleme();
                }
                case 4: {
                    silme();
                }
            }
        } catch (InputMismatchException e) {
            String secim = scan.next();
            if (secim.equalsIgnoreCase("q")) {
                AnaMenu anaMenu = new AnaMenu();
                anaMenu.menu();
            } else {
                System.out.println("HATALI GİRİŞ YAPILDI");
                ogrtMenu();
            }
        }
    }


    @Override
    public void ekleme() {
        System.out.print("ÖĞRETMENİN ADINI GİRİNİZ: ");
        scan.nextLine();
        String ad = scan.nextLine();
        System.out.print("ÖĞRETMENİN SOYADINI GİRİNİZ: ");
        String sAd = scan.nextLine();
        System.out.print("ÖĞRETMENİN TC NO SUNU GİRİNİZ: ");
        String tcNo = scan.next();
        System.out.print("ÖĞRETMİNİN YAŞINI GİRİNİZ: ");
        int yas = scan.nextInt();
        scan.nextLine();
        System.out.print("ÖĞRETMENİN BÖLÜMÜNÜ GİRİNİZ: ");
        String bolum = scan.nextLine();
        Ogretmen ogretmen = new Ogretmen(ad, sAd, tcNo, yas, bolum, sicilNo++);
        ogretmenList.add(ogretmen);
        listeleme();
        ogrtMenu();

    }

    @Override
    public void arama() {
        System.out.println("ARANACAK KISININ TC NO SUNU GIRINIZ: ");
        String tcNo= scan.next();
        boolean kontrol=true;
        for (Ogretmen each:ogretmenList
             ) {
            if (each.getTcNo().equals(tcNo)){
                System.out.println(each);
                kontrol=false;
            }
        }
        if (kontrol){
            System.out.println(tcNo +" TC NOLU KISI BULUNMAMAKTADIR.");
        }
        ogrtMenu();

    }

    @Override
    public void listeleme() {
        for (Ogretmen each:ogretmenList
             ) {
            System.out.println(each);
        }

    }

    @Override
    public void silme() {
        System.out.println(" SILINECEK KISININ TC NOSUNU GIRINIZ: ");
        String tcNo=scan.next();
        boolean kontrol=true;

        for (int i = 0; i < ogretmenList.size() ; i++) {
            if (ogretmenList.get(i).getTcNo().equals(tcNo)){
                System.out.println("SILINEN KISI: "+ ogretmenList.get(i));
                ogretmenList.remove(i);
                kontrol =true;
                listeleme();
                ogrtMenu();
            }

        }
        if (!kontrol){
            System.out.println(tcNo +" TC NOLU KISI BULUNMAMAKTADIR.");
            ogrtMenu();
        }

    }
}
