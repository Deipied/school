<<<<<<< HEAD:NumbersRangeSum.java
// opens the NumbersRangeSum class file
=======
package PA3;
>>>>>>> c1763d74fa0d3a6b3a897d4f299badd9350387c5:PA3/NumbersRangeSum.java
public class NumbersRangeSum{
    // this is the main that always runs first
    public static void main(String[] args){
        // establishes the commandline input of the two ints
        int low = Integer.parseInt(args[0]); 
        int high = Integer.parseInt(args[1]);
        // establishes sum as a int and the getSum method
        int sum = getSum(low, high);
        // print statement required per instructions
        System.out.println("The sum of natural numbers in range ["+low+","+high+"] is "+sum);
    }
    // this static class is the recursion part
    public static int getSum(int lowEnd, int highEnd){
        // it checks the two int cariables lowEnd and highEnd
        // which start off with our input and calls upon itself recursively
        // the first iteration through should be the else
        // so it will return the highEnd first then add the next iteration
        // which has 1 less than the previous iteration, until it equals the lowEnd
        // then it exits since it is now at the lowEnd, and returns the total sum
        if (highEnd == lowEnd)
            return lowEnd;
        else
            return highEnd + getSum(lowEnd, highEnd - 1);
    }
}