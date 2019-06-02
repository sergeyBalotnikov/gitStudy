package ru.mail.sergey_balotnikov;
/*
* Класс клиентов. Поля: Касса, Имя, Список покупок.
* При создании получаер рандомный список покупок из класса Products.
* Касса выбирается и setится на основании очереди в кассе(выбирается наименьшая очередь).
*
* */
public class Client implements Runnable {

    private CashBox cashBox;
    private String name;
    private String[] purchases;

    public String[] getPurchases() {
        return purchases;
    }


    public void setCashBox(CashBox c1,CashBox c2, CashBox c3){
        if(c1.getClients().size()<=c2.getClients().size()&&c1.getClients().size()<=c3.getClients().size()){
            cashBox = c1;
        }else if(c2.getClients().size()<=c1.getClients().size()&&c2.getClients().size()<=c3.getClients().size()){
            cashBox = c2;
        } else cashBox=c3;
    }

    public Client(){
        name = Thread.currentThread().getName();
        purchases = Products.getProducts();
    }

    public String getName() {
        return name;
    }

   /* public void setName(String name) {
        this.name = name;
    }*/

    @Override
    public void run(){

        try {
            cashBox.newClient(new Client());
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
