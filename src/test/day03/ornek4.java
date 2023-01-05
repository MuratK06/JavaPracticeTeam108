package test.day03;

import java.util.Scanner;

import static test.day03.Q2_BolmeOperatoruKullanmadanBolme.bol;

public class ornek4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bolmek istediginiz sayiyi giriniz : ");
        int a = scan.nextInt();
        System.out.println("Lutfen bolen sayiyi giriniz : ");
        int b = scan.nextInt();

        System.out.println(boll(a, b));
    }

    private static int boll(int bolunen, int bolen) {

        int bolum=0;

        while (bolunen>=bolen){

            bolunen-=bolen;

            bolum++;

        }
        return bolum;
    }


}
