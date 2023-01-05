package test.day06_arrays;

import java.util.Scanner;

public class birimdonusturucu {
    public static void main(String[] args) {

        // Saati saniyeye, mil'i kilometreye, kilogrami gram'a
        // ceviren bir method yaziniz.
        // Bu methodu main methodun disinda olusturup main methodun
        // icinden cagiriniz.

        Scanner scan= new Scanner(System.in);
        System.out.println("Donusturmek istediginiz birimi giriniz: \n=>Saat\n=>Mil\n=>Kilogram");
        String birim= scan.nextLine().toLowerCase();

        System.out.println("Donusturmek istediginiz birimin miktarini giriniz: ");
        double miktar= scan.nextDouble();
        donusturucu(birim,miktar);
    }

    private static void donusturucu(String brm, double mktr) {

        switch (brm){
            case "saat":
                System.out.println(mktr+ " saat "+mktr*60*60+ " saniyedir");break;
            case "mil":
                System.out.println(mktr+ " mil "+mktr*1.6+ " kilometre dir.");break;
            case "kilogram":
                System.out.println(mktr + " kiligram " +(float)(mktr*1000)+ " gramdir.");break;
            default:
                System.out.println("Saat-Mil-Kilogram disinda bir deger girdiniz,");
        }
    }
}
