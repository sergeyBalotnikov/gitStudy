package ru.mail.sergey_balotnikov.task22;

public class TimeInterval {
    private int sec;
    private int min;
    private int hours;

    public TimeInterval(int sec, int min, int hours) {
        this.sec = sec;
        this.min = min;
        this.hours = hours;
    }

    public TimeInterval(int sec) {
        this.sec = sec%60;
        min = sec/60%60;
        hours = sec/3600;
    }

    @Override
    public String toString() {
        return "TimeInterval:" +
                " sec=" + sec +
                ", min=" + min +
                ", hours=" + hours;
    }
    public short compareTimeInterval(TimeInterval temp){
        if(this.getSec()>temp.getSec()){
            return 1;
        } else if(this.getSec()<temp.getSec()){
            return -1;
        } else {return 0;}
    }


    public int getSec() {

        return sec;
    }
    public int getIntervalInSec() {
        int temp = sec + min*60 + hours*3600;
        return temp;
    }

    public int getMin() {
        return min;
    }
    public int getIntervalInMin() {
        int temp = min + hours*60;
        return temp;
    }

    public int getHours() {
        return hours;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

}
