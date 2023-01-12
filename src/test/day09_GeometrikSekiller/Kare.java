package test.day09_GeometrikSekiller;

import java.util.Scanner;

public class Kare extends IIslemler {
    Scanner scan=new Scanner(System.in);
    int kenar=0;

    public void alan() {
        System.out.print("Karenin bir kenar uzunluğunu giriniz: ");
        kenar=scan.nextInt();
        System.out.println("Alan= "+(kenar*kenar));
    }


    public void cevre() {
        System.out.println("Cevre= "+(4*kenar));
    }
}
