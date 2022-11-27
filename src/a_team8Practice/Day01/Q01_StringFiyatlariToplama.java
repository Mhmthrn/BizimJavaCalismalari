package a_team8Practice.Day01;

public class Q01_StringFiyatlariToplama {
    /*
    Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
    input1 : “15.30 €” , input2 : “11.40 €”
    output : 36.70 €

     */
    public static void main(String[] args) {

        String input1 = "15.4";
        String input2 = "11.4";

        double output = Double.parseDouble(input1 )+ Double.parseDouble(input2 );


        System.out.println("Fiyatlarin toplami : "+ output +"€");


    }
}
