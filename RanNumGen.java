// Programming Assignment 1: Rannum Gen
// import the Java Math library
import java.lang.Math;
// declare public class of name file
public class RanNumGen
{
// Allow a user input command-line argument
  public static void main(String[] args)
{
// making the user input of # of random numbers a int and assigning it a variable
int howManyNumbers = Integer.parseInt(args[0]);
// assign a empty int array that will hold the random numbers
int[] randomNumbers;
// Make a while loop that creates and adds to randomNumbers equal to howManyNumbers
while (howManyNumbers > 0) {
  int random = (int)(Math.random() * 100)
  System.out.println(random)
}
int maximumValue =
int minimumValue = 
System.out.println("The maximum value is ");
System.out.println("The minimum value is " + )
}
}
