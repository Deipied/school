//1. Write a well-documented (commented) program, “RelativelyPrimeArray,” 
// that takes an integer command-line argument “n” 
// and creates an (n+1)-by-(n+1) Boolean array “rpa” such that rpa[i][j] (for i,j>0) 
// is true if i and j are relatively prime (have no common factors), and is false otherwise. 
// It should then output as is shown by the sample run below. If the indexes i,j (for i,j>0) are equal, it should output a single space. 
// If the indexes are not equal, then it should output a 
// "T" character if the array element specified by the indexes is true or an "F" character if it is false. [MO2.1, MO2.2]

// A sample run would be as follows.

// > java RelativelyPrimeArray 9
//    1 2 3 4 5 6 7 8 9
// 1    T T T T T T T T
// 2 T    T F T F T F T
// 3 T T    T T F T T F
// 4 T F T    T F T F T
// 5 T T T T    T T T T
// 6 T F F F T    T F F
// 7 T T T T T T    T T
// 8 T F T F T F T    T
// 9 T T F T T F T T

class RelativelyPrimeArray{
    public static void main(String[] args) {
        System.out.println("Hello, World!"); 
    }
}