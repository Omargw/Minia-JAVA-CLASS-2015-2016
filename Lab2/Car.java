package lab2;

// public so that we can access its methods and data members
public class Car{
	// NOTE: Class name must begin with CAPITAL letter
	//       no space between name if it contains more than
	// one word , and CAPTALISE each first letter 
	// Ex:  public class ThisIsMyClass
	
	// data members 
	// private to hide it from other classes and 
	// it is visible only inside this class
	private int ID;		// car ID
	private int speed;	// car speed in kM/h
	private int year;  // Manufacturing date
	private String model;  // car model
	
	// public getters and setters methods
	// they are used to get or set the value of the 
	// private data members 
	// they are used to hide the implementation from
	// other classes 
	public int getId(){
		return ID;
	}
	public void setId(int ID){
		// this keyword means the current object , set its ID value 
		// to the ID inserted by the user  
		this.ID = ID;
		
		// or using different names 
		// ID = ID2;
	}
	public int getSpeed(){
		return speed;
	}
	public void setSpeed(int speed){
		this.speed =  speed;
	}
	public int getYear(){
		return year;
	}
	public void setYear(int year){
		this.year = year;
	}
	public String getModel(){
		return model;
	}
	public void setModel(String model){
		this.model = model;
	}
	
	// default constructor 
	// A constructor is basically a method that is called 
	// whenever you are creating a new object of that class
	// used to allocate memory for all data members in that
	// class 
	public Car(){
		
	}
	 
	// overloaded constructor 
	// used to overload the default constructor 
	// so that user can initialize  the object while it is been created 
	// 
	public Car(int year, int speed, int ID)
	{
		
	}
	
	// a member function or member method of Car class
	// it is a function that describe action done by Car
	// object , us can create other things , such as
	// the car moves forward , it accelerates...etc
	public void stop(){
		System.out.println("I am stopping!!");
	}
 }