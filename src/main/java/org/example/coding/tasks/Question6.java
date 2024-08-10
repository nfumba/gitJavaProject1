package org.example.coding.tasks;

public class Question6 {
    public static void main(String[] args) {
        int number =7;
        boolean isPrime=true;

        for (int i =1; i<number; i++ ){
            if(number%i==0){
                isPrime=false;
            }
        }
        System.out.println(isPrime);
    }
}
