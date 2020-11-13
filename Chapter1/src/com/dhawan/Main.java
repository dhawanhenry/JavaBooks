package com.dhawan;

public class Main {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Sum of all the elements " + ControlStatements.forEach(nums));
        System.out.println("Sum of the first 5 elements " + ControlStatements.forEachLimited(nums));
        int[] searchNumbers = {91, 25, 30, 46, 35, 66, 47, 28, 19};
        int value = 30;
        ControlStatements.search(searchNumbers, value);

        for (int i = 0; i < 10; i++){
            System.out.print(i + " ");
            if (i % 2 == 0){
                continue;
            }
            System.out.println("");
        }
    }
}
