
public class Lab3 {

	public static void main(String[] args) {
		
		
		Machine o = new  Machine(2000, "Car");
		Machine o1 = new  Machine(2000, "Car");
		 
		int d =  o.dist(o1);
		
		
	   int s2 = dis(o , o1);
			
	}
	
	static int dis(Machine m1, Machine m2){
		return (m1.x - m2.x);
	}

}