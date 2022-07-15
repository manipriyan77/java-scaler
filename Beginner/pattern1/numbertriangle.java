/*
 * 
 1

1_

1_3

1_3_

1_3_5
 */
package Beginner.pattern1;

import java.util.Scanner;

public class numbertriangle {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i-1+1;j++){
                if( j%2!=0){
                    System.out.print(j);
                }else{
                    System.out.print("_");
                }
            }
            System.out.println();
        }
    }
}
