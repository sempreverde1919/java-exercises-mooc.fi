// The exercise template contains a base that reads numbers from the user and adds them to a list. 
// Reading is stopped once the user enters the number -1.
//
// Continue developing the program so that it finds the greatest number in the list and prints its value after reading all the numbers. 

package part_3;

import java.util.Scanner;
import java.util.ArrayList;

public class GreatestInList{
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
        int greatest = numbers.get(0);
        for(int i = 0; i < numbers.size(); i++){
            if(greatest < numbers.get(i)) greatest = numbers.get(i);
        }
        System.out.println("The greatest number: " + greatest);
    }
}