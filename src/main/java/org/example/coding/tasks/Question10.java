package org.example.coding.tasks;

public class Question10 {
    public static void main(String[] args) {

        String[] colors={"green","red","blue","red"};

        for (int i = 0; i < colors.length; i++) {
            for (int j = i+1; j < colors.length; j++) {
                if(colors[i].equals(colors[j])&& i!=j){
                    System.out.println(colors[i]);
                }

            }
        }


    }
}

