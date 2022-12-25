package a_team8Practice.day12;

public class Student {
    String  isim="Belirtilmedi";
    String soyIsim="Belirtilmedi";
    int yas= 0;
    String cinsiyet="Belirtilmedi";
    String okul="Merkez Ilkokulu";


    Student(String isim, String soyIsim, int yas, String cinsiyet, String okul ){
        this.isim=isim;
        this.soyIsim=soyIsim;
        this.yas=yas;
        this.cinsiyet=cinsiyet;
        this.okul=okul;
    }

    @Override
    public String toString() {
        return "Student{" +
                "isim='" + isim + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                ", yas=" + yas +
                ", cinsiyet='" + cinsiyet + '\'' +
                ", okul='" + okul + '\'' +
                '}';
    }
}
