package ru.mail.sergey_balotnikov;

/*
* Класс кассир. Имеет поле Касса. Пока очередь кассы не пустая - выполняется изъятие из очереди клиентов по одному и печать
* списка их покупок.
* */
public class Cashier implements Runnable{

    private CashBox cashBox;

    public Cashier(CashBox cashBox){
        this.cashBox = cashBox;
    }

    @Override
    public void run(){
        do{
            if (!cashBox.getClients().isEmpty()){
                String cashier = Thread.currentThread().getName();
                Client client = cashBox.getClients().remove(0);
                System.out.println("Client "+client.getName()+" is serving. "+cashier);
                    for(int i=0; i<client.getPurchases().length; i++){
                    System.out.print(client.getPurchases()[i]+", ");
            }
                System.out.println("\nClient "+client.getName()+" end serving. "+cashier);
            } else return;
        }while(true);
    }
}
