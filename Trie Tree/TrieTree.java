import java.util.*;

class TrieTree {
	int words;
	int prefixes;
	public String alpha = new String[26];

	public TrieTree {
		words = 0;
		prefixes = 0;
		for (int i = 0; i<26; i++){
			alpha[i]=null;
		}
	}

	public void addword(String s, int word) {
		if (isEmpty(word)) {
			words = words+1;	
		} else {
			prefixes = prefixes+1;
			char k = word.charAt(0);
			if (alpha[i] = null) {
				alpha[i] = new alpha[i];
				alpha[i]++; //initialize(edges[k])
			}
			cutLeftmostCharacter(word)
			addWord(edges[k], word) //return alpha[i]??
		}
	}

	public void int countPrefixes(String s, int prefix) {
		
		if (isEmpty(word)) {
			return words;

		}
	}

	public void int countWords(String s, int word) {

	}
}




