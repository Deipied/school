public class Hamming {
    public static int factorial(int n){ // Calculates and returns factorial value for n
        if (n == 1) return 1;
        return n * factorial(n-1);
    }

    public static void main(String[] args){ //Get the hamming distance specified by user on the command line into k integer variable
        int k = Integer.parseInt(args[0]);
        //Get the bit string entered by the user on the command line into s string variable
        String s = args[1];
        //Create a character array bitstring of the same length as the input bit string
        char[] bitstring = new char[s.length()];
        //Set up a loop to get individual bits of the bit string into character array bitstring
        for (int i = 0; i < bitstring.length; i++){
        // Copy each bit of bit string into an element of the character array
        bitstring[i] = s.charAt(i);
        }
    
        //Create a character array the same length as input bit string to contain random bits
        char[] randombits = new char[s.length()];
        //Calculate total number of unique bit strings that could have a hamming distance of k
        int combos = factorial(s.length())/(factorial(s.length()-k) * factorial(k));
        //Create an array to contain all bit strings that have a hamming distance of k from the input bit string
        //and set its size to the maximum possible whose value is stored in integer variable combos
        String[] hamstrings = new String[combos];
        //Declare and initialize integer variable count which would be used to track number of unique bit strings
        //with a hamming distance of k from input bit string that have been printed
        int count = 0;
        //Set up a loop that executes as many times as the maximum number of bit strings possible with a
        //hamming distance of k from the input bit string
    
        while (count < combos){
            //Initialize a string PossibleHam without initializing it
            String PossibleHam;
            //Integer used to track hamming distance of random bit string from input bit string
            int count1 = 0;
            //Integer used to track if random bit string with a hamming distance of k from input bit string is contained in hamstrings
            int count2 = 0;
            
            for (int i = 0; i < randombits.length; i++){
                //Produce random bit in randombits[i]
                if (Math.random() < 0.5){
                    randombits[i] = '0';
                } else {
                    randombits[i] = '1';
                }
                //Check how many digits are different
                if (randombits[i] != bitstring[i]) {
                    count1++;
                }
            }
            
            if (count1 == k){ //If number of different digits is equal to k, create a string from the random bits
                PossibleHam = new String(randombits);
            } else {
                //If number of different digits is not equal to k, revert to the top of the while loop
                continue;
            }

            for (int i = 0; i < hamstrings.length; i++){
            //Check is PossibleHam is already contained in hamstrings
                if (PossibleHam.equals(hamstrings[i])){ 
                    count2++;
                }
            }
            
            if (count2 == 0){
                //If PossibleHam is not in hamstring, add it to next empty index of hamstrings
                for (int i = 0; i < hamstrings.length; i++){
                    if (hamstrings[i] == null){
                        //If index of hamstrings is empty, populate it with PossibleHam, print PossibleHam, raise count by 1, and break the for loop
                        hamstrings[i] = PossibleHam;
                        StdOut.print(hamstrings[i] + " ");
                        count++;
                        break;
                    } else {
                    //If index of hamstrings is not empty, continue to the next index
                    continue;
                    }
                }
            }
            System.out.println();
        }
    }
}