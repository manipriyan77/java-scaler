// Given two numbers A and B. Print A+B, A*B, A-B, A/B in the same order.

package Beginner.inputoutput;

import java.util.Scanner;

public class assignment4 {
    public static void main(String [] args){
        System.out.println("Please enter the values A and B");
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println((A+B)+" ," +(A*B)+" ," + (A-B) +" ," +(A/B));
                
    }
}
