package a_team8Practice.day02;

public class Q04_ForLoopKullanarakRakamlarToplami {
    /*
    Soru 7- Kullanicidan pozitif bir tamsayi alip, rakamlar toplamini yazdirin.
     */
    public static void main(String[] args) {

        int input1=1514;

        int birlerBasamagi=0;
        int rakamlarToplami=0;

       /* birlerBasamagi=input%10;//4
        rakamlarToplami+=birlerBasamagi;// 151
        input/=10;

        birlerBasamagi=input%10;//4
        rakamlarToplami+=birlerBasamagi;// 151
        input=input/10;//15

        birlerBasamagi=input%10;//4
        rakamlarToplami+=birlerBasamagi;// 151
        input=input/10;

        birlerBasamagi=input%10;//4
        rakamlarToplami+=birlerBasamagi;// 151



        System.out.println(" sayisinin rakamlar toplami = "+rakamlarToplami);*/

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        int input=15142022;


        for (int i = 1; i <=8; i++) {

            birlerBasamagi=input%10;//2
            rakamlarToplami+=birlerBasamagi;// 2+2+0+2
            input/=10;


        }
        System.out.println("sayisinin rakamlar toplami = "+rakamlarToplami);






    }
}
