package a_team8Practice.day07;

public class Q4 {
    public static void main(String[] args) {
        /*
            // kullanicidan bir string alin
        // Stringin uzunlugu cift sayi ise ortasina :)
            ekleyin
        // tek sayi ise ortasindaki harfi silin ve yerine :(
            yazdirin
         */

        String input="Seleniumu" ;

        if (input.length()%2==0){

           input= input.substring(0,(input.length()/2)-1)+
                  input.substring((input.length()/2)-1,(input.length()/2)).concat(":)")+
                  input.substring(input.length()/2);



            System.out.println(input);
        }
        else{
            input=input.replace(input.substring(input.length()/2,(input.length()/2)+1),":(");

            System.out.println(input);

        }



    }
}
