package a_team8Practice.day18;

public class CChild extends BParent{

    @Override
    void isim() {
        String isim="Ali";
        System.out.println(isim);
    }

    @Override
    void meslek() {
        String meslek="Informatiker";
        System.out.println(meslek);
    }

    @Override
    void soyIsim() {
        String soyIsim="Can";
    }

    @Override
    void yas() {
        int yas=25;
    }



    public static void main(String[] args) {
        AGParent child1=new CChild();
        System.out.println(child1.cinsiyet());
    }



}
