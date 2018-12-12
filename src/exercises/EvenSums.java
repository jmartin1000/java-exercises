package exercises;

public class EvenSums {
    public static void main(String[] args){
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for(int number : numbers){
            if( (number % 2) == 0) {
                System.out.println("adding " + number + " to the sum");
                sum = sum + number;
            } else {
                System.out.println(number + " is odd; omitting it from sum");
            }
        }
        System.out.println("the sum of the numbers is " + sum);
    }
}
