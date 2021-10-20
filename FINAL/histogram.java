public class Histogram {
    public static void main(String[] args){
        int[] data = StdIn.readAllInts();// data array creation from input
        int[] x = new int[n+1]; //assigns x to hold x axis points
        int n = data[0]; // assigns n to first data point, which is # of intervals
        int left = data[1]; // assigns left to the second value for the left end of interval
        int right = data[2];// assigns right for the second value, right end of interval
        int interval = (right - left)/n; //assigns # of intervals to interval
        double[] amount = new double[n]; // double array assignment to amount with size of n, double is req for plot
        double dimensions = 0; //declare dimensions that holds the dimensions based on the histogram

        for (int i = 0; i < x.length; i++) { //for loop for x array that puts in values for x axis
            x[i] = left + i*interval;
        }

        for (int i = 0; i < x.length-1; i++) { //for loop that calc the amount and stores in array
            int count = 0; // declare count equal to 0 

            for (int j = 0; j < data.length-3; j++) { // for loop that checks values to see if it falls in each interval
                if (data[j+3] >= x[i] && data[j+3] < x[i+1]) { //if statement that inreases count if it falls in the interval
                count++;
                }
            }

            amount[i] = count; //amount stores the number of count

            if (amount[i] > dimensions){ //if amount[i] is greater than dimensions, set dimenstions to it
                dimensions = amount[i];
            }
        } 

        StdDraw.setCanvasSize(500, 500); //sets canvas size
        StdDraw.setYscale(-1, dimensions + 1); // allows for border on the sides
        StdStats.plotBars(amount); //the method for displaying
    }
}