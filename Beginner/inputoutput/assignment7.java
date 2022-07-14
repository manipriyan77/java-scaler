/*You're going to write some code to help you cook a gorgeous lasagna from your favorite cookbook.
Now, you want to find the total number of minutes you've been cooking, or the sum of your preparation time and the time the lasagna has already spent baking in the oven.

Given the number of layers added to the lasagna and the number of minutes the lasagna has been baking in the oven, find the total elapsed cooking time (prep + bake) in minutes. */
package Beginner.inputoutput;
import java.util.*;
public class assignment7 {
    public static void main(String[]args){
        Scanner value = new Scanner(System.in);
        int min = value.nextInt();
        int bake = value.nextInt();
        System.out.print((min*2)+bake);
    }
    
}
