//Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i

package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int i;
        Random num = new Random();
        i = num.nextInt(0, 2001);
        System.out.println(i);
    }
}
