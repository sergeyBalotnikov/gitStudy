package ru.mail.sergey_balotnikov.task24;

import java.util.Calendar;

public interface Control {
    void setWarrantyPeriod(String warrantyPeriod);

    boolean plugUnplug();

    StringBuilder getDescription();

    Calendar getPurchaseDay();

    boolean isOn();

    String getWarrantyPeriod();

    void setDescription(String description);

    /*set purchase date in String. Format dd.MM.yyyy.*/
    void setPurchaseDay(String pDay);



    void isGaurantes();

    boolean isPlug();
}
