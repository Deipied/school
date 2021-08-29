// open the class RelativelyPrimeArray
public class RelativelyPrimeArray{
    // calling and creating the main method
    public static void main(String[] args) {
        // takes user command line input as argument "n"
        int n = Integer.parseInt(args[0]);
        // creates a boolean 2-D array rpa
        boolean[][] rpa =  new boolean [n+1][n+1];
        // first nested for loop that interates through the boolean array and assigns every to True
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                rpa[i][j] = true;         
            }
        }

        // second nested for loop that iterates through the 2-d array and for each pair iterates through a common factor checker, which if it has one will set the rpa[i][j] to false.
        for (int i = 2; i <= n; i++){
            for (int j = 2; j <= n; j++){
                // third nested loop that iterates through factors starting with 2, since everything is divisible by 1
                for (int commonFactor = 2; commonFactor <= n; commonFactor++){       
                    // if statement that sees if i or j are factors of each other
                    if (i % j == 0 || j % i == 0){
                        rpa[i][j] = false;
                    // second if statement that sees if the divisible factor is for both i and j
                    } else if ((i + j) % commonFactor == 0 && i % commonFactor == 0 && j % commonFactor == 0){
                        rpa[i][j] = false;
                    } 
                }           
            }
        }

        // this is the nest print loop, we have an array rpa with true or false values
        for (int i = 0; i <= n; i++){
            for (int j = 0; j <= n; j++){
                // first if statement sees if i and j are equal to each other, per the prompt it should be a space
                if (i == j) {
                    System.out.print(" " + " ");
                // second and third if statements check to see if it's the first column or the first row, which prints just i or j
                } else if (i == 0){
                    System.out.print(j + " ");
                } else if (j == 0){
                    System.out.print(i + " ");
                // fourth and fifth actually checks the boolean value and prints T for True and F for False
                } else if (rpa[i][j] == false){
                    System.out.print("F" + " ");
                } else if (rpa[i][j] == true){
                    System.out.print("T" + " ");
                }             
            }
            //this print function prints a new line so that on the second loop it prints to a new line. 
            System.out.print(System.lineSeparator());
        }
    }        
}
