package test.day08;

import java.util.Scanner;

public class Q1_EBOB_EKOK {
    // Take 2 integers from user and find GCD (Greatest Common Divisor) and LCM (Least Common Multiple)
    // Kullanicidan 2 adet tamsayi alip, EBOB ve EKOK'larini bulan program yaziniz.

    public static void main(String[] args) {


        int sayi1 = 20;
        int sayi2 = 50;
        int kucuksayi=0;
        int buyuksayi=0;
        int flag=0;

        if (sayi1<sayi2){
            kucuksayi=sayi1;
            buyuksayi=sayi2;
        }else
            kucuksayi=sayi2;
            buyuksayi=sayi1;

        for (int i = kucuksayi; i >1 ; i--) {

            if (sayi1%i==0 && sayi2%i==0){

                System.out.println("Sayilarin EBOB 'u= "+ i);
                flag++;
                break;
            }
        }
        if (flag==0) System.out.println("Bu sayilarin EBOB 'u yoktur");

            for (int i = buyuksayi; i <= sayi1*sayi2 ; i+=buyuksayi) {

                if (i%sayi1==0 && i%sayi2==0) {
                    System.out.println("Sayilarin EKOK'u = " + i);
                    break;
                }
            }


    }
}
