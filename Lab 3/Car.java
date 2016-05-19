 public class Car extends Machine{
	 
	 private int ID;
	 private int speed;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public Car()
	{
		System.out.println("I am in Car default const");
	}
	
	public Car(int y, String na, int id, int sp){
		super(y, na);
		this.ID = id;
		this.speed = sp;
		 System.out.println("I am in Car cont");
	}
	 
	void myFunc()
	{
		System.out.println("I am Car!");
	}
	 
 }