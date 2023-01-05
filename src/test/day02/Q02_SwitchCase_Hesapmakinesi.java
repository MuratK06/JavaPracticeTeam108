package test.day02;

import java.util.Scanner;

public class Q02_SwitchCase_Hesapmakinesi {
    public static void main(String[] args) {

        /*
         * Kullanicidan iki tamsayi sayi ve islem cinsini alin
         * ve sayilari kullanicinin belirledigi isleme tabii tutup sonucu yazdirin.
         *
         * islem cinsi icin 1:toplama 2:cikarma 3:carpma 4: bolme
         *
         * Ornek : Inputs : sayilar : 18 , 10  islem : 3
         *         Output : 18 X 10 = 180
         *
         *

         */


        System.out.println("****************** IF Cozumu ********************");

        Scanner scan=new Scanner(System.in);

        System.out.println("iki adet tamsayi giriniz");

        int sayi= scan.nextInt();
        int sayi2= scan.nextInt();

        System.out.println("islem turunu seciniz:  \n\t 1: Toplama\n\t 2: Cikarma\n\t 3: Carpma\n\t 4: Bolme");

        int islem= scan.nextInt();

        if (islem==1) System.out.println("Toplama: "+(sayi+sayi2));
        else if (islem==2) System.out.println("Cikarma: "+ (sayi-sayi2));
        else if (islem==3) System.out.println("Carpma: "+ (sayi*sayi2));
        else if (islem==4)
            if (sayi2==0) System.out.println(" 0'a bolum tanimsizdir");
            else
            System.out.println("Bolme: "+ (sayi/sayi2));



        System.out.println("****************** SwitchCase Cozumu ********************");

        System.out.println("islem turunu seciniz:  \n\t 1: Toplama\n\t 2: Cikarma\n\t 3: Carpma\n\t 4: Bolme");


        switch (islem) {
            case 1:
                System.out.println("Toplama: " + (sayi + sayi2));
                break;
            case 2:
                System.out.println("Cikarma: " + (sayi - sayi2));
                break;
            case 3:
                System.out.println("Carpma: " + (sayi * sayi2));
                break;
            case 4:
                if (sayi2 == 0) System.out.println(" 0'a bolum tanimsizdir");
                else

                    System.out.println("Bolme: " + (sayi / sayi2));
                break;
            default:
                System.out.println("yalnis giris yaptiniz");




                System.out.println("****************** SwitchCase Cozumu 2 ********************");


                System.out.println("Islem turunu seciniz : \n\t+ : Toplama\n\t- : Cikarma\n\t* : Carpma\n\t/ : Bolme");


                char isaret = scan.next().charAt(0);




                switch (isaret) {
                    case '+':
                        System.out.println("Toplama: " + (sayi + sayi2));
                        break;
                    case '-':
                        System.out.println("Cikarma: " + (sayi - sayi2));
                        break;
                    case '*':
                        System.out.println("Carpma: " + (sayi * sayi2));
                        break;
                    case '/':
                        if (sayi2 == 0) System.out.println(" 0'a bolum tanimsizdir");
                        else

                            System.out.println("Bolme: " + (sayi / sayi2));
                        break;
                    default:
                        System.out.println("yalnis giris yaptiniz");
                }
        }




    }
}
