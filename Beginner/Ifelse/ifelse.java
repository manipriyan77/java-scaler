package Beginner.Ifelse;

import java.util.Scanner;

public class ifelse {
    public static void main(String[] args){
        System.out.println("Please enter your age");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>=18){
            System.out.println("You are eligible for voting");
        }else{
            System.out.println("You are not eligible for voting");
        }
    }
}
