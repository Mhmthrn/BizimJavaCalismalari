package a_team8Practice.day11;

public class C06_SQ42 {
    /*
    Soru 42-)
        Parametre olarak birden fazla tamsayı (integer) kabul eden ve bu integer
        sayıların toplamını yazdıran bir dönüş methodu (void) yazın
        Method name=sum
        eğer metodu bu şekilde çağırırsanız

             toplam(1,2,3) çıktı =6
             toplam(1,2,3,4,5) çıktı =15
             sum(1,2) output=3
        Ipucu:  varargs sorusu, varargs olusturalım
     */
    public static void main(String[] args) {

        sum(1,2,3,4,5,6,7,8,9,10);//Girilen tam sayilarin toplami : 55
        sum(1,2,3);//Girilen tam sayilarin toplami : 6
    }

    private static void sum(Integer ... numbers) {

        int toplam=0;

        for (Integer  each: numbers){

            toplam+=each;
        }

        System.out.println("Girilen tam sayilarin toplami : " +toplam);


    }

}
