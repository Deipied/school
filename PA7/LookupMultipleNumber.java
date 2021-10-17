public class LookupMultipleNumber{ //opens public class LookupMultipleNumber    
    public static void main(String[] args){ //the main method
        In in = new In(args[0]); //assigns in to read from input
        int n = Integer.parseInt(args[1]); //CLI n which is int
        int keyField = Integer.parseInt(args[2]); //CLI kekField second arg
        int valField = Integer.parseInt(args[3]); //CLI valField third arg
        String[] database = in.readAllLines(); //reads from input file as string and stores in database
        StdRandom.shuffle(database); //shuffles the database 
        ST<String, Queue<String>> st = new ST<String, Queue<String>>(); //creating the symbol table
        for (int i = 0; i < database.length; i++){ //for loop that iterates over the database
            String[] tokens = database[i].split(","); // stores database tokens in the token array
            String key = tokens[keyField]; // assigns key from the tokens array
            String val = tokens[valField]; // assigns val from the tokens array
            
            if (st.get(key) == null){ // if key not in table
                Queue<String> que = new Queue<String>(); //create a queue
                que.enqueue(val); // adds val to queue
                st.put(key, que); //store they key and queue in the table
            } else {
            Queue<String> que = st.get(key); //finds the queue with the key 
            que.enqueue(val); // adds key to the queue
            st.put(key,que); // key queue pair into the table
            }
        } 
        while (!StdIn.isEmpty()){ //while loop for while input is empty
            String s = StdIn.readString(); //assigns s from input string
            if (st.contains(s)){ //checks to see it contains s
                Queue<String> queue = st.get(s); // get and assign to queue to add to table
                for(int i = 0; i < n && !queue.isEmpty(); i++){ // for loop to iterate 
                    StdOut.print(queue.dequeue() + " ");//prints the queue and space
                }
                StdOut.println();
            } else {
                StdOut.println("Not found"); //if not found
            }            
        } 
    } 
} 

class Queue<Item>{ //oepsn queue class
    private Node first; //priavte first
    private Node last; // pricate last
    private class Node { //opens node class
        private Item item;// private item
        private Node next; // private next
    } 
    public boolean isEmpty() { //isEmpty method
        return (first == null);
    }
    public void enqueue(Item item) { //adds to end of queue
        Node oldLast = last; //assigns last to oldLAst
        last = new Node(); // assigns new Node to last
        last.item = item; // assign item to last.item
        last.next = null; // asigns null to last.next
        if (isEmpty()){ //if empty
            first = last; //assign last to first
        } else {
            oldLast.next = last; // else assign last to oldLast.next
        }
    }
    
    public Item dequeue() { //dequeue method
        Item item = first.item;//assigns first.item to item
        first = first.next; //assigns first.next to first
        if (isEmpty()) last = null; // if empty assign null to last
        return item;// returns item
    }
    
    public String toString(){ //to string method
        Node current = first; //assigns first to current
        String output = (String)first.item; // assigns first.item to output
        while (current.next != null){ //while loop while curren.tnext does not equal null
            current = current.next; //assigns curent.next to current
            output.concat("," + current.item); //adds current.item to output
        }
        return output;
    } 
} 