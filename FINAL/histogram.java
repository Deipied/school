public class Histogram {
    public static void main(String[] args){
        //Create an integer array data from the text file specified via redirect operator
        int[] data = StdIn.readAllInts();

        //Assign the first integer to n for the number of intervals
        int n = data[0];

        //Assign the second integer to left for the left end of the interval
        int left = data[1];

        //Assign the third integer to right for the right end of the interval
        int right = data[2];

        //Create a double (since the plotBars method takes a double array) array
        //of size n called freq that contains the number of values in each interval
        double[] freq = new double[n];

        //Compute the number of intervals and assign it to integer variable interval
        int interval = (right - left)/n;

        //Create an integer array xaxis of size n+1 that would hold the x axis interval points
        int[] xaxis = new int[n+1];

        //Populate the xaxis array with x axis interval points
        for (int i = 0; i < xaxis.length; i++) {
            xaxis[i] = left + i*interval;
        }

        //declare and initialize a double variable max to be used for specifying the
        //window dimensions that would display the histogram
        double max = 0;

        //loop for computing the frequency for each inteval and storing it in freq array
        for (int i = 0; i < xaxis.length-1; i++) {
        //Declare and initialize count to 0
        int count = 0;

            for (int j = 0; j < data.length-3; j++) {
            // Checks each value in the text file to see if it falls within each interval.
                if (data[j+3] >= xaxis[i] && data[j+3] < xaxis[i+1]) {
                //If value falls withing the current interval, increment count by one
                count++;
                }
            }

            //Set freq[i] to count, or number of values within each interval
            freq[i] = count;

            //Set max to freq[i] if its greater than it.
            if (freq[i] > max){ 
                max = freq[i];
            }
        } //end of loop

        //Set canvas size to 500 by 500
        StdDraw.setCanvasSize(500, 500);

        //Set y scale from -1 to max + 1, to leave a little border on both ends
        StdDraw.setYscale(-1, max + 1);

        //Display the histogram using standard method
        StdStats.plotBars(freq);
    }
}