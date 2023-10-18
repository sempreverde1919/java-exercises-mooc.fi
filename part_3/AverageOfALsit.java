// The exercise template contains a base that reads numbers from the user and adds them to a list. 
// Reading is stopped once the user enters the number -1.
// 
// When reading ends, calculate the average of the numbers in it, and then print that value.

package part_3;

import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfALsit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while(true){
            System.out.print("Input a number: ");
            int number = Integer.valueOf(scanner.nextLine());
            if(number == -1) break;
            numbers.add(number);
        }
        scanner.close();
        int sum = 0;
        for(int num : numbers){
            sum += num;
        }
        int avg = sum / numbers.size();
        System.out.println("Average: " + avg);
    }
}
