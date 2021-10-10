import java.util.Scanner;

public class LinkedStackOfStrings { // opens public class LinkedStackOfStrings
    private Node first; // private Node first
    private class Node { // private Node method
        private String item; // private String item
        private Node next; // private Node next
    }
    
    public boolean isEmpty() { // isEmpty method that returns first == null
        return first == null; 
    }
    
    public void push(String item) { // push method onto the stack
        Node oldFirst = first; // assigns first to oldFirst
        first = new Node(); // created new Node first
        first.item = item; // assigns item to first.item
        first.next = oldFirst; // assigns oldFirst to first.next
    }
    
    public String pop() { // pop method
        String item = first.item; // assigns first item to item
        first = first.next; // assigns first.next to first
        return item; // returns item
    }
    
    public boolean find(String item) { // find method
        Node temp = first; // assigns first to temp
        while (temp != null) { // while loop while temp is not null
            if(temp.item.equals(item)) return true; // if the item is in the stack return true
            temp = temp.next; // assigns temp.next to temp
        }
        return false; // return false
    }
    
    public static void main(String[] args) { // the main method
        String str = args[0]; // input assignment to str
        LinkedStackOfStrings list = new LinkedStackOfStrings(); // list is a new linked stack of strings
        while (!StdIn.isEmpty()) { // while loop while StdIn is empty
            String item = StdIn.readString(); // reads strings from Std input
            list.push(item); // pushes item into the list
            StdOut.print(item+" "); // prints the item and a space  
        }

        if(list.find(str)) { // if the find method has the args str
            System.out.println(str + " exists in the linked stack"); // prints str and exists in the stack
        } else {
            System.out.println(str + " does not exist in the linked stack"); //print not in the stack
        }
        public void iterate() {// iterate method
            Node temp = first; //asssigns first to temp
            while (temp!=null) { // while loop for temp not equaling null
                StdOut.println(temp.item); // prints temp.item 
                temp = temp.next; // assigns temp.next to temp
            }
        }
    }
 }