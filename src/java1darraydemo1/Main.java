/*
 * Shankar Ghimire
 * StudentId:991585190
 * Course: ...............
 */
package java1darraydemo1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num[] = new int[5];
        //input to the array
        System.out.println("Enter any 5 numbers : ");
        for(int i = 0; i < num.length; i++){
            num[i] = scanner.nextInt();
        }
        //display array elements
        System.out.println("The numbers are : ");
        for(int i = 0; i < num.length; i++){
            System.out.println("  " + num[i]);
        }
    }
    
}
