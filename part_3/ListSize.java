// In the exercise template is a program that reads input from the user. 
// Modify its working so that when the program quits reading, the program prints the number of values on the list.

package part_3;

import java.util.Scanner;
import java.util.ArrayList;

public class ListSize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        
        while(true){
            System.out.print("Input a string: ");
            String input = scanner.nextLine();
            if(input.equals("")) break;
            list.add(input);
        }
        scanner.close();
        System.out.println("In total: " + list.size());


    }
}
