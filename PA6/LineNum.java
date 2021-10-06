import java.util.*;

public class LineNum{ //OPEN class
    
    public static void main (String[] args){ //OPEN main
        Queue q = new Queue(50); //CREATE QUEUE CAPACITY
        Scanner mySc = new Scanner(System.in); //DECLARES THE SCANNER OBJECT
        
        while(mySc.hasNext()){ //RETURNS TRUE IF SCANNER HAS ANOTHER TOKEN IN ITS INPUT
            q.enqueue(mySc.nextLine()); //ENQUEUES STRING READ FROM SCANNER
        } //CLOSE while LOOP
        
        int n = Integer.parseInt(args[0]); //CREATES INT VARIABLE
        q.dequeue(n - 1);
    } //CLOSE main
} //CLOSE class

// Class for queue
class Queue{ //OPEN class QUEUE
    
    private String arr[]; //ARRAY TO STORE QUEUE ELEMENTS
    private int front; //POINTS TO FRONT ELEMENT IN QUEUE
    private int rear; //POINTS TO LAST ELEMENT IN QUEUE
    private int capacity; //SETS MAXIMUM CAPACITY
    private int count; //SIZE OF QUEUE
    
    Queue(int size){ //CONSTRUCTOR TO INITIALIZE QUEUE
        arr = new String[size];
        capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }
    
    public void dequeue(int n){ //FUNCTION TO REMOVER FRONT ELEMENT FROM QUEUE
        if (isEmpty()){ //CHECK FOR QUEUE UNDERFLOW
            System.out.println("UnderFlow\nProgram Terminated"); //PRINTS ERROR IF UNDERFLOW
            System.exit(1);
        } //CLOSE if LOOP
        System.out.println(n + 1 + " from the first is " + arr[n]);
        while(n < rear){ //WHILE n IS LESS THAN THE LAST ELEMENT
            arr[n]=arr[n + 1];
            n++;
        }
        rear--; //DECREMENTS THE REAR ELEMENT
        count--; //DECREMENTS THE SIZE
    }

    public void enqueue(String item){ //FUNCTION TO ADD ITEM TO QUEUE
        if (isFull()){ //CHECK QUEUE FOR OVERFLOW
            System.out.println("OverFlow\nProgram Terminated"); //PRINTS ERROR IF OVERFLOW
            System.exit(1);
        } //CLOSE if LOOP
        rear = (rear + 1) % capacity;
        arr[rear] = item;
        count++; //INCREMENTS THE SIZE
    }
    
    public int size(){ //FUNCTION TO RETURN SIZE OF QUEUE
        return count;
    }
    
    public Boolean isEmpty(){ //FUNCTION TO CHECK IF QUEUE IS EMPTY
        return (size() == 0);
    }
    
    public Boolean isFull(){ //FUNCTION TO CHECK IF QUEUE IS FULL
        return (size() == capacity);
    }
} //CLOSE class QUEUE
    