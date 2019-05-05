package ru.mail.sergey_balotnikov;

import java.time.Year;
import java.util.Calendar;
import java.util.concurrent.Callable;

public class Auto {
    private int mileage;
    private int mileageToService = 10000;
    private boolean isServiseNeed;
    private boolean isSecondHand;
    private String color;
    private String model;
    private int presentYear;

    public Auto() {
    }

    public Auto(String model, int presentYear) {
        this.model = model;
        this.presentYear = presentYear;
    }

    @Override
    public String toString() {
        return "Auto:" +
                " mileage = " + getMileage() +
                ", is service need =" + isServiseNeed() +
                ", second hand = " + isSecondHand() +
                ", color = " + getColor() +
                ", model = " + getModel() +
                ", present Year = " + getPresentYear()+
                ", mileage to next service = " + mileageToService;
    }
    public void repairs(){
        mileageToService = 10000;
        Calendar toDay = Calendar.getInstance();
        int temp = toDay.get(Calendar.YEAR);
        presentYear = temp;
    }

    public int getMileage() {
        return mileage;
    }

    public boolean isServiseNeed() {
        return setServiseNeed();
    }

    public boolean isSecondHand() {
        return isSecondHand;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public int getPresentYear() {
        return presentYear;
    }

    public void setMileage(int mileage) {
        this.mileage += mileage;
        mileageToService-=mileage;
    }

    public void setServiseNeed(boolean serviseNeed) {
        isServiseNeed = serviseNeed;
    }

    public boolean setServiseNeed(){//если авто с пробегом более 10000 или старше 3 лет
        Calendar toDay = Calendar.getInstance();
        int thatYear = toDay.get(Calendar.YEAR);
        if(mileageToService<0 || thatYear-getPresentYear()>3){
            setServiseNeed(true);
        } else {
            setServiseNeed(false);
        }
        return isServiseNeed;
    }

    public void setSecondHand(boolean secondHand) {
        this.isSecondHand = secondHand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPresentYear(int presentYear) {
        this.presentYear = presentYear;
    }
}
