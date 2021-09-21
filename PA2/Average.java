import StdIn;
import StdOut;

package PA2;
// open the class Average
public class Average{
  // calling and creating the main method
  public static void main(String[] args) {
    // takes command line user input int for number of name and number sets
    int n = Integer.parseInt(args[0]);
    // declares name as the name input and allocates to array
    String[] name = new String[n];
    // creates a new array values with 3 numbers of inputs
    int[][] values = new int[n][3];
    // initial counter variable established
    int counter = 0;
    // while loop to take the user command line input and counts based on the n input
    while (counter < n){
      // takes the first standard input of the name and assigns the first value
      name[counter] = StdIn.readString();
      // establish a second counter that counts to 3 for every number
      int numCounter = 0;
      // since there are 3 numbers following the name we use a while loop to count to 3
      while (numCounter < 3){
        // during the numCounter, we assign the 3 values, with the counter and 3 numcounters per values array
        values[counter][numCounter] = StdIn.readInt();
        // adds to numCounter so it can count up to 3
        numCounter++;
      }
      // counts up by 1 so that it can fill up our array until it equals int n
      counter++;
    }
    // prints to a new line
    StdOut.println();
    // the printing for loop based on i with respect to n (user input)
    for (int i = 0;i < n;i++){
      // prints out the name array value at index i
      System.out.print(name[i]);
      // establishes ave as a float value of 2 decimnal places
      float ave=0.00f;
      // nested for loop to print out each number proceeding the name
      for(int j=0;j<3;j++){
        // calculates a runnning average
        ave = values[i][j]+ave;
        // prints a space and then the number value
        System.out.print(" "+values[i][j]);
      }
    // prints the standard output of the average of the three numbers
    StdOut.printf("%6.2f", ave /3);
    // prints to a new line so that next iteration of the loop it prints to a new line
    StdOut.println();
    }
  }
}