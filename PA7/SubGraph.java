public class SubGraph{ //declare a private instance of ST class called st
    private ST<String, SET<String>> st;
    //Constructor allocates memory or creates ST class object st
    public SubGraph() { 
        st = new ST<String, SET<String>>(); 
    }
 
    //Method to add an edge to the graph
    public void addEdge(String v, String w) {
    // Put v in w's SET and w in v's SET. and create the sets first if they don't exist
        if (!st.contains(v)) st.put(v, new SET<String>());
        if (!st.contains(w)) st.put(w, new SET<String>());
        st.get(v).add(w);
        st.get(w).add(v);
    
    }
    //Method to get the nodes adjacent to the input node
    public Iterable<String> adjacentTo(String v) { 
        return st.get(v); 
    }
 
    //Method to get the vertices
    public Iterable<String> vertices() { 
        return st.keys(); 
    }
 
    //Method to print out the graph
    public String toString() {
        //Initialize an empty string s and then
        //then iterate over all vertices adjacent to v
        //(or connected to it) and print them out
        String s = "";
        for (String v : vertices()) {
            s += v + ": ";
            for (String w : adjacentTo(v))
            s += w + " ";
            s += "\n";
        }
        return s;
    }
 
    public static void main(String[] args) {
    //Create an object of this class G
    SubGraph G = new SubGraph();

    //Create an In object in to read from the input file
    In in = new In(args[0]);

    //Read from the file and add edges to the graph
    while (!in.isEmpty())
    G.addEdge(in.readString(), in.readString());

    //Print out the graph by printing out the vertices
    //and their adjacent nodes (or vertices)
    StdOut.println("The graph is");
    StdOut.print(G);

    //loop to read the vertices input on the command line
    //each time through the loop process a vertex
    //add or concatenate everything to string s
    //which is printed out after the loop ends
    String s = "";
    for (int i = 1; i < args.length; i++) {
 
        //add the input vertex to s followed by :
        s += args[i] + ": ";

        //Get all the adjacent vertices to the input vertex
        //which are in the input vertices and
        //add or concatenate them to s
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
