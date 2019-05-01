package ru.mail.sergey_balotnikov.task24;

public class AnalogAppliances extends Appliances implements Control {
    public boolean isOn(){
        setStatus(true);
        return getStatus();

    }
    public boolean isOff(){
        setStatus(false);
        return getStatus();
    }
}
