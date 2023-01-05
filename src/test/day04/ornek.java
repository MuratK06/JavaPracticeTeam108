package test.day04;

import java.util.ArrayList;
import java.util.Arrays;

public class ornek {
    public static void main(String[] args) {

        /*
         * iki array arasinda ayni olan elemanlari bir liste ekleyen program yazin
         * (buyuk kucuk harf onemsiz)
         *
         * Input1 : {John,Brad,Angel,Sofia,Emily} Input2 : {sofia,brad,grace,emily,hazel}
         *
         * Output : [sofia,brad,emily]
         */

        String[] array1 = {"John", "Brad", "Angel", "Sofia", "Emily" };
        String[] array2 = {"sofia", "brad", "grace", "emily", "hazel" };

        ortaklist(array1, array2);


    }

    private static void ortaklist(String[] array1, String[] array2) {
        ArrayList<String> ortakarr = new ArrayList<>();

        for (int i = 0; i <array1.length ; i++) {
            for (int j = 0; j < array2.length ; j++) {

                if (array1[i].equalsIgnoreCase(array2[j])){
                    ortakarr.add(array1[i]);
                }

            }

        }
        System.out.println(ortakarr);



    }


}
