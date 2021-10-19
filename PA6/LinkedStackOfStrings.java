// import java.util.Scanner;
public class LinkedStackOfStrings { // public class LinkedStackOfStrings
    private Node first; // private Node first
    
    private class Node { // private Node method
        private String item; // private String item
        private Node next; // private Node next
    }
    
    public boolean isEmpty() { // isEmpty method
        return first == null; // return statement
    }
    
    public void push(String item) { // push method
        Node oldFirst = first; // assignment
        first = new Node(); // created new Node first
        first.item = item; // assignment
        first.next = oldFirst; // assignment
    }
    
    public String pop() { // pop method
        String item = first.item; // assigns first item to item
        first = first.next; // assigns first.next to first
        return item; // return statement
    }

    public boolean find(String item) { // find method
        Node temp = first; // assigns value of first to temp Node
        while (temp != null) { // while temp is not null
            if(temp.item.equals(item)) return true; // if the item is in the stack
            temp = temp.next; // assignment
        }
        return false; // return false
    }
    
    public static void main(String[] args) { // main method
        String str = args[0]; // string from args
        LinkedStackOfStrings list = new LinkedStackOfStrings();
        // list is a new linked stack of strings (stack)
        while (!StdIn.isEmpty()) { // while Std input is empty
            String item = StdIn.readString(); // reads strings from Std input
            list.push(item); // puches an item into the list
            StdOut.print(item+" "); // prints the line entry items
        }
        if(list.find(str)) { // if find method contains the args term
            System.out.println(str + " exists in the linked stack"); // prints the term exits in the stack
        } else { // otherwise
        System.out.println(str + " does not exist in the linked stack");
        // java prints that the term is not in the stack
        }
    // You could add another method to the class to iterate (and print) the items in the list.
    // And then call it via an object of the class in the main method. The method could be something like
    // public void iterate() {
    // Node temp = first; while (temp!=null) {
        // StdOut.println(temp.item); temp = temp.next; }
    // }
    }
}