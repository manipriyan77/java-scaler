package Beginner.inputoutput;

import java.util.Scanner;

public class input {
    public static void main(String[] args){
        // To get a input from user use scanner
        Scanner sc = new Scanner(System.in);
        // use the variable naming and datatype to store the input value
        int n = sc.nextInt();
        // to print the output
        System.out.println("Your input is "+n);
    }
}
