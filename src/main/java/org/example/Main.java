package org.example;

public class Main {
    public static void main(String[] args) {

        for (int i = 1; i < 4; i++) {
            System.out.println("Введите название машины №" + i + ":");
            String carName = Machine.machineName();
            System.out.println("Введите скорость машины №" + i + ":");
            int carSpeed = Machine.speedRange();

        }

    }
}

