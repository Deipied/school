public class Square{
    //Private variables for the upper left coordinates and side length of square
    private final double x0, y0, length0;

    //Constructor, assigns values passed to it to the private variables
    public Square(double x, double y, double length){
        x0 = x;
        y0 = y;
        length0 = length;
    }
    
    //Returns the area of a square of side length a
    public double area(Square a){
        return length0*length0;
    }

    //Returns the perimater of a square of side length a
    public double perimeter(Square a){
        return length0*4;
    }

    //Returns true if square b intersects square a, and false otherwise
    public boolean intersects(Square a, Square b){
        double xamax = a.x0 + a.length0; // max x value for a
        double xamin = a.x0; // min x value for a
        double yamax = a.y0; // max y value for a
        double yamin = a.y0 - a.length0; // min y value for a
        double xbmax = b.x0 + b.length0; // max x value for b
        double xbmin = b.x0; // min x value for b
        double ybmax = b.y0; // max y value for b
        double ybmin = b.y0 - b.length0; // min y value for b
        
        //If b contains a, then they do not intersect
        if (b.contains(a, b) == true){
            return false;
        }
        else if (xamax >= xbmin && xamax <= xbmax){
            if (yamin >= ybmin && yamin <= ybmax){
                return true;
            }
            else if (yamax >= ybmin && yamax <= ybmax){ 
                return true;
            }
            else {
                return false;
            }
        }
        else if (xamin >= xbmin && xamin <= xbmax){
            if (yamin >= ybmin && yamin <= ybmax){
                return true;
            }
            else if (yamax >= ybmin && yamax <= ybmax){
                return true;
            }
            else {
                return false;
            }
        }
        else{
            return false;
        }
    }

    //Returns true if square b is contained within square a without overlap, and false otherwise
    public boolean contains(Square a, Square b){
        double xamax = a.x0 + a.length0; // max x value for a
        double xamin = a.x0; // min x value for a
        double yamax = a.y0; // max y value for a
        double yamin = a.y0 - a.length0; // min y value for a
        double xbmax = b.x0 + b.length0; // max x value for b
        double xbmin = b.x0; // min x value for b
        double ybmax = b.y0; // max y value for b
        double ybmin = b.y0 - b.length0; // min y value for b
        if (xamin > xbmin && xamax < xbmax && yamin > ybmin && yamax < ybmax){
            return true;
        }
        else {
            return false;
        }
    }

    //Main method
    public static void main(String[] args){
        //Get the values for the first square from command line arguments into xa,ya,lenghta double variables
        double xa = Double.parseDouble(args[0]);
        double ya = Double.parseDouble(args[1]);
        double lengtha = Double.parseDouble(args[2]);
        
        //Create a square object a using values stored in xa,ya,lengtha variables
        Square a = new Square(xa, ya, lengtha);
        
        //Call area and perimeter methods to print area and perimeter of square a
        StdOut.println("The area is " + a.area(a));
        StdOut.println("The perimter is " + a.perimeter(a));
        double xb = 0.0; // Initializes upper left x coordinate for square b
        double yb = 0.0; // Initializes upper left y coordinate for square b
        double lengthb = 0.0; // Initializes side length of square b
        double xmax = 0.0; // Initializes xmax for scaling square drawing
        double ymax = 0.0; // Initializes ymax for scaling square drawing
        
        //Loop to read doubles from StdIn until lengthb has been assigned a value other than 0.0
        while (lengthb == 0.0){
            StdOut.print("Enter the upper-left coordinates and the length of a square: ");
            xb = StdIn.readDouble();
            yb = StdIn.readDouble();
            lengthb = StdIn.readDouble();
        }

        //Create a square object b using values stored in xb,yb,lengthb variables
        Square b = new Square(xb, yb, lengthb);
        //Call intersects() to check if b intersects a
        if (b.intersects(a, b) == true){
            StdOut.println("It intersects the first square.");
        }
        else {
            StdOut.println("It does not intersect the first square.");
        }
        //Call contains() to check if b contains a
        if (b.contains(a, b) == true){
            StdOut.println("It contains the first square.");
        }
        else {
            StdOut.println("It does not contain the first square");
        }
        
        //Set the canvas size to 500 x 500
        StdDraw.setCanvasSize(500, 500);
        if (Math.abs(xa) > xmax){
            xmax = Math.abs(xa); // Assigns xmax to highest absolute value of either square's x coordinates
        }
        if (Math.abs(xb) > xmax){
            xmax = Math.abs(xb); // Assigns xmax to highest absolute value of either square's x coordinates
        }
        if (Math.abs(xa + lengtha) > xmax){ 
            xmax = Math.abs(xa + lengtha); // Assigns xmax to highest absolute value of either square's x coordinates
        }
        if (Math.abs(xb + lengthb) > xmax){
            xmax = Math.abs(xb + lengthb); // Assigns xmax to highest absolute value of either square's x coordinates
        }

        //Adjust the X scale to ensure both squares are fully visible in the drawing
        StdDraw.setXscale((-1)*xmax-1, xmax +1);
        if (Math.abs(ya) > ymax){
            ymax = Math.abs(ya); // Assigns ymax to highest absolute value of either square's y coordinates
        }
        if (Math.abs(yb) > ymax){
            ymax = Math.abs(yb); // Assigns ymax to highest absolute value of either square's y coordinates
        }
        if (Math.abs(ya - lengtha) > xmax){
            ymax = Math.abs(ya - lengtha); //Assigns ymax to highest absolute value of either square's y coordinates
        }
        if (Math.abs(yb - lengthb) > xmax){
            ymax = Math.abs(yb - lengthb); //Assigns ymax to highest absolute value of either square's y coordinates
        }

        //Adjust the Y scale to ensure both squares are fully visible in the drawing
        StdDraw.setYscale((-1)*xmax-1, xmax +1);
        //Draw square a
        StdDraw.square(xa + lengtha/2, ya - lengtha/2, lengtha/2);
        //Draw square b
        StdDraw.square(xb + lengthb/2, yb - lengthb/2, lengthb/2);
    } //end of main method
}