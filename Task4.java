//Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
package org.example;

import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int number = new Random().nextInt(Short.MIN_VALUE, 0); // числo в диапазоне от Short.MIN_VALUE до i
        System.out.println(number);

        for (int i = 1; i < 200; i++) {
            if (number % i != 0) {   //некратные
                System.out.println(i);
            }
            int[] numbers = new int[i];
            System.out.println(numbers);// не понимаю, как по нормальному добавить данные в массив

        }
    }
}