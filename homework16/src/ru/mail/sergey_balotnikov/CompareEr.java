package ru.mail.sergey_balotnikov;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.ToDoubleBiFunction;

public class CompareEr {
    public static void main(String[] args) {
        BiConsumer<Double, Double> biConsumer = ((o,o1)->{
            BigDecimal A = new BigDecimal(o);
            BigDecimal B = new BigDecimal(o1);
            System.out.println("Program get next numbers: "+A.setScale(4, RoundingMode.HALF_EVEN)+" and "+
                    B.setScale(4, RoundingMode.HALF_EVEN));
            if(o>o1){
                System.out.println("Max is "+ A.setScale(4, RoundingMode.HALF_EVEN)+ "\nMin is "+
                        B.setScale(4, RoundingMode.HALF_EVEN));
            } else if(o<o1){
                System.out.println("Max is "+ B.setScale(4, RoundingMode.HALF_EVEN)+ "\nMin is "+
                        A.setScale(4, RoundingMode.HALF_EVEN));
            }
            else {
                System.out.println("numbers are equal");
            }});
        double a,b;
        a = new Random().nextDouble()*100;
        b = new Random().nextDouble()*100;


        biConsumer.accept(a,b);

    }
}
