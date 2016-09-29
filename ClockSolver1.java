class ClockSolver1 {
	public static void main (String [] args){
		double slice = 60;
		
		try {
			slice = Double.parseDouble(args[0]);
			// System.out.println(c.getHours());
		} catch (Exception e){ //invalid 
			System.err.println(e);
		}
		Clock c = new Clock(slice);
		System.out.println("slice: " + slice);
		System.out.println("Current time:" + c);

		while (c.hours() < 12) {
			System.out.println("Current time: " + c);
			System.out.println("Minute angle: " + c.getMinutesAngle());
			System.out.println("Hour angle: " + c.getHourAngle());
			c.tick();
			
			int count = 180;
			int max = 0;
			int min = 0;
			while (){
				if (c.getMinutesAngle() = count){
					System.out.println("Current time: " + c);
				}
				if(c.getMinutesAngle() > count){
					max = count - c.getMinutesAngle();
				}
				if (c.getMinutesAngle() > count){
					min = count - c.getMinutesAngle();
				}
				if (max<min){
					System.out.println("Current time: " + c);
				}
				if (max>min){
					System.out.println("Current time: " + c);
				}
				return count == count + 180;
			}
		}
	}
}