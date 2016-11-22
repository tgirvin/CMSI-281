public class CircularArrayList extends AbstractArrayList implements CircularCollectible {
    private int size;

    public CircularArrayList() {
        super();
        size = 0;
    }

    public CircularArrayList(String[] elements) {
        super(elements);
        size = elements.length;
    }


    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void add(String s) {
        super.add(s);
    }
    
    public String first() {
        return elements[0];
    }

    /** remove(String s):
     *  removes the first element in the list for which
     *      element[i].equals(s)
     *  is true.
     */
    public void remove(String s) {
        
        for (int i=0; i <= elements.length-1; i++) {
            if(elements[i].equals(s)) {
                break;
            }
        }
        for (int j=i; j <= elements.length-1; j++) {
            elements[j] = elements[j+1]; 
        }
    }

    /** removeAll(String s):
     *  removes all elements in the list for which
     *      element.equals(s)
     *  is true.
     */
    public void removeAll(String s) {
        throw new UnsupportedOperationException();
    }

    public CircularIterator iterator() {
        return new CircularArrayListIterator();
    }

    class CircularArrayListIterator implements CircularIterator {
        private int currentIndex;

        public CircularArrayListIterator() {
            int currentIndex = 0;
        }
        
        public boolean hasNext() {
            return currentIndex < size && elements[currentIndex] != null;
        }

        public String next() {
            return elements[currentIndex++];
        }

        /** remove():
         *  removes the last/previous element in the list
         *  (i.e. removes the element that was returned by the
         *  most recent call to next())
         */
        public void remove() { //iterator.next, it.remove
            //int  = .iterator();
            //while(it.hasNext()){
                //int integer = iterator.next;
                //it.remove();
            }


        }

        /** removeKth(int k):
         *  iterates through the next k elements and removes
         *  the kth one. The next call to removeKth would
         *  start at the node after the removed node.
         *  (i.e. kthNode.next)
         */
        public String removeKthElement(int k) {
            for (int j=i; j <= elements.length-1; j++) {
                elements[j] = elements[j+1]; 
            
            
            }
            }




        }

        public boolean oneElementLeft() {
            throw new UnsupportedOperationException();
        }
    }

}
