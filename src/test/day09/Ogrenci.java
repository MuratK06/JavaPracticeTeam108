package test.day09;

public class Ogrenci {
    /*
   -AD SOYAD
   -KİMLİK NO
   -YAŞ
   -NUMARA
   -SINIF
    */
    private String ad;
    private String sAd;
    private String tcNo;
    private int yas;
    private int numara;
    private String sinif;

    public Ogrenci(String ad) {
        this.ad = ad;
    }

    public Ogrenci(String ad, String sAd, String tcNo, int yas, int numara, String sinif) {
        this.ad = ad;
        this.sAd = sAd;
        this.tcNo = tcNo;
        this.yas = yas;
        this.numara = numara;
        this.sinif = sinif;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getsAd() {
        return sAd;
    }

    public void setsAd(String sAd) {
        this.sAd = sAd;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public int getNumara() {
        return numara;
    }

    public void setNumara(int numara) {
        this.numara = numara;
    }

    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }

    @Override
    public String toString() {
        return
                "\nOGRENCININ ADI= " + ad  +
                "\nOGRENCINI SOYADI= " + sAd +
                "\nOGRENCININ TC NUMARASI= " + tcNo +
                "\nOGRENCININ YASI= " + yas +
                "\nOGRENCININ NUMARSI= " + numara +
                "\nOGRENCININ SINIFI= " + sinif +
                "\n ";
    }
}
