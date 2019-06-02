package ru.mail.sergey_balotnikov;

import java.util.ArrayList;
import java.util.List;

/*
* Класс Касса. Имеет поля: очередь клиентов List client, Норер кассы.
* Методы: newClient, добавляет нового клиента в очередь. Синхронизирован по полю clients.
* getClient  -  возвращает поле clients*/
public class CashBox {
    private final List<Client> clients = new ArrayList<>();
//    private boolean isFree;
    private int cashboxNum;

    public CashBox(int cashboxNum){
        this.cashboxNum = cashboxNum;
    }


    public void newClient(Client client){
        //System.out.println("Cash-box: new client "+ client.getName());
        synchronized (clients){
            clients.add(client);
        }
    }

    /*public synchronized void CalculatePurchases(){
        try {
            System.out.println("Cash-box number "+cashboxNum+": new client");
            String cashierName = Thread.currentThread().getName();
            Client client;
            synchronized (clients){
                if(!clients.isEmpty()){
                    client = clients.remove(0);
                } else return;
            }

            System.out.println("Cashier "+ cashierName+" is serving "+client.getName());
            for(int i = 0; i< client.getPurchases().length; i++){
                System.out.print(client.getPurchases()[i]+", ");
            }
            System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/

    /*public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }*/

    public List<Client> getClients() {
        return clients;
    }

    /*public boolean isClientsEmpty(){
        return clients.isEmpty();
    }*/
}
