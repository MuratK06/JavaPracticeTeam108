package test.day09_GeometrikSekiller;

import java.util.Scanner;

public class Dikdortgen extends IIslemler {
    Scanner scan=new Scanner(System.in);
    int kenar1=0;
    int kenar2=0;

    public void alan() {
        System.out.print("1. kenar uzunluğunu giriniz: ");
        kenar1=scan.nextInt();
        System.out.println("2. kenar uzunluğunu giriniz: ");
        kenar2=scan.nextInt();
        System.out.println("Alan: "+(kenar1*kenar2));
    }


    public void cevre() {
        System.out.println("Çevre: "+(2*(kenar2+kenar1)));
    }

}
