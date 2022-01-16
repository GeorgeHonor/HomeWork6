package ru.skypro;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = generateRandomArray();

    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        //System.out.print(Arrays.toString(arr));

        {
            //Ex.№1
            System.out.println();
            int sum = 0;
            for (int element : arr) {
            sum = sum + element;
            }
            System.out.println("Сумма трат за месяц составила " + sum + " рублей");
            }

            //Ex.№2
            int min = arr[0];
            int max = arr[0];
          for (int arrs : arr) {
            if (arrs < min) {
                min = arrs;
            }
            if (arrs > max) {
                max = arrs;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей");

        //Ex.№3
        int sum = 0;
        for (int element : arr) {
            sum = sum + element;
        }
        float avg = 0;
        avg = sum / (float) arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + avg + " рублей");



        //Ex.№4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i-- ) {
            System.out.print(reverseFullName[i]);
        }
            return arr;}





    }















