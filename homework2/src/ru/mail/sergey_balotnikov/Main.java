package ru.mail.sergey_balotnikov;

public class Main {
    public static void main(String[] args) {

        Auto auto1 = new Auto("Papugatti", 2014);
        Auto auto2 = new Auto();
        auto1.setMileage(10001);
        auto1.setServiseNeed();
        auto1.setColor("Blacker then night");
        auto2.setModel("Paganini");
        auto2.setMileage(1111);
        auto2.setSecondHand(true);
        auto2.setColor("пошарпаный");
        auto2.setPresentYear(2010);

        System.out.println(auto1);
        System.out.println(auto2);//сервис нужен
        auto2.repairs();//"Чиним" авто, обновляя [present day]
        System.out.println(auto2);//сервис не нужен
        auto2.setMileage(10001);//добавляем пробега
        System.out.println(auto2);//снова нужен сервис
    }
}