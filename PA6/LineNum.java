import java.util.*;
// this is the public class for LineNum
public class LineNum{ 
    // the main method
    public static void main (String[] args){
        Queue q = new Queue(50); //this creates a queue with a capcacity of 50
        Scanner mySc = new Scanner(System.in); //scanner object
        
        while(mySc.hasNext()){ //if scanner has another key in its input it will return true
            q.enqueue(mySc.nextLine()); //reads from scanner
        } 
        
        int n = Integer.parseInt(args[0]); //creates int variable n
        q.dequeue(n - 1);
    }
} 

// creats queue class
class Queue{ 
    
    private String arr[]; //stores queue elemetns
    private int front; //front element of queue
    private int rear; //last element of queue
    private int capacity; //sets the capacity
    private int count; //count is the size of the queue
    
    Queue(int size){ //queue initializer constructor
        arr = new String[size];
        capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }
    
    public void dequeue(int n){ //dequeue function that removes the first element of queue
        if (isEmpty()){ //checks for underflow
            System.out.println("UnderFlow\nProgram Terminated"); //if underflow prints the error
            System.exit(1); //system exit
        }
        System.out.println(n + 1 + " from the first is " + arr[n]); //req print
        while(n < rear){ //WHILE n IS LESS THAN THE LAST ELEMENT
            arr[n]=arr[n + 1];
            n++;
        }
        rear--; //reduces the last element
        count--; //reduces the size of queue
    }

    public void enqueue(String item){ //function that adds to the queue
        if (isFull()){ //check for queue overflow
            System.out.println("OverFlow\nProgram Terminated"); //if overflow, print error
            System.exit(1); //system exit
        }
        rear = (rear + 1) % capacity;
        arr[rear] = item;
        count++; //increases size
    }
    
    public int size(){ //size function just returns the count
        return count;
    }
    
    public Boolean isEmpty(){ //is Empty funcitons checks to see if queue is empty
        return (size() == 0);
    }
    
    public Boolean isFull(){ //isFull function checks to see if queue is full
        return (size() == capacity);
    }
} 
    