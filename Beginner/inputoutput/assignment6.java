/*You're going to write some code to help you cook a gorgeous lasagna from your favorite cookbook.
Now, you want to also add few layers to the lasagna. Assume each layer takes 2 minutes to prepare.

Given the number of layers you want to add to the lasagna, find how many minutes you would spend making them. */

package Beginner.inputoutput;
import java.util.*;;

public class assignment6 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        System.out.print(min*2);
    }
    
}
