// opens the class TriangularTest as required by java
public class TriangularTest{
    // the main part of the code that executes first
    public static void main(String[] args){
        // declare 3 int inputs as a,b,c respectively 
        int a = Integer.parseInt(args[0]); 
        int b = Integer.parseInt(args[1]); 
        int c = Integer.parseInt(args[2]);
        // if else statement that calls the Triangular method to see if the method returns true
        // true if its a triangle, else if not 
        if (IsTriangular(a, b, c) == true)
            System.out.println("True"); 
        else 
            System.out.println("False");
    }
    // a static class creation for checking the 3 inputs to see if it can make a triangle
    public static boolean IsTriangular(int a, int b, int c){
        // since the sum of every combination of sides must be greater than the third this is how it is set up
        // returns true for meeting the conditions, else it is false
        if ((a + b > c) && (c + a > b) && (b + c > a))  
            return true; 
        else 
            return false; 
    }
}