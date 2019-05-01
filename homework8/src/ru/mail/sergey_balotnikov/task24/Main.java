package ru.mail.sergey_balotnikov.task24;

public class Main {
    public static void main(String[] args) {
        SmartAppliences TV = new SmartAppliences();
        TV.setDescription("Smart TV");
        TV.isOn();
        System.out.println(TV);
        TV.isOff();
        System.out.println(TV);
        TV.isOn();
        TV.setWiFiModule(false);
        System.out.println(TV);
        TV.setWiFiModule(true);
        System.out.println(TV);

        AnalogAppliances toaster = new AnalogAppliances();
        toaster.setDescription("Toaster");
        toaster.isOn();
        System.out.println(toaster);
        toaster.isOff();
        System.out.println(toaster);
    }
}
