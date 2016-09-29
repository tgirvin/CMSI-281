//take an output and add the numbers individually 563 = 14
/*
public class SumOfDigits {
	public static void main (String [] args) { 
		long n = Long.parseLong(args[0]);
		long sum = 0;
		while (n != 0){
			sum = sum + (n%10);
			n = n/10;
		}
	System.out.println(sum);
	}
}
//Timmy-MacBook-Pro:desktop MacBookPro$ javac SumOfDigits.java
//Timmy-MacBook-Pro:desktop MacBookPro$ java SumOfDigits 454546565
//44
*/
public class SumOfDigits {
	public static void main (String [] args) { 
		long n = Long.parseLong(args[0]);
		System.out.println(digSum(n));
	}	
	public static long digSum ( long number) {
		long result = 0;
		while (number != 0){
			result = result + number%10;
			number = number/10;
		}
	return result;	
	}
}
//Timmy-MacBook-Pro:desktop MacBookPro$ javac SumOfDigits.java
//Timmy-MacBook-Pro:desktop MacBookPro$ java SumOfDigits 34355764435
//49
