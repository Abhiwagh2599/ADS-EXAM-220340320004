
 class Car{
	private int year;
	private String make;
	private double speed;
	
	Car(int year,String make,double speed){
		this.year=year;
		this.make=make;
		this.speed=speed;
	}
	int getYear(){
		return this.year;
	}
	String getMake(){
		return this.make;
	}
	double getSpeed(){
		return this.speed;
	}
	void accelerate(){
		this.speed+=1;
	}

}
class RaceTrack{
	public static void main(String[]args){
	Car c=new Car(2010,"Porsche",25.0);
	System.out.println(c.getYear());
	System.out.println(c.getMake());
	System.out.println(c.getSpeed());
	c.accelerate();
	System.out.println(c.getSpeed());
	}
}