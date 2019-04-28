package ru.mail.sergey_balotnikov.task24;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Appliances implements Control {
    private StringBuilder description = new StringBuilder();
    private boolean isOnGuarantee = true;
    private Calendar purchaseDay = Calendar.getInstance();
    private boolean isOn;
    private String warrantyPeriod;


    @Override
    public void setWarrantyPeriod(String warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public boolean isPlug(){ return isOn; } //return isOn status

    @Override
    public boolean plugUnplug(){//plug or unplug appliances, (isOn != isOn)
        isOn=!isOn;
        return isOn;
    }

    @Override
    public StringBuilder getDescription() {
        return description;
    }

    @Override
    public Calendar getPurchaseDay() {
        return purchaseDay;
    }

    @Override
    public boolean isOn() {
        return isOn;
    }

    @Override
    public String getWarrantyPeriod() {
        return warrantyPeriod;
    }

    @Override
    public void setDescription(String description) {
        this.description.append(description);
    }

       /*set purchase date in String. Format dd.MM.yyyy.*/
    @Override
    public void setPurchaseDay(String pDay) {
        DateFormat Pday = new SimpleDateFormat("dd.MM.yyyy");
        boolean isExit = true;
        while(isExit) {
            try {
                purchaseDay.setTime(Pday.parse(pDay));
                isExit = false;
            } catch (ParseException e) {
            } finally {
                if (isExit) {
                    System.out.println("You input wrong date format. try:\"dd.MM.yyyy\"");
                }
            }

        }
    }
    public Calendar setPurchaseDay(Calendar purchaseDay) {
        this.purchaseDay = purchaseDay;
        return this.purchaseDay;
    }



    @Override
    public void isGaurantes(){

        Pattern pat1 = Pattern.compile("(\\d)+");//create pattern for finding date from warrantyPeriod String
        Matcher mat1 = pat1.matcher(warrantyPeriod);
        String dmy = "0";
        if(mat1.find()){ dmy = mat1.group();} else { //find number months or year/years
            System.out.println("not found");
        }
        int tempDay = 0;
        tempDay = Integer.parseInt(dmy);

        pat1 = Pattern.compile("([a-zA-Z]+)");//renew pattern
        mat1 = pat1.matcher(warrantyPeriod);
        if (mat1.find()){ dmy = mat1.group();} else { //find years or months
            System.out.println("not found");
        }

        Calendar calendarTemp = purchaseDay;//determine the end of warranty period
        if(dmy.equals("months")){
            calendarTemp.add(Calendar.MONTH, tempDay);
        } else if (dmy.equals("years")||dmy.equals("year")){
            calendarTemp.add(Calendar.YEAR, tempDay);
        }

        if(calendarTemp.before(Calendar.getInstance())){
            System.out.println("Warranty period has expired. You haven't guarantee any more.");
            isOnGuarantee = false;
        } else if(calendarTemp.after(Calendar.getInstance())){
            long dif = calendarTemp.getTimeInMillis() - Calendar.getInstance().getTimeInMillis();
            dif /= 86_400_000;
            System.out.println(dif +" days left until the end of the warranty period");
        }

    }




}
