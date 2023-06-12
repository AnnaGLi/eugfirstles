
//Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
package org.example;

import java.util.Random;

import static java.lang.Integer.*;

public class Main {
    public static void main(String[] args) {
        int i = new Random().nextInt(0, 2000);
        System.out.println(i);
        int n = numberOfLeadingZeros(i);
        System.out.println(n);
    }
}
