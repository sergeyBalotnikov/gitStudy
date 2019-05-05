package ru.mail.sergey_balotnikov.task23;

import java.util.ArrayList;

public class ATM {
    private int nominal_20;
    private int nominal_50;
    private int nominal_100;

    public ATM(int nominal_20, int nominal_50, int nominal_100) {
        this.nominal_20 = nominal_20;
        this.nominal_50 = nominal_50;
        this.nominal_100 = nominal_100;
    }
    public void depositAmount(int nominal_20, int nominal_50, int nominal_100){
        this.nominal_20 += nominal_20;
        this.nominal_50 += nominal_50;
        this.nominal_100 += nominal_100;
    }
    public int getSumm(){
        return nominal_20*20 + nominal_50*50 + nominal_100*100;
    }

    @Override
    public String toString() {
        return "ATM{" +
                "nominal_20=" + nominal_20 +
                ", nominal_50=" + nominal_50 +
                ", nominal_100=" + nominal_100 +
                '}';
    }

    public int getNominal_20() {
        return nominal_20;
    }

    public int getNominal_50() {
        return nominal_50;
    }

    public int getNominal_100() {
        return nominal_100;
    }

    public void setNominal_20(int nominal_20) {
        this.nominal_20 = nominal_20;
    }

    public void setNominal_50(int nominal_50) {
        this.nominal_50 = nominal_50;
    }

    public void setNominal_100(int nominal_100) {
        this.nominal_100 = nominal_100;
    }

}
