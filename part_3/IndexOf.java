// The exercise template contains a base that reads numbers from the user and adds them to a list. 
// Reading is stopped once the user enters the number -1.
// 
// Expand the program by adding a functionality that asks the user for a number, and reports that number's index in the list. 
//If the number is not found, the program should not print anything.

package part_3;

import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while(true){
            System.out.print("Input a number: ");
            int number = Integer.valueOf(scanner.nextLine());
            if(number == -1) break;
            numbers.add(number);
        }

        System.out.print("Search for? ");
        int searchedNum = Integer.valueOf(scanner.nextLine());
        scanner.close();
        for(int i=0; i<numbers.size(); i++){
            if(searchedNum == numbers.get(i)){
                System.out.println(searchedNum + " is at index " + i);
            }
        }
    }    
}
