package test.day10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AnaMenu {
    Scanner scan=new Scanner(System.in);
    void menu(){
        System.out.print("====================================\n" +
                "\t ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ\n" +
                "\t====================================\n" +
                "\t 1- ÖĞRENCİ İŞLEMLERİ\n" +
                "\t 2- ÖĞRETMEN İŞLEMLERİ\n" +
                "\t Q- ÇIKIŞ\n" +
                "\t SEÇİMİNİZ: ");
        try {
            int secim=scan.nextInt();
            switch (secim){
                case 1:{
                    OgrenciIslemler ogrenciMenu=new OgrenciIslemler();
                    ogrenciMenu.ogrenciMenu();
                }
                case 2:{
                    OgretmenIslemler ogretmenMenu=new OgretmenIslemler();
                    ogretmenMenu.ogrtMenu();
                }

            }
        }catch (InputMismatchException e){
            String secim=scan.next();
            if (secim.equalsIgnoreCase("q")){
                System.out.println("SİSTEMDEN ÇIKIYOR");
                System.exit(0);
            }else {
                System.out.println("HATALI GİRİŞ YAPTINIZ");
                menu();
            }

        }
    }
}
