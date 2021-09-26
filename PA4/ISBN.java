// first establish the public class ISBN
public class ISBN{
  // next I define the main method that takes in the command line argument and outputs the desired string
  public static void main(String[] args){
    // this defines input to be the command line input in a string type
    String input = args[0];
    // this defines the value of the checksum function to be a string output of digit
    String digit = checkSum(input);
    // this is the print function and the desired outcome format of our string
    System.out.println("The ISBN number would be " + input + digit);
  }
  // this method is to define what happens in the checkSum and takes in input
  public static String checkSum(String input){
    // first define checksum int variable and equal to 0
    int checksum = 0;
    // creates a for loop that cycles through the input and gets the total sum of the 9 input digits
    for (int i = 1; i <= input.length(); i++){
      checksum += (11-i) * (input.charAt(i-1) - '0');
    }
    // this is the portion that checks to see if we need 10 to get a multiple of 11, which would be denoted by X
    if (checksum % 11 == 1){
      return "X";
    }
    // next check is to see if it already is a multiple of 11 and needs a 0
    else if (checksum % 11 == 0){
      return "0";
    }
    // last check if its not a multiple of 11 or needs to be 10. It takes the total sum of 9 modulus 11 and then substracts that to 11 to find the appropriate remainder to be the checksum
    else {
      return Integer.toString((11 - (checksum % 11)));
    }
  }
}