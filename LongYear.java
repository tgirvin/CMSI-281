public class LongYear {
	public static void main (String [] args){
		long year = Long.parseLong(args[0]);
		System.out.println(isCommonYear(year));
	}
	public static boolean isCommonYear (long year) {
		if (( year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
			return true;
		} else {
			return false; 
		}
	}	
}

//Timmy-MacBook-Pro:desktop MacBookPro$ java LongYear 1942
//false
//Timmy-MacBook-Pro:desktop MacBookPro$ java LongYear 2020
//true


