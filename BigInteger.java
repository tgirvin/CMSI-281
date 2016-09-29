import java.util.Arrays;

public class BigInteger {
	private int [] digits;
	private int length;
	private int a;
	private int b;
	public BigInteger (String number){
		length = number.length();
		this.digits = new int[length];
		System.out.println("string: " + number);
		int index = 0;
		for(int i = length -1; i >= 0; i--){
			char c = number.charAt(i);
			System.out.println("char: " + c);
			this.digits[index] = (byte)Character.getNumericValue(c);
			index++;
		}
		System.out.println(Arrays.toString(this.digits));
	}
	public BigInteger add (BigInteger value) {
		//signum 
		
		if (this.digits = -1){
			return (this.digits == -1);
		}
		if (this.digits = 1){
			return (this.digits == 1);
		}

		BigInteger maxLength = length/2;
		
		//differ # if even or odd and add 1 to it
		if (length % maxlength == 0){
			int a = maxLength; 
		}
		if (length % maxLength == 1){
			int a = maxLength + 1;
			int b = maxLength;
		}
	
		//carrys the 1
		for (int i = length; i >= 0; i--){
			res= a[i] + b[i] + carry;
			carry = 0
			if (res >10){
				carry = 1;
				result = res%10;
			}
			if (carry = 1){
				new BigInteger ("1" + result);
			} else {
				return new BigInteger (result);
			}
		}
		

		BigInteger b = new BigInteger("0");
		return b;
	}
	public BigInteger subtract (BigInteger value) {
		BigInteger b = new BigInteger("0");
		return b;
	}
	public BigInteger divide ( BigInteger val ) {
		BigInteger b = new BigInteger("0");
		return b;
	}
	public BigInteger multiply ( BigInteger val ){
		BigInteger b = new BigInteger("0");
		return b;
	}
	public BigInteger remainder ( BigInteger val ){
		BigInteger b = new BigInteger("0");
		return b;
	}
	public String toString (){
		String string = "";
		if (){
			string += "-";
		} else if (! && this.digits[0] != 0){
			string += "+";
		}
		string = Integer.toString(this.digits[i]);
		}
		return string;	
	}

	public static final BigInteger ZERO = new BigInteger("0");

	public int compareTo ( BigInteger val ){
		return 0;
	}

	public boolean equals (Object x){
		if (x == null){
			return false;
		}
		if ( this.getClass() != x.getClass()){
			return false; 
		}
	}

	public static final BigInteger ONE = new BigInteger("1");

	public static final BigInteger TEN = new BigInteger("10");

	public static void main (String [] args) {
		BigInteger b = new BigInteger ("-12345");
		BigInteger b2 = new BigInteger ("12345");
		BigInteger b3= b.add (b2);
		System.out.println(b3);
	}
	public static BigInteger valueOf(long l) {
		return BigInteger.ZERO;
	}
}
/*
public BigInteger ( String val ); // one of several java.math.BigInteger constructors
public BigInteger add ( BigInteger val ); // returns a BigInteger whose value is this + val
public BigInteger subtract ( BigInteger val ); // returns a BigInteger whose value is this - val
public BigInteger multiply ( BigInteger val ); // returns a BigInteger whose value is this * val
public BigInteger divide ( BigInteger val ); // returns a BigInteger whose value is this / val
public BigInteger remainder ( BigInteger val ); // returns a BigInteger whose value is this % val
public String toString (); // returns the decimal string represention of this BigInteger
public int compareTo ( BigInteger val ); // returns -1/0/1 as this BigInteger is numerically less than/equal to/greater than val
public boolean equals ( Object x ); // returns true iff x is a BigInteger whose value is numerically equal to this BigInteger
public static final BigInteger ZERO; // a classwide constant for zero
public static final BigInteger ONE; // a classwide constant for one
public static final BigInteger TEN; // a classwide constant for ten
public static BigInteger valueOf ( long val ); // "static factory" for constructing BigIntegers out of longs
*/
