package test.day03;

import java.util.Scanner;

public class ornek {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen eksiltmek istediginiz sayiyi giriniz : ");
        int a = scan.nextInt();

        System.out.println("Lutfen eksilten sayiyi giriniz : ");
        int b = scan.nextInt();

        System.out.println(cikarma(a, b));




    }

    private static int cikarma(int eksilen, int eksilten) {

        int cislemi=0;

        if (eksilen>=eksilten){

            cislemi=eksilen-eksilten;

        }
        return cislemi;
    }
}
