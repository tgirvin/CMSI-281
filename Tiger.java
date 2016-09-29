public class Tiger {
	//attributes
	int legs; 
	String name;
	int bladderlevel;

	//constructor: what builds the object 
	public Tiger () {
		this.bladderlevel=10;
	}
	//methods
	public int getBladderLevel (){
		return this.bladderlevel;
	}

	public void roar () {
		System.out.println("roar");
	}
	public void pee (){
		this.bladderlevel -= 0; 
		System.out.println("ahhh, much better");
	}
	public String hunts(String prey) {
		System.out.println("hey"+prey+"die! Now");
		return "ok, I'm full";
	}
	
	//main method
	public static void main (String [] args){
		Tiger t = new Tiger();
		t.roar();
		t.pee();
		String response = t.hunts ("antelope");
		System.out.println(response); 
		System.out.println(t.getBladderLevel());
		Tiger t2 = new Tiger();
		System.out.println(t2.getBladderLevel());
	}
}	