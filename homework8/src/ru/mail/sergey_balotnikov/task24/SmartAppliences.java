package ru.mail.sergey_balotnikov.task24;

public class SmartAppliences extends AnalogAppliances implements Control {
    private boolean WiFiModule;

    public boolean getWiFiModule() {
        return WiFiModule;
    }

    public void setWiFiModule(boolean wiFiModule) {
        WiFiModule = wiFiModule;
    }

    public boolean isOn(){
        super.isOn();
        setWiFiModule(true);
        return getWiFiModule();
    }
    public boolean isOff(){
        super.isOff();
        setWiFiModule(false);
        return getWiFiModule();
    }
    public boolean getStatus(){
        boolean temp = super.getStatus();
        if((temp==true) && (getWiFiModule()==true)) {
            return true;
        } else {return false;}
    }
}
