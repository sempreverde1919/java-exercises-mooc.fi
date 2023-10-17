// Part 1.: Define a method called printStars that prints the given number of stars and a line break.
//
// Part 2.: Define a method called printSquare(int size) that prints a suitable square with the help of the printStars method. 
//
// Part 3.: Write a method called printRectangle(int width, int height) that prints the correct rectangle by using the printStars method. 
//
// Part 4.: Create a method called printTriangle(int size) that prints a triangle by using the printStars method.

public class StarSign {
    public static void main(String[] args) {
        printStars(5);
        printStars(3);
        printStars(9);
        System.out.println();
        printSquare(4);
        System.out.println();
        printRectangle(17, 3);
        System.out.println();
        printTriangle(4);
    }
    public static void printStars(int number) {
        for(int i = 0; i < number; i++){
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printSquare(int size){
        for(int i = 0; i < size; i++){
            printStars(size);
        }
    }

    public static void printRectangle(int width, int height){
        for(int i = 0; i < height; i++){
            printStars(width);
        }
    }

    public static void printTriangle(int size){
        for(int i = 0; i <= size; i++){
            printStars(i);
        }
    }

}
