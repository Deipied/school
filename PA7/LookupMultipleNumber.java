public class LookupMultipleNumber { //OPEN CLASS
    public static void main(String[] args) { //OPEN MAIN
        In in = new In(args[0]); //CREATE AN In OBJECT FOR READING DATA FROM INPUT FILE
        //COMMAND LINE ARGUMENT INPUTS, FIRST NUMERIC VALUE INTO n, SECOND INTO keyField, THIRD INTO valField
        int n = Integer.parseInt(args[1]);
        int keyField = Integer.parseInt(args[2]);
        int valField = Integer.parseInt(args[3]);
        //READ LINES FROM INPUT FILE AS STRINGS, STORE THEM IN THE STRING ARRAY database
        String[] database = in.readAllLines();
        StdRandom.shuffle(database);
        ST<String, Queue<String>> st = new ST<String, Queue<String>>();
        //CREATES SYMBOL TABLE
        for (int i = 0; i < database.length; i++) { //ITERATE OVER ALL LINES STORED IN THE DATABASE
            String[] tokens = database[i].split(","); //STORE EACH LINE INTO TOKENS, STORE THEM IN STRING ARRAY tokens
            String key = tokens[keyField]; //THE keyField INDEX IN TOKENS ARRAY STORES THE KEY. GETS ASSIGNED TO STRING VARIABLE key
            String val = tokens[valField]; //THE valField INDEX IN TOKENS ARRAY STORES THE VALUE. GETS ASSIGNED TO STRING VARIABLE val
            //IF THE KEY IS NOT IN SYMBOL TABLE, CREATE A QUEUE, ADD THE val TO QUEUE,
            //STORE THE KEY,QUEUE PAIR IN THE SYMBOL TABLE
            if (st.get(key) == null) {
                Queue<String> que = new Queue<String>();
                que.enqueue(val);
                st.put(key, que);
            } //CLOSE if
            else { //OR ELSE GETS THE QUEUE ASSOCIATED WITH THE KEY, ADDS THE KEY TO IT AND PUT THE KEY,QUEUE PAIR IN THE SYMBOL TABLE
                Queue<String> que = st.get(key);
                que.enqueue(val);
                st.put(key,que);
            } //CLOSE else
        } //CLOSE for
        //WHILE SETUP TO READ VALUES ENTERED BY THE USER
        while (!StdIn.isEmpty()) { //READ KEY AND PROVIDE VALUE
            String s = StdIn.readString();
            if (st.contains(s)) {
                Queue<String> queue = st.get(s);
                for(int i = 0; i < n && !queue.isEmpty(); i++) {
                    StdOut.print(queue.dequeue() + " ");
                }//CLOSE for
                StdOut.println();
            } //CLOSE if
            else {
                StdOut.println("Not found");
            }
        } //CLOSE while
    } //CLOSE MAIN
} //CLOSE CLASS


class Queue<Item> { //OPEN Queue CLASS
    private Node first;
    private Node last;
    
    private class Node { //OPEN Node CLASS
        private Item item;
        private Node next;
    } //CLOSE Node CLASS

    public boolean isEmpty() { //OPEN isEmpty
        return (first == null);
    } //CLOSE isEmpty

    public void enqueue(Item item) { //INSERT NEW NODE AT END OF LIST
        Node oldLast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty()) {
            first = last;
        } else {
            oldLast.next = last;
        }
    } //CLOSE enqueue

    public Item dequeue() { //REMOVE THE FIRST NODE FROM THE LIST AND RETURN ITEM
        Item item = first.item;
        first = first.next;
        if (isEmpty()) {
            last = null;
        }
        return item;
    } //CLOSE dequeue
    
    //ITERATE THROUGH EACH NODE IN QUEUE AND APPEND THEIR ITEM VALUES String TO RETURN
    @Override public String toString(){
        Node current = first;
        String output = (String)first.item;
        
        while (current.next != null){
            current = current.next;
            output.concat("," + current.item);
        } //CLOSE while
        return output;
    } //CLOSE String
} //CLOSE Queue CLASS
