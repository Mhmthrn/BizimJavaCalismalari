package a_team8Practice.day09;

public class Q5_33_soru {
    /*
    Soru 33-)
        Array kullanarak String bir cümleyi Reverse eden (tersine çeviren) bir Java programı yazın (boşluklar ve özel karakterler dahil).
        Örnek:
        String str=''Kodlama harika.''
        String arr[]: ".etaerg si gnidoC"
        İpucu: Önce Split kullanarak Arraye çevirin ardından Loop kullanarak son karakterden başlayıp tersten yazdırın
        ------------------------------------------------------------------------------------------------------------------
     */
    public static void main(String[] args) {
        String str="Zaman cok  :) degerlidir.";

        StringBuilder tersStr= new StringBuilder();

        String [] strarr=str.split("");

        for (int i =strarr.length-1; i >=0 ; i--) {

            tersStr.append(strarr[i]);
        }

        System.out.println("Girilen cumlenin Reverse edilmis hali : "+tersStr);




    }
}
