import javax.swing.plaf.TreeUI;

public class TriangularTest{
    public static void main(String[] args){
        int a = Integer.parseInt(args[0]); 
        int b = Integer.parseInt(args[1]); 
        int c = Integer.parseInt(args[2]); 
        if (Triangular(a, b, c) == true)
            System.out.println("True"); 
        else 
            System.out.println("False");
    }

    public static boolean Triangular(int a, int b, int c){
        if ((a + b > c) && (c + a > b) && (b + c > a))  
            return true; 
        else 
            return false; 
    }
}