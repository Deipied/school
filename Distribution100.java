<<<<<<< HEAD
// open the class Distribution100
public class Distribution100 {
    // calling and creating the main method
    public static void main(String[] args) {
        // stores the length of the user input in arrayLength
        int arrayLength = Integer.parseInt(args[0]);
        // creates a new int array distributionList with the length based on arrayLength
        int[] distributionList = new int [arrayLength];
        // assign two variables that count the int in the array, bigCount for >50, and smallCount for <= 50.
        int bigCount = 0;
        int smallCount = 0;
        // a for loop that iterates through the distributionList once
        for (int i = 0; i < arrayLength; i++){
            // increases the bigCount value when index i in distribution list is <= 100 and > 50
            if (distributionList[i] <= 100 && distributionList[i] > 50){
                bigCount++;
            // increases the smallCount value, when >=1 and <= 50
            } else if (distributionList[i] >= 1 && distributionList[i] <= 50){
                smallCount++;
            }
        }
        // ending print statement outputs that show smallCount and bigCount.
        System.out.println( smallCount + " entered are less than or equal to 50.");
        System.out.println( bigCount + " entered are greater than 50.");
    }
=======
// open the class RelativelyPrimeArray
public class Distribution100{
  // calling and creating the main method
  public static void main(String[] args) {
    // assign two variables that count the int in the array, bigCount for >50, and smallCount for <= 50.
    int bigCount = 0;
    int smallCount = 0;
    // an if statement that allows for a loop if there is a non-empty using command line input
    if (args.length > 0){  
      // a for loop that iterates through the user input once based on length
      for (int i = 0; i < args.length; i++){
          // increases the bigCount value when index i in user input is <= 100 and > 50
          if (Integer.parseInt(args[i]) <= 100 && Integer.parseInt(args[i]) > 50){
              bigCount++;
          // increases the smallCount value, when user input is >=1 and <= 50
          } else if (Integer.parseInt(args[i]) >= 1 && Integer.parseInt(args[i]) <= 50){
              smallCount++;
          }
      }
    }
    // ending print statement outputs that show smallCount and bigCount.
    System.out.println(smallCount + " entered are less than or equal to 50.");
    System.out.println(bigCount + " entered are greater than 50.");
  }
>>>>>>> 20f8af585841cb32dc11e02118a167d79fbf531f
}