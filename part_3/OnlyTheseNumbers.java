// The exercise template contains a base that reads numbers from the user and adds them to a list. 
// Reading is stopped once the user enters the number -1.
//
// Expand the program to ask for a start and end indices once it has finished asking for numbers. 
// After this the program shall prints all the numbers in the list that fall in the specified range (between the indices given by the user, inclusive). 
// You may assume that the user gives indices that match some numbers in the list.

package part_3;

import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        
        while(true){
            System.out.print("Input a number: ");
            int number = Integer.valueOf(scanner.nextLine());
            if(number==-1) break;
            numbers.add(number);
        }

        System.out.print("From where?");
        int start = Integer.valueOf(scanner.nextLine());
        System.out.print("To where?");
        int end = Integer.valueOf(scanner.nextLine());
        scanner.close();

        for(int i=start; i<=end; i++){
            System.out.println(numbers.get(i));
        }
    }
}
