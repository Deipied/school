import java.io.IOException;

public class BinarySearch {
    //establish new binarysearch method
    public static int binarysearch(int[] arr, int key){
    //initialize lo and hi as int values based on length of the arr
        int lo = 0, hi = arr.length - 1;

    //this while loop allows you to keep halving because lo is always less than hi until it isnt
        while (lo < hi){
            // mid is int calculated by the lo hi values that change
            int mid = (lo + hi) / 2;
            // this checks to see if key is greater or equal to arr at index mid
            if (arr[mid] <= key)
            // makes a new lo since we know it is in the upper half so the new lo is mid plus one
                lo = mid + 1;
            // this checks to see if key is less than mid
            if (arr[mid] > key)
            // this sets the new high to mid since we are now working with the lower half
                hi = mid;
        } 

        //this if statement checks to see if arr at index lo is the key
        if (arr[lo] == key)
            return lo;
        //this else if statement checks to see is arr at index lo does not equal your key
        // and it checks to see if the index at lo-1 is equal to key which returns that if it's true
        else if ((arr[lo] != key) && (arr[lo-1] == key))
            return lo - 1;
        //since all cases are covered it would mean that the key is not in the arr so this calls binary search recursively
        else
            return (binarysearch( arr,(key-1)));

    }

    //this establishes the main method that runs the binary search
    public static void main(String[] args) throws IOException{

        //this allows you to read from the file input into the CLI
        In in = new In(args[0]);
        //this makes the data read from the file into a string
        String s = in.readAll();
        //this splits all the data by the space and places them separately into a list in the arr
        String[] array = s.split(" ");
        //this calculates n which is the length of arr used in our calc
        int n = array.length;
        //creates new int array and set it to arr
        int[] arr = new int[n];
        //converts the string data in the array from the input into the new arr as int
        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(array[i]);

        //this assigns the second CLI arguemnt into k, which is the key
        int k = Integer.parseInt(args[1]);

        //Declare a boolean and set it to true if key is in the input array
        boolean flag = false;
        for (int i = 0; i < n; i++){
            if (arr[i] == k){
                flag = true;
            }
        } 

        //this is calling the binaryseach method and stores it as result
        int result = binarysearch(arr,k);

        //checks to see that you have the blooan flag as true otherwise just output -1
        if (flag) {
            System.out.println(result);
        } 
        else {
            System.out.println(-1*result);
        } 
    } 
}
