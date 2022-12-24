package a_team8Practice.day11;

public class Car {
    /*
    Soru 43-)
        Biri parametreli, diğeri parametresiz 2 constructor oluşturun.
        Bu const. kullanarak en az 2 nesne oluşturun ve konsolda
        bu nesnelerin özellikleri yazdırın
        Ipucu: Constructor konusunu pratik yapalım.
        Nesnelerin rengini adını sayısını gönderelim sonra cagırıp konsolda yazdıralım.
     */
    String marka="Lexus";
    int modelYl= 2018;
    String renk="Kirmizi";

    Car (){
        marka="Mercedes";
        renk="Mavi";
    }

    Car(String marka,int modelYl){
        this();
        renk="Mor";
        this.marka=marka;
        this.modelYl=modelYl;

    }

    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                ", modelYl=" + modelYl +
                ", renk='" + renk + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Car arb1=new Car();
        System.out.println(arb1);

        Car arb2= new Car("Mazda",2003);
        System.out.println(arb2.modelYl);
    }



}
