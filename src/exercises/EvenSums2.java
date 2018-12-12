package exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class EvenSums2 {
    public static void main(String[] args){
        Integer[] nums = {1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(nums));
        int sum = 0;
        for (int number:numbers) {
            if ((number % 2) == 0){
                sum = sum + number;
            }
        }
        System.out.println("the sum of the even numbers is " + sum);
    }
}
