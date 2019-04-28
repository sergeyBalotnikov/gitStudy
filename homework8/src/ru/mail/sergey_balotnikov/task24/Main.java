package ru.mail.sergey_balotnikov.task24;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) throws Exception {
        SmartAppliances SmartTV = new SmartAppliances();
        SmartTV.setDescription("LG smart tv, 50 inch");
        SmartTV.setWarrantyPeriod("1 year");
        SmartTV.setPurchaseDay("24.05.2018");
        SmartTV.getPurchaseDay();
        SmartTV.isGaurantes();
        System.out.println("Is on: "+SmartTV.isOn());
        SmartTV.plugUnplug();
        System.out.println("Is on: "+SmartTV.isOn());
        SmartTV.plugUnplug();
        System.out.println("Is on: "+SmartTV.isOn());
        AnalogAppliances toster = new AnalogAppliances();
        toster.setDescription("Toaster");
        toster.setPurchaseDay("20.1.2008");
        toster.obsolescence();
        SmartTV.obsolescence();


    }
}
