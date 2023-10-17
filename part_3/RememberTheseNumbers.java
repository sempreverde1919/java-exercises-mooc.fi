// The exercise template contains a base that reads numbers from the user and adds them to a list. 
// Reading is stopped once the user enters the number -1.
//
// Expand the functionality of the program so that after reading the numbers, 
// it prints all the numbers received from the user. 
// The number used to indicate stopping should not be printed.

package part_3;

import java.util.ArrayList;
import java.util.Scanner;

public class RememberTheseNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        
        while(true){
            System.out.print("Input a number: ");
            int number = Integer.valueOf(scanner.nextLine());
            if(number==-1) break;
            numbers.add(number);
        }
        scanner.close();
        for(int i=0; i<numbers.size(); i++){
            System.out.println(numbers.get(i));
        }
    }
}
