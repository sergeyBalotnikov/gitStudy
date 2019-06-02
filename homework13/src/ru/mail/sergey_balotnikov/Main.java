package ru.mail.sergey_balotnikov;

public class Main {
    public static void main(String[] args) {
        /*Scanner in = new Scanner(System.in);
        System.out.println("Haw many cash-box must be open:");
        int a;
        while (true){
        try {
            a = Integer.parseInt(in.nextLine());
            break;
        } catch (Exception e) {
            System.out.println("input wrong value.");
        }}

        for(int i = 1; i<=a;i++){
            CashBox cashBox = new CashBox(i);
            Cashier cashier = new Cashier(cashBox);
        }*/
        /*Тестируем. Создаём три кассы. 100 клиентов в цикле for, трех кассиров. Запускаем.
        * */
        CashBox cashBox1 = new CashBox(1);
        CashBox cashBox2 = new CashBox(2);
        CashBox cashBox3 = new CashBox(3);

        for(int i = 1; i <= 100; i++){
            Client client = new Client();
            Thread t = new Thread(client);
            t.start();
            client.setCashBox(cashBox1,cashBox2,cashBox3);
        }
        /*try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        Thread cashier1 = new Thread(new Cashier(cashBox1));
        Thread cashier2 = new Thread(new Cashier(cashBox2));
        Thread cashier3 = new Thread(new Cashier(cashBox3));
        cashier1.start();
        cashier2.start();
        cashier3.start();
        }

    }

