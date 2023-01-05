package test.day07;

import java.util.Arrays;

public class soru1arrayelemanlaritoplami {
    public static void main(String[] args) {

        /*
Verilen bir arrayin elemanlarını ardışık toplamını hesaplayan metodu yazınız
input={ 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
output={3, 5+1, 2+7+9, 2+3+5+7}
       {3,  6,   18,     17}
*/

        int arr[]={ 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 };
        int arr2[]=new int [4];
        int toplam=0;
        int sayac=0;
        int indexara=1;

        for (int i = 0; i <arr2.length ; i++) {
            for (int j = 0; j <=sayac ; j++) {
                toplam+=arr[indexara-1+j];
            }
            arr2[i]=toplam;
            sayac++;
            toplam=0;
            indexara+=sayac;


        }
        System.out.println(Arrays.toString(arr2));


    }
}
