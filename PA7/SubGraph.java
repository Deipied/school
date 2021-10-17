public class SubGraph{ //opens SubGraph class
    private ST<String, SET<String>> st; //private ST class st
    public SubGraph() { //SubGraph constructor
        st = new ST<String, SET<String>>();  //ST class onject st 
    }
       
    public void addEdge(String v, String w) { //addEdge method that adds an edge
    
        if (!st.contains(v)) st.put(v, new SET<String>()); //new set
        if (!st.contains(w)) st.put(w, new SET<String>()); //new set
        st.get(v).add(w); //Put v in w's SET
        st.get(w).add(v); //w in v's SET
    
    }
    public Iterable<String> adjacentTo(String v) { //adjacentTo method that returns the adjacent node to input
        return st.get(v); 
    }
 
    public Iterable<String> vertices() { //vertices method that gets the vertices
        return st.keys(); 
    }
 
    public String toString() { //graph printing method
        String s = ""; //decalre empty string s
        for (String v : vertices()) { //iterates over adjacent vertices
            s += v + ": ";
        }
        for (String w : adjacentTo(v)){ //iterates over adjacent vertices
            s += w + " ";
            s += "\n";
        }
        return s;
    }
 
    public static void main(String[] args) { //main method
    //Create an object of this class G
    SubGraph G = new SubGraph(); //creat

    //Create an In object in to read from the input file
    In in = new In(args[0]);

    //reads and adds edges to graph
    while (!in.isEmpty())
        G.addEdge(in.readString(), in.readString());

    //Print out the graph by printing out the vertices and their adjacent nodes
    StdOut.println("The graph is");
    StdOut.print(G);

    //loop to read the vertices input on the CLI each time through the loop process a vertex add everything to string s which is printed out after the loop ends
    String s = "";
    for (int i = 1; i < args.length; i++) {
 
        //add the input vertex to s followed by ":"
        s += args[i] + ": ";

        //Get all the adjacent vertices to the input vertex which are in the input vertices and add them to s
        for (String w : G.adjacentTo(args[i])){
            boolean found = false;

            for (int j = 1; j < args.length; j++ ) {
                if ( args[j].equals(w)){
                    found = true;
                }
            }
            if (found){
                s += w + " ";
            }
            s += "\n";
        }
        //Print out the string s
        StdOut.println("The subgraph is");
        StdOut.print(s);
    }
}
