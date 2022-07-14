// Given two names A and B as input. Print "A says Hi to B". where A and B are the names in input.


package Beginner.inputoutput;

import java.util.Scanner;

public class assignment1 {
    public static void main(String [] args){
        System.out.println("Please enter the names");
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        System.out.println(A+ " says hi to " + B);

    }    
}
