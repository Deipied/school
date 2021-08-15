public class AndOp //class name acceptance
{
  public static void main(String[] args) //user input for the two float/double
  {
    double firstValue = Double.parseDouble(args[0]); // assigns firstValue and converts user input of str to a double
    double secondValue = Double.parseDouble(args[1]); // assigns secondValue and converts user input of str to a double

    if (0 < firstValue && firstValue< 1) { //First if statement that makes firstValue equal to int 1 if it meets the conditions, else it is equal to int 0
      firstValue = 1;
    }
    else firstValue = 0;

    if (0 < secondValue && secondValue< 1) //Secoind if statement that makes second Value equal to int 1 if it meets the conditions, else it is equal to int 0
    {
      secondValue = 1; 
    }
    else firstValue = 0;

    if (firstValue == 1 && secondValue == 1) { //Last if statement that compares the given values of both values either 1 or 0, 1 implies that value is within the given condition, so having both equal to one would print true and else false.
      System.out.println("true");
    }
    else System.out.println("false");
  } 
}