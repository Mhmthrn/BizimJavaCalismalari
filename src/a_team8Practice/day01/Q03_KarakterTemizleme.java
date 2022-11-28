package a_team8Practice.day01;

public class Q03_KarakterTemizleme {

    /*
     kullanicini girdigi metinde
       //harf disinda kalan tum karakterleri temizleyen bir kod yazin
       //not: space silinmemeli

       input= Ja5+va _ cok 1*guzel
     */

    public static void main(String[] args) {

        String input="Ja5+va _ cok 1*guzel";

        input=input.replaceAll("\\d","");
        System.out.println(input);//Ja+va _ cok *guzel

        input= input.replaceAll(" ","9");
        System.out.println(input);//Ja+va9_9cok9*guzel

        input=input.replaceAll("\\W","");
        System.out.println(input);// Java9_9cok9guzel

        input=input.replaceAll("9"," ");
        System.out.println(input);// Java _ cok guzel


        input=input.replaceAll("_","");
        System.out.println(input);//Java  cok guzel

        input=input.replaceAll("\\s+"," ");
        System.out.println(input);// Java cok guzel


    }




}
