// Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
package org.example;

import java.util.Random;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Short.MAX_VALUE;


public class Task3 {
    public static void main(String[] args) {
        //создаем массив m1
        //int[] m1 = new int[36];
        int num = new Random().nextInt(0, 255); //число, для которого надо найти кратные
        System.out.println(num);

        for (int i = 1; i < Short.MAX_VALUE; i++) {
            if (i % num == 0) {   //находим все кратные для числа num
                System.out.println(i);
                int [] m1 = new int[i];
                System.out.print(m1);} // выходят хеши, не понимаю, что с этим делать и, как по нормальному сохранить в массив 
            }

        }
    }

