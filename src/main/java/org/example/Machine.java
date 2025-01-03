package org.example;

import java.util.Scanner;

public class Machine {


    static String machineName() {                       //Метод для чтения данных о названии машин от пользователя
        Scanner scanner = new Scanner(System.in);       //Создаю сканнер
        String machine = scanner.next();                //Принимаю значение, записываю в переменную типа строки
        return machine;                                 //Возвращаю значение
    }

    static long speedRange() {                                  //Метод для рамок скорости
        Scanner scanner = new Scanner(System.in);               //Создаю сканнер
        while (true) {                                          //Пишу бесконечный цикл (для случая, когда люая введенная скорость не входит в рамки
            long speed = scanner.nextLong();
            if (0 < speed && speed < 251) {                    //Пишу условие для составления рамок
                return speed;                                   //Возвращаю значение
            } else {
                System.out.println("Неправильная скорость");    //Вывожу сообщение о неправильном вводе, если скорость не входит в рамки
            }
        }

    }

}
