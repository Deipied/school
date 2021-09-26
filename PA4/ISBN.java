public class ISBN{
  public static void main(String[] args){
    
    String input = args[0];

    String digit = checkSum(input);

    System.out.println("The ISBN number would be " + input + digit);
  }

  public static String checkSum(String input){

    int checksum = 0

    for (int i = 1; i <= input.length(); i++){
      checksum += (11-i) * (input.charAt(i-1) - '0');
    }

    //if checksum modulo 11 is 1 then return X
    if (checksum % 11 == 1) return "X";
    //else return if checksum modulo 11 is 0 return 0
    else if (checksum % 11 == 0) return "0";
    //else return (11 - checksum module 11) as a string
    else return Integer.toString((11 - (checksum % 11)));
  }
}