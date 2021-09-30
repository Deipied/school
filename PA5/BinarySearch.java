// import java.io.IOException;
// // initialize the class BinarySearch
// public class BinarySearch{
//     // this is the search method
//     public static int search(int[] arr, int key){
//         // assign int lo to 0 and hi to length of array -1
//         int lo = 0, hi = arr.length - 1; 
//         // Search for key in a[lo, hi).
//         if (hi <= lo) return -1;
        
//         int mid = lo + (hi - lo) / 2;
        
//         int cmp = a[mid].compareTo(key);
        
//         if (cmp > 0) return search(key, a, lo, mid);
//         else if (cmp < 0) return search(key, a, mid+1, hi);
//         else return mid;
//     }
//     public static void main(String[] args){ 
//         // Print keys from standard input that
//         // do not appear in file args[0].
//         In in = new In(args[0]);
        
//         String[] a = in.readAllStrings();
       
//         while (!StdIn.isEmpty()){
//             String key = StdIn.readString();
//             if (search(key, a) < 0) StdOut.println(key);
//         }
//     }
// }

import java.io.IOException;

public class BinarySearch {
    //binarysearch method
    public static int binarysearch(int[] arr, int key){
    //Initialize integer variable lo to 0 and hi to length of input array - 1
        int lo = 0, hi = arr.length - 1;

    //while lo index is less than hi index continue iterating,
    //and keep narrowing the search in successive iterations.
        while (lo < hi){

            int mid = (lo + hi) / 2;

            if (arr[mid] <= key)
                lo = mid + 1;

            if (arr[mid] > key)
                hi = mid;

        } //end of while loop

        //if arr[lo] is the same as the key, return lo
        if (arr[lo] == key)
            return lo;
        //if arr[lo] is not the same as the key but arr[lo-1] is, then return lo-1
        else if ((arr[lo] != key) && (arr[lo-1] == key))
            return lo - 1;
        //else the key is not in the array, so call binarysearch recursively with key-1
        else
            return (binarysearch( arr,(key-1)));

    } //end of binarysearch method

    //main method
    public static void main(String[] args) throws IOException{

        //Create an In object in to read input from the file specified by the first command line argument
        In in = new In(args[0]);
        //Read the data from the input file into a string s
        String s = in.readAll();
        //Split the string containing input data into tokens and store them in String array
        String[] array = s.split(" ");
        //Get the number of elements in array into integer variable n
        int n = array.length;
        //Create an integer array arr of size n
        int[] arr = new int[n];
        //Get the elements from string array into integer array arr
        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(array[i]);

        //Assign the second command line argument or the search key to integervariable k
        int k = Integer.parseInt(args[1]);

        //Declare a boolean variable flag and set it to true if key is in theinput array
        boolean flag = false;
        for (int i = 0; i < n; i++)
        if (arr[i] == k) flag = true;

        //Call binarysearch method and assign what it returns to result
        int result = binarysearch(arr,k);

        //if flag is true print out result and if not then print out -1*result
        if (flag) System.out.println(result);
        else System.out.println(-1*result);

    } //end of main method

}
