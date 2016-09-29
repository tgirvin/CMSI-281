/*
public class summer {
	public static void main (String [] args){
		long runningTotal=0;
		for (int i =0; i < args.length; i = i+1) {
			runningTotal= runningTotal + Long.parseLong(args[i]);
		}
		System.out.println(runningTotal);
	}	
}
*/
//Timmy-MacBook-Pro:desktop MacBookPro$ javac summer.java
//Timmy-MacBook-Pro:desktop MacBookPro$ java summer 43 34 54 56 76
//263
public class summer {
	public static void main (String [] args){
		long runningTotal=0;
		for (int i =0; i < args.length; i = i+1) {
			runningTotal= runningTotal + Long.parseLong(args[i]);
		}
		System.out.println(double runningTotal/double args.length);
	}	
}