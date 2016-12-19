import java.util.*;
import java.io.*;

class TrieTree {
	int words;
	int prefixes;
	Vertex first;


	TrieTree() {
		words = 0;
		prefixes = 0;
		first = new Vertex();
		initialize(first);
		first.val = "";
	}

	class Vertex {
		String val;
		Vertex[] edges;
		int words;
		int prefixes;
	}

	public void initialize(Vertex s) {
		s.edges = new Vertex[26];
		s.words = 0;
		s.prefixes = 0;
		for (int i = 0; i<26; i++) {
			s.edges[i]=null;
		}
	}
	

	public void addword(Vertex s, String word) {
		if(word == null){
			word = "";
		}
		if (word.length() == 0){
			s.words++; //increment because at final vertex of word
		}
		else{
			word = word.toLowerCase();
			s.prefixes++; //increment because not at final vertex of word
			String k = word.substring(0,1); //retrieves first letter of word
			int ascii = (int) word.charAt(0);
			ascii = ascii - 97;
			if(s.edges[ascii] == null) { //if current letter is not a child of current vertex, make a new vertex
			//and set it to the child of current vertex
				s.edges[ascii] = new Vertex();
				initialize(s.edges[ascii]);
				s.edges[ascii].val = k;
			}
			if(word.length() > 0){
				word = word.substring(1);
			}
			else{
				word = "";
			}
			addword(s.edges[ascii], word); //traverse to next vertex
		}
	}


	public static int countWords(Vertex s, String word) {
		if(word == null){
			word = "";
		}
		if (word.length() == 0){
			return s.words;
		}
		else{
			word = word.toLowerCase();
			int ascii = (int) word.charAt(0);
			ascii = ascii - 97;

			word = word.substring(1);
			return countWords(s.edges[ascii], word);
		}
	}


	public int countPrefixes(Vertex s, String prefix) {
		if (prefix.length() == 0){
			return s.prefixes;
		}
		else{
			prefix = prefix.toLowerCase();
			char k = prefix.charAt(0);
			int ascii = (int) k;
			ascii = ascii - 97;

			prefix = prefix.substring(1);
			return countPrefixes(s.edges[ascii], prefix);
		}
	}



    public static void main(String[] args) {
    	List dList = new ArrayList(); //make a list to hold a copy of each word
    	String strArray[] = new String[10];
    	int listSize = 0;
    	String line;
    	TrieTree theTree = new TrieTree();
    	if(args.length != 1) {
    		System.out.println("Incorrect number of inputs: only input one file.");
    	}
    	else {
			try{
				FileReader in = new FileReader(args[0]);
				BufferedReader bReader = new BufferedReader(in);
				line = bReader.readLine();
				theTree.addword(theTree.first, line);
				dList.add(line);
				while(line != null){
					line = bReader.readLine();
					theTree.addword(theTree.first, line);//where all the nifty stuff happens
					if(countWords(theTree.first, line) == 1) { //add words when first found to list to prevent duplicates
				
						dList.add(line);
						listSize++; //add 
					}
				}
				if(listSize < 11){
					System.out.println("There are less than 10 words in the tree:");
					for(int i = 0; i < listSize; i++){
						line = (String) dList.get(i);
						line = line + " " + Integer.toString(countWords(theTree.first, (String) dList.get(i)));
						System.out.println(line);
					}
				} 
				else {
					int dSmallest = 0; //represents smallest word's wordCount index in the strarray
					for(int i = 0; i < listSize; i++) {
						if(i < 10) { //fills out strarray with first ten words in the nonduplicate word list and saves smallest wordcount's index
						
							strArray[i] = (String) dList.get(i);
							if(countWords(theTree.first, (String) dList.get(i)) < countWords(theTree.first, strArray[dSmallest])) {
								dSmallest = i;
							}
						}
						else { //array is now filled. now we compare remaining words in the nonduplicate list to smallest wordcount in strarray
						
							if(countWords(theTree.first, (String) dList.get(i)) > countWords(theTree.first, strArray[dSmallest])) {
								strArray[dSmallest] = (String) dList.get(i);
								dSmallest = 0;
								for(int j = 0; j < 10; j++) { //compare strarray words to each other to find smallest wordcount
									if(countWords(theTree.first, (String) strArray[j]) < countWords(theTree.first, strArray[dSmallest])) {
										dSmallest = j;
									}
								}
							}
						}
					}
					System.out.println("The ten most frequently used words are:");
					for(int x = 0; x < 10; x++) {
						System.out.println("Word:"+strArray[x] + " WordCount:" + Integer.toString(countWords(theTree.first, strArray[x])));
					}
				}

			}			
			catch(IOException ioe) { 
				throw new RuntimeException("Input file doesn't exist");
			}
		
    	}
    }
    
}




