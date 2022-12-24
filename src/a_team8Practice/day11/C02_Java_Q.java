package a_team8Practice.day11;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class C02_Java_Q {
   /*6) Kendinizin ve çocuğunuzun doğum tarihi için Tarih Değerleri oluşturup, ardından farkı gün
    olarak hesaplayınız*/

    public static void main(String[] args) {

        LocalDate anneveyababaDt=LocalDate.of(1989,8,15);

        LocalDate cocukDT= LocalDate.of(2018,5,23);

        long fark= ChronoUnit.DAYS.between(anneveyababaDt, cocukDT);

        System.out.println("Ebeveyn ile cocuk arasindaki yas fakinin gun olarak sonucu : "+ fark);


    }
}
