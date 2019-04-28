package ru.mail.sergey_balotnikov.task24;

import java.time.Year;
import java.util.Calendar;

public class AnalogAppliances extends Appliances {
//класс устаревшей техники. добавлен один метод,
    //определяющий, устарела ли техника (куплена более 10 лет назад
    //или все ещё актуальна (менее 10 лет назад)
    //возвращает значение типа String с соответствующим сообщением

    public void obsolescence (){
        Calendar temp = Calendar.getInstance();
        temp=getPurchaseDay();
        temp.add(Calendar.YEAR,10);
        setPurchaseDay(temp);

        if(temp.before(Calendar.getInstance())){

            System.out.println("This ["+getDescription() + "] was acquired over 10 years " +
                    "ago; it is outdated. Replacement is recommended.");
        } else {
            System.out.println("This ["+getDescription() + "] was acquired less than 10 years ago. still relevant");
        }
    }
}
