// In the exercise template there is a program that reads integers from the user and adds them to a list.
// This ends when the user enters 0. 
// The program then prints the first value on the list.
//
// Modify the program so that instead of the first value, the program prints the sum of the second and third numbers.
// The program is allowed to malfunction if there are fewer than three entries on the list, so you don't need to prepare for such an event at all.

package part_3;

import java.util.Scanner;
import java.util.ArrayList;

public class SecondPlusThird {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while(true){
            System.out.print("Input an integer: ");
            int input = scanner.nextInt();
            if(input==0) break;
            list.add(input);
        }
        scanner.close();
        System.out.println(list.get(1)+list.get(2));
    }
}
