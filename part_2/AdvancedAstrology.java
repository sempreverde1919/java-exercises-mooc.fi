// Part 1.: Define a method called printSpaces(int number) that produces the number of spaces specified by number. 
//          The method does not print the line break.
// Part 2.: Create a method called printTriangle(int size) that uses printSpaces and printStars to print the correct triangle.
//
// Part 3.: Define a method called christmasTree(int height) that prints the correct Christmas tree. 
//          The Christmas tree consists of a triangle with the specified height as well as the base. 
//          The base is two stars high and three stars wide, and is placed at the center of the triangle's bottom. 
//          The tree is to be constructed by using the methods printSpaces and printStars.

public class AdvancedAstrology {
    public static void main(String[] args) {
        printTriangle(4);
        System.out.println();
        christmasTree(10);
    }

    public static void printSpaces(int number){
        for(int i=0; i < number; i++){
            System.out.print(" ");
        }
    }
    public static void printStars(int number) {
        for(int i = 0; i < number; i++){
            System.out.print("*");
        }
        System.out.println();
    }
    public static void printTriangle(int size){
        for(int i=1; i <= size; i++){
            printSpaces(size-i);
            printStars(i);
        }
    }
    public static void christmasTree(int height){
        if(height>3){
            for(int i=1; i<=height; i++){
                printSpaces(height-i);
                printStars(i+i-1);
            }
            for(int i=1; i<=2; i++){
                printSpaces((height + height-3)/2);
                printStars(3);
            }
        }else{
            System.out.println("Too low!");
        }
    }
}
