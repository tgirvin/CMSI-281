import java.io.*;
import java.util.NoSuchElementException;
import java.util.Scanner;

class Bag implements Collectible {
    private Node first;
    private int n; // number of nodes
    private int total; // total number of words in this bag


    // Implement a constructor
    public Bag() { 
       first = null;
    }



    // Implement Collectible interface methods here


    public int uniqueSize() {
       return n;
    }
    public int size() {
        return total;
        //return number of words 
    }
    public boolean isEmpty() {
        if (total==0) {
            return false;
        }
        return true;
    }
    public void add(String item) {
        total ++;
        boolean unique = true;
        for (Obliterator i = iterator(); i.hasNext(); ) {
            Node nextNode = i.next();
            if (nextNode.item.equals(item)) {
                unique = false; 
            }
        }
        if (unique) {
            Node oldFirst = first;
            first = new Node(oldFirst, item, 1);
            n++;
            //Increment count of Node
            //new method that has a boolean, the length has to be the same, separates the two apples
        }    
    }
    public boolean length(String item) {
        if (nextNode.item.equals(item)) {
            return false; 
        }    
    }
     public Obliterator iterator() {
        return new BagIterator(first);  
    }

    class BagIterator implements Obliterator {
        private Node current;

        public BagIterator(Node first) {
            current = first;
        }

        public boolean hasNext() { 
            return current != null;  
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        public Node next() {
            if (!hasNext()) throw new NoSuchElementException();
            Node node = current;
            current = current.next; 
            return node;
        }
    }


    public static void main(String[] args) throws IOException {
        Bag bag = new Bag();
        Scanner s = null;
        try {
            s = new Scanner(System.in);
            while (s.hasNext()) {
                String item = s.next(); // Scanner splits input on whitespace, by default
                bag.add(item);
            }
        } finally {
            if (s != null) {
                s.close();
            }
        }

        // Print bag size and distinct contents
        System.out.format("Total number of words: %d\n", bag.size());
        System.out.format("Unique number of words: %d\n", bag.uniqueSize());

        // Print distinct words in bag and their frequency
        for (Obliterator i = bag.iterator(); i.hasNext(); ) {
            Node node = i.next();
            System.out.format("%s %d\n", node.item, node.count);
        }
    }

}
