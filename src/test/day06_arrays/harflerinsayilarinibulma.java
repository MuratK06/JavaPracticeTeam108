package test.day06_arrays;

public class harflerinsayilarinibulma {

    static String boskova="";
    public static void main(String[] args) {

        /*
         * Interview question
         *
         * write a return method that can find the frequency of characters (with case
         * sensitivity)
         *
         * Input = AAABBCDD output = A3B2C1D2
         */



        String kelime="abab";

        System.out.println(frequency(kelime));
        System.out.println(boskova);

        //count=sayac

    }

    public static String frequency(String str){

        int count=0;

        for (int i = 0; i <str.length() ; i++) {
            for (int j = 0; j <str.length() ; j++) {

                if (str.substring(i,i+1).equals(str.substring(j,j+1))){
                    count++;

                }

            }
            if (!boskova.contains(str.substring(i,i+1))){
                boskova=boskova+str.charAt(i)+count;
            }
            count=0;


        }

        return boskova;
    }
}
