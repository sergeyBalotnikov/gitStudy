package ru.mail.sergey_balotnikov.task23;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nom20, nom50, nom100;
        //задаём начальное количество купюр в банкомате
        while (true) {
            try {
                System.out.println("Количество купюр номиналом 20");
                nom20 = Math.abs(Integer.parseInt(in.nextLine()));
                if(nom20<0){
                    System.out.println("Значение не может быть отриццательным");
                } else {break;}
            } catch (Exception e){
                System.out.println("Вы ввели некорректное значение");
            }
        }//проверка начальных значений колличества купюр на корректность
        while (true) {
            try {
                System.out.println("Количество купюр номиналом 50");
                nom50 = Math.abs(Integer.parseInt(in.nextLine()));
                if(nom50<0){
                    System.out.println("Значение не может быть отриццательным");
                } else {break;}
            } catch (Exception e){
                System.out.println("Вы ввели некорректное значение");
            }
        }//проверка начальных значений колличества купюр на корректность
        while (true) {
            System.out.println("Количество купюр номиналом 100");
            try {
                nom100 = Math.abs(Integer.parseInt(in.nextLine()));
                if(nom100<0){
                    System.out.println("Значение не может быть отриццательным");
                } else {break;}
            } catch (Exception e){
                System.out.println("Вы ввели некорректное значение");
            }
        }//проверка начальных значений колличества купюр на корректность

        ATM machine = new ATM(nom20, nom50, nom100);//создаём банкомат

        System.out.println(machine);
        //получаем с консоли команду
        while(true) {
            System.out.println("If you want input money - press [+]" + '\n' +
                    "If you want withdraw funds - press [-]"+'\n'+
                    "If you want exit - press [Enter]");
            System.out.println(machine);
            String command = in.nextLine();
            if (command.equals("")){//прекращаем работу, если введен [enter]
                break;
            }
            if(command.equals("-")){//снимаем средства, если введен "-"

                int enterSum = 0;
                //проверяем корректность введенной суммы
                while (true) {
                    System.out.println("Введите сумму для снятия средств: ");
                    String StrSum = in.nextLine();
                    try {
                        enterSum = Integer.parseInt(StrSum);
                        if(enterSum<0){
                            System.out.println("Значение не может быть отриццательным");
                        } else {break;}
                    } catch (Exception e){
                        System.out.println("Вы ввели некорректное значение");
                    }
                }
                int enterSum2 = enterSum;
                //обрабатываем исключения 10, 30, и не кратные 10
                if(enterSum%10!=0||enterSum==10||enterSum==30){
                    System.out.println("Введено некорректное значение. Сумма должна быть кратна 10, кроме 10 и 30");
                    continue;
                } else {}
                if(enterSum>machine.getSumm()){
                    System.out.println("Извините, в банкомате недостаточно средств. ");
                    System.out.println("Доступная сумма "+machine.getSumm());
                    continue;
                }

                if(enterSum%20!=0 && machine.getNominal_50()==0){
                    System.out.println("Извините, нет купюр нужного номинала. ");
                    System.out.println("Попробуйте ввести "+(enterSum2+10) +" или "+(enterSum2-10));
                    continue;
                }
                if(machine.getSumm()-enterSum==30 || machine.getSumm()-enterSum == 10){
                    System.out.println("Извините, нет купюр нужного номинала. ");
                    System.out.println("Попробуйте ввести "+(enterSum2+10) +" или "+(enterSum2-10));
                    continue;
                }
                nom100 = 0; nom50=0; nom20=0;
                nom100 = enterSum/100;
                enterSum -= nom100 * 100;

                if(enterSum == 10 || enterSum == 30){
                    nom100--;
                    enterSum+=100;
                }
                if(machine.getNominal_100()<nom100){
                    nom50 = 2*(nom100-machine.getNominal_100());//заменяем 100 на 50*2, если купюр не хватает
                    nom100 = machine.getNominal_100();
                }
                nom50+=enterSum/50;
                enterSum-=enterSum/50*50;
                if(enterSum==10 || enterSum==30){
                    nom50--;
                    enterSum+=50;
                }
                if(machine.getNominal_50()<nom50){
                    nom20 = 5*((nom50-machine.getNominal_50())/2);
                    nom50 = machine.getNominal_50();
                }
                nom20+=enterSum/20;
                if(nom20>machine.getNominal_20()){
                    System.out.println("недостаточно купюр необходимого номинала");
                    System.out.println("Попробуйте ввести "+(enterSum2+10) +" или "+(enterSum2-10));
                    continue;
                }
                System.out.println("выдано "+'\n'+ nom100 +" купюр номиналом 100,"+'\n'+ nom50+
                        " купюр номиналом 50"+'\n'+nom20+" купюр номиналом 20.");
                machine.depositAmount(-nom20, -nom50, -nom100);
                System.out.println(machine);

            }
            if(command.equals("+")){
                int sum = 0, en20 = 0, en50 = 0, en100 = 0, en = 0;
                String enterNom="";
                while(true){
                    System.out.println("Внесите деньги [Принимаются купюры номиналом 20, 50 и 100]: "+'\n'+
                            "Чтобы закончить ввод денег нажмите [Enter]");
                    enterNom = in.nextLine();

                    if(enterNom.equals("20")){
                        en=20;
                        en20++;
                        sum+=en;
                        System.out.println("Вы внесли "+en+". Сумма = "+ sum+".");
                    } else if(enterNom.equals("50")){
                        en = 50;
                        en50++;
                        sum+=en;
                        System.out.println("Вы внесли "+en+". Сумма = "+ sum+".");
                    } else if(enterNom.equals("100")){
                        en = 100;
                        en100++;
                        sum+=en;
                        System.out.println("Вы внесли "+en+". Сумма = "+ sum+".");
                    } else if(enterNom.equals("")){
                        System.out.println("Вы внесли "+en+". Сумма = "+ sum+".");
                        break;
                    } else {
                        System.out.println("Вы ввели некорректное значение");
                    }
                }
                machine.depositAmount(en20,en50,en100);
                System.out.println("Вы ввели: "+'\n'+en20+" банкнот, номиналом 20"+'\n'+
                        en50+" банкнот, номиналом 50"+'\n'+
                        en100 +" банкнот, номиналом 100"+'\n'+
                        "На сумму "+sum+"."+'\n'+"Средства отправлены на ваш счёт.");
                System.out.println(machine);

            } else {
                System.out.println("Введена некорректная команда");
            }
        }
        System.out.println(machine);
    }
}
