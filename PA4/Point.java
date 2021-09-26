// public class Point
// { //OPEN CLASS
// //DECLARE 3 PRIVATE VARIABLES FOR HOLDING COORDINATES OF THE POINT
// private double x;
// private double y;
// private double z;
// public Point(double x, double y, double z)
// { //OPEN POINT CONSTRUCTOR
// //ASSIGNS THE 3 VALUES TO PRIVATE x, y, AND z
// this.x = x;
// this.y = y;
// this.z = z;
// } //CLOSE POINT CONSTRUCTOR
// public double distanceTo(Point q)
// { //OPEN distanceTo METHOD
// //COMPUTES THE DIFFERENCE BETWEEN x COORDINATES, STORES DIFFERENCE IN
// dx
// double dx = this.x - q.x;
// //COMPUTES THE DIFFERENCE BETWEEN y COORDINATES, STORES DIFFERENCE IN
// dy
// double dy = this.y - q.y;
// //COMPUTES THE DIFFERENCE BETWEEN z COORDINATES, STORES DIFFERENCE IN
// dz
// double dz = this.z - q.z;
// //RETURNS THE SQUARE ROOT OF THE SUM OF THE PRODUCTS
// return Math.sqrt(dx * dx + dy * dy + dz * dz);
// } //CLOSE distanceTo
// public String toString()
// { //OPEN toString METHOD
// //RETURNS STRING IN x, y, z FORMAT
// return "(" + x + "," + " " + y + "," + " " + z + ")";
// } //CLOSE toString METHOD
// public static void main(String[] args)
// { //OPEN MAIN
// //GETS AND STORES COMMAND LINE ARGUMENT INPUTS
// double a = Double.parseDouble(args[0]);
// double b = Double.parseDouble(args[1]);
// double c = Double.parseDouble(args[2]);
// double d = Double.parseDouble(args[3]);
// double e = Double.parseDouble(args[4]);
// double f = Double.parseDouble(args[5]);
// //CREATES POINTS t AND w. ASSIGNS (a, b, c) TO t AND (d, e, f) TO w
// Point t = new Point(a, b, c);
// Point w = new Point(d, e, f);
// //PRINTS THE FIRST POINT
// StdOut.println("The first point is " + t);
// //PRINTS THE SECOND POINT
// StdOut.println("The second point is " + w);
// //PRINTS THE DIFFERENCE BETWEEN THE FIRST AND SECOND POINT COORDINATES
// StdOut.printf("Their Euclidean distance is %.3f", t.distanceTo(w));
// } //CLOSE MAIN
// } //CLOSE CLASS