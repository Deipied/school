public class MergeSort {
    //replacing 0 and a.length from the book version
    public static void sort(Comparable[] a, int lo, int hi){
        // this establishes aux as a comparable
        Comparable[] aux = new Comparable[a.length];
        // sorts the four elements
        sort(a,aux,lo,hi);
    }
    //this part stays the same as the book version
    public static void sort(Comparable[] a,Comparable[] aux, int lo, int hi) { 
        // if statement checks to see if hi and lo are within 1 of each other
        if(hi-lo <= 1){
            return;
        }
        // creates mid variable from lo and hi values
        int mid = lo+(hi-lo)/2;
        // first sort
        sort(a,aux,lo,mid);
        // second sort
        sort(a,aux,mid,hi);
        // establishes i as lo and j as the new mid
        int i=lo,j=mid;
        // a for loop that cycles through k and checks against indices of i and j
        for(int k=lo;k<hi;k++){
            // if statement checking to see if i equals mid, aka is lo = mid
            if (i==mid){
                aux[k] = a[j++];
            }
            // else if statement checks to see if j = hi which is mid = high
            else if (j==hi){
                aux[k] = a[i++];
            }
            // else if statement down the cases, checks and compares i and j element values
            else if (a[j].compareTo(a[i]) < 0){
                aux[k]=a[j++];
            }
            // else meaning no other cases match and sets aux[k] equal to a[i++] 
            else {
                aux[k] = a[i++];
            }
        }
        // for loop that cycles through indices of a and replaces values at index k with aux at index k
        for(int k=lo;k<hi;k++){
            a[k]=aux[k];
        }
    }
    // this is the main method that is changed from the book
    public static void main(String[] args) {
        //CLI value that is established as lo
        int lo = Integer.parseInt(args[0]);
        //second CLI value that is set to hi
        int hi = Integer.parseInt(args[1]);
        //declare new string array data and its size is set to number of command line arguments - 2
        String data[] = new String[args.length-2];
        //use a for loop to input into data array that is past the CLI (all the words)
        for(int i=0;i<data.length;i++){
            data[i] = args[i+2];
        }
        //this is where the sort method is called that sorts the given CLI input of data with lo and hi as inputs
        sort(data,lo,hi+1);
        // this for loop is what outputs the answer into the terminal one word at a time
        for(int i=0;i<data.length;i++){
            System.out.print(data[i]+" ");
        }

        //this just prints to a new line so that multiple uses can be printed on a new line
        System.out.println();
    }
}
