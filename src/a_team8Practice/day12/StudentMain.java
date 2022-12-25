package a_team8Practice.day12;

public class StudentMain {
    /*
    Soru 45-)
        StudentMaın adında bir class olusturun, ögrenci bilgilerini alın. (ad soyad yas cınsiyet okul)
        Ardından Student adlı         bir class olusturun ve içine parametreli constructor koyun, bu parametreler
        Maın classdaki bılgılerı ıstesın.Bu parametreli constructor icinde kullanıcıya ögrenci bilgilerini doldurtun.
         Ardından consolda giriilen bilgileri yazdırın
        Ipucu:
        Bu soruda iki classa ihtiyacımız olacak.
        Birinci main classda ögrenci bilgilerini tanımlayacagımız variablerı olusturacagız. String isim, int yas,
         char cinsiyet gibi...
        Ardından baska bir class olusturacagız ve bu classa parametrelı bir constructor koyacagız, bu parametrelı
        constructor az önce olusturdugumuz classdaki parametreleri kabul edecek sekılde olmalı.
        Ardından Main classda, parametreli constructoru olan classtan bir obje olusturacagız ve tabi ki constructor
        parametrelı oldugu ıcın bızden parametre yazmamızı ısteycek, bızde yukarıda olusturdugumuz variable adlarını
        ekleyecegız.*/







    public static void main(String[] args) {

        Student ogr1=new Student("Ahmet","Melek",16,"E","Taskapi Ilkokulu");
        System.out.println(ogr1.toString());


    }


}

