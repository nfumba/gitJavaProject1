package org.example.coding.tasks;

public class Question8 {
    public static void main(String[] args) {
        int[] array = {12, 45, 7, 23, 56, 89, 34, 1, 6, 8};

        int max = array[0];
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            } else if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("Maximum number in the array: " + max);
        System.out.println("Minimum number in the array: " + min);
    }
}

