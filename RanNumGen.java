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
  // assign min and max values to one and as you compare change the values
  int maximumValue = 0;
  int minimumValue = 100;
  // Make a while loop that creates and adds to randomNumbers equal to howManyNumbers
  while (howManyNumbers > 0) 
  {
    int random = (int)(Math.random() * 100); //assign random to a integer value between 0 and 1 but multiplied by a 100 and then converted to an integer
    if (random > maximumValue)
      { //if statement that assigns maximum value as it loops
        maximumValue = random;
      }
    if (random < minimumValue)
      { //if statement that assigns minimum value as it loops
        minimumValue = random;
      }
    System.out.print(random + " "); // prints out on the CLI the random numbers based on user input adding the space allows you to print on the same line and separate.
    howManyNumbers -= 1; //having this stops the while loop, otherwise it will continue on forever
  }
  System.out.println("\n"); //makes a new line so that it doesn't print on the same line as the 
  System.out.println("The maximum value is " + maximumValue); //prints out the maximum
  System.out.println("The minimum value is " + minimumValue); //prints out the minimum
  }
}
