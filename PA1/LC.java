public class LC //sets up the class LC
{
  public static void main(String[] args) { //initial set up which is expected after class LC
    int count = 1; //initializing a count so that it can indicate new lines once you count every 10
    for (int i=1; i <= 100; i++) { //the for loop that starts from 1 and continues until it equal to 100 adding 1 at a time.
      if(count < 10) { //If statement that prints while the count is less than 10
        System.out.print(i + " "); // prints the number plus a space so that it can be separated by each line
        count++; //adds one to the count every number
        continue; //allows the break of one interation and it continues to the next one
      }
      count = 1; //returns the count back to 1 so that it can start counting again
      System.out.println(i + " "); //this will allow to print to a new line
    }
  }
}