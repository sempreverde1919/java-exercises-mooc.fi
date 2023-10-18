// Write a program that reads numbers from the user. 
// When number 9999 is entered, the reading process stops. 
// After this the program will print the smallest number in the list, 
// and also the indices where that number is found. 
// Notice: the smallest number can appear multiple times in the list.

package part_3;

import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while(true){
            System.out.print("Input a number: ");
            int number = Integer.valueOf(scanner.nextLine());
            if(number == 9999) break;
            numbers.add(number);
        }
        scanner.close();
        int smallest = numbers.get(0);
        int smallestIndex = 0;
        for(int i = 0; i < numbers.size(); i++){
            if(smallest > numbers.get(i)) {
                smallest = numbers.get(i);
                smallestIndex = i;
            }
        }
        System.out.println("Smallest number: " + smallest);
        System.out.println("Find at index: " + smallestIndex);
    }
}