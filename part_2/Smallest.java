// Define a two-parameter method smallest that returns the smaller of the two numbers passed to it as parameters.

public class Smallest {
    public static void main(String[] args) {
        int answer =  smallest(2, 7);
        System.out.println("Smallest: " + answer);
    }
    public static int smallest(int number1, int number2) {
        return number1>number2 ? number2 : number1;
    }
}
