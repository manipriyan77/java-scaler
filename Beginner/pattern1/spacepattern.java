package Beginner.pattern1;

import java.util.Scanner;

public class spacepattern {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print("*");
            for(int j=1;j<=n-1;j++){
                System.out.print("_");
            }
            System.out.print("*");
            System.out.println();
        }
    }
}
