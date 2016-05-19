 class Machine {
	 
	 int x , y;
	 protected int year;
	 protected String name;
	 Car cr;
	 public Machine m;
	 public void setYear(int y){
		 year = y;
	 }
	 public void setName(String s){
		 name = s;
	 }
	 public int getYear(){
		 return year;
	 }
	 public String getName(){
		 return name;
	 }
	 
	 public Machine()
	 {
		 System.out.println("I am in Machine default cnt");
	 }
	 
	 public Machine(int y, String n)
	 { 
		 m = new Machine();
		 m.setName(n);
		 System.out.println("I am in Machine  cnt");
		 year = y;
		 name = n;
		
		
	 }
	 public void fun2()
	 {
		 System.out.println(m.getName());
	 }
	 
	 
	 void  myFunc()
	 {
		  System.out.println(cr.getName());
		 System.out.println("I am a Machine!");
	 }
	 
	 void setCar(Car cr){
		 this.cr = cr;
	 }
	 
	 int dist(Machine l){
		int dx = this.x - l.x;
		return dx;
	 }
	  
 }