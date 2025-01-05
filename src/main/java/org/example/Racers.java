package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Racers {


    public static ArrayList carsNames(int numberCars) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> namesOfCars = new ArrayList<>();
        ArrayList<Integer> speedOfCars = new ArrayList<>();

        Machine.speedRange();


        for (int i = 1; i <= numberCars; i++) {
            System.out.println("Введите название машины: " + i);
            String carName = scanner.next();
            namesOfCars.add(carName);
            System.out.println("Введите скорость машины: " + i);
            int carSpeed = scanner.nextInt();


        }return namesOfCars;
    }

}
