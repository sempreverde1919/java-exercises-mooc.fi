// The exercise template contains a base that reads numbers from the user and adds them to a list. 
// Reading is stopped once the user enters the number -1.
// 
// Modify the program so that after reading the numbers it calculates and prints the sum of the numbers in the list.

package part_3;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfAList {
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
        System.out.println("Sum: " + sum);
    }
        
}
