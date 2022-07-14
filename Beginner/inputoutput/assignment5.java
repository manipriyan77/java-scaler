/*You're going to write some code to help you cook a gorgeous lasagna from your favorite cookbook.
According to your cookbook, the Lasagna should be in the oven for 40 minutes:
Given the actual minutes the lasagna has been in the oven, find how many minutes the lasagna still needs to bake. */
package Beginner.inputoutput;

import java.util.Scanner;

public class assignment5 {
    public static void main(String [] args){
    System.out.println("Please enter the minutes in oven");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(40-n);
    
    
    }
}
