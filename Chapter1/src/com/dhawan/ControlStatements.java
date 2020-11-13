package com.dhawan;

public class ControlStatements {

    public static int forEach(int [] numbers){
        int sum = 0;
        for(int x : numbers){
            System.out.println("Value is " + x);
            sum += x;
        }
        return sum;
    }

    public static int forEachLimited(int[] numbers){
        int sum = 0;
        for(int x : numbers){
            System.out.println("Value is " + x);
            sum += x;
            if (x == 5){
                break;
            }
        }
        return sum;
    }

    public static void search(int[] searchNumbers, int val){
        boolean found = false;

        for(int x : searchNumbers){
            if (x == val){
                found = true;
                break;
            }
        }

        if (found){
            System.out.println("Value is found");
        }
    }



}
