package lab2;
 
public class Lab2 {

	public static void main(String[] args){
	
		
		/*------------Arrays-----------*/
		// creating 1D array 
		int[] myArr;
		myArr = new int[3];
		myArr[0] = 10;  // assigning value to array elements 
		myArr[1] = 4;   // by default all values are 0s
		myArr[2] = 18;
		
		float[] myArr1 = new float[10];
		
		int[] myArr2 = {5,9,7,100,25,48};
		
		String[] myArr3 = {"One", "Two", "Three"};
		
		System.out.println("First element in myArr3 is: " + myArr3[0]);
		
		
		// 2D array , can be any dimensions , 
		int[]   [] matrix = new int[2][2];
		//  |   |
		//  row column
		
		// we use two for loops to iterate through rows first
		// then columns inside each row
		for(int i =0; i< matrix.length; i++)
		{
			for(int j=0; j<matrix[i].length;j++)
			{
 			matrix[i][j] = i+j;
			}
		}
		
		int[] a = {1, 2, 3};
		int[][] b = {a , {4,7}, {0}};
		
		// new for loop 
		// for each integer i in array i print that i element 
		// 
		for(int i : a)
			System.out.println(i);
		
		/*-----------------Classes---------------*/
		Car BMW = new Car(1990, 20 , 280);
		System.out.println(BMW.getSpeed());
		
		
		// this code won't run because all the data members
		// are private , that's why we can't access them from
		// this Lab2 class
		/*BMW.setColor("Blue");
		BMW.ID = 1524;
		BMW.model = "C90";
		BMW.speed = 250;
		BMW.year = -1980;*/
		
		int mySpeed = BMW.getSpeed();
		int myID = 50 - BMW.getId();
		System.out.println(myID);
		BMW.stop();
	}
	
}
