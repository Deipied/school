// opens the class Point
public class Point{ 
//declare and assign x,y,z to private double values which is our wanted Point data type
  private double x;
  private double y;
  private double z;
  
  // this creates the Point constructor with 3 values x,y,z
  public Point(double x, double y, double z){ 
    //assign the three values to this for the constructor
    this.x = x;
    this.y = y;
    this.z = z;
  }
  
  // creates the distanceTo method which takes in the difference of the 3 sets of coordinates and then takes the sqrt of the sum to calculate the euclidean distance
  public double distanceTo(Point that){ 
    //calculates the differences in the 2 x coordinates and stores in diffx
    double diffx = this.x - that.x;
    //calculates the differences in the 2 y coordinates and stores in diffy
    double diffy = this.y - that.y;
    //calculates the differences in the 2 z coordinates and stores in diffz
    double diffz = this.z - that.z;
    //calculates the sqrt of the the sum of the squared differences
    return Math.sqrt(diffx * diffx + diffy * diffy + diffz * diffz);
  } 

  //creates method that formats the coordinates in the desired format
  public String toString(){
    //returns as a string in (x,y,z) format
    return "(" + x + "," + " " + y + "," + " " + z + ")";
  } 

  // this is the main method that takes in CLI and uses the other methods and contructors
  public static void main(String[] args){ 
    // this assigns and accepts the 6 values and formats them to double
    double a = Double.parseDouble(args[0]);
    double b = Double.parseDouble(args[1]);
    double c = Double.parseDouble(args[2]);
    double d = Double.parseDouble(args[3]);
    double e = Double.parseDouble(args[4]);
    double f = Double.parseDouble(args[5]);
    //assign first for the coordinates of the first 3 inputs
    Point first = new Point(a, b, c);
    // assign second for the coordinates of the second 3 inputs
    Point second = new Point(d, e, f);
    //print statement desired in output for the first part
    StdOut.println("The first point is " + first);
    //print statement desired in output for the second part
    StdOut.println("The second point is " + second);
    //print statement desired in output for the euclidean distance, made it to two decimals places since thats what the example in the directions shows. 
    StdOut.printf("Their Euclidean distance is %.2f", first.distanceTo(second));
  } 
} 