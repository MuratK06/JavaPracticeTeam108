package test.day01;

public class Q1_Print {
    public static void main(String[] args) {
        /*
    Konsolda :
    "Hello "\
    / 'World'"
    yazdiriniz.
     */

    /*
      \n (or \r)  : Starts from a new line : Metni bir alt satırdan itibaren yazdırır.
              \t  : Horizontal tab         : Metni yatayda 1 tab miktarı kaydırır.
              \\  : Prints a back slash    : \  Ters slash yazdırır
              \'  : Prints single quote    : '  Tek tırnak yazdırır.
              \"  : Prints double quote    : "  Çift tırnak yazdırır.
     */



        System.out.println("\"Hello\"\\ /\'World\'\"");

        System.out.println("ayse"); // onemli: imlece alt tusuyla basili tutup cekersek diger stirlarada ayni islem yapabiliriz
        System.out.println("busra");
        System.out.println("ahmet");
        String isim= "Ahmet"; //kullanilmayan veraibleler gri renkte gorulur
        //System.out.println(isim);


        System.out.println("\"Hello\"");
        System.out.println("n");
        System.out.println("\n");
        System.out.println("n");

        System.out.println("\"Hello\"\\\n/ \'World\'\"");


    }





}
