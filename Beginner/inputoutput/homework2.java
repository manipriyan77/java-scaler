// Given 5 numbers A, B, C, D, E as input. Print the average of these 5 numbers (correct up to 2 decimal places).


package Beginner.inputoutput;
import java.util.*;
public class homework2 {
    public static void main(String[]args){
        Scanner value = new Scanner(System.in);
        // int value1 = value.nextInt();
        // int value2 = value.nextInt();
        // int value3 = value.nextInt();
        // int value4 = value.nextInt();
        // int value5 = value.nextInt();
        // double avg = (value1+value2+value3+value4+value5)/5.0;

       float value1 = value.nextInt();
        float value2 = value.nextInt();
        float value3 = value.nextInt();
        float value4 = value.nextInt();
        float value5 = value.nextInt();
        float avg = (value1+value2+value3+value4+value5)/5;


        System.out.printf("%.2f", avg);
    }
}
