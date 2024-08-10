package org.example.coding.tasks;

public class Question1 {
    public static void main(String[] args) {
        int[] temps={90,105,45,100,110,98};
        int largest=temps[0];
        int smallest=temps[0];
        for(int i = 0; i< temps.length; i++){
            if(temps[i]>largest){
                largest=temps[i];
            }
            if(temps[i]<smallest){
                smallest=temps[i];
            }
        }
        System.out.println(largest);
        System.out.println(smallest);
    }
}
