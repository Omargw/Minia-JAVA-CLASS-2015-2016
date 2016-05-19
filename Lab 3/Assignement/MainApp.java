 // this must be in a file named MainApp.java
public class MainApp {

	// put all your data here , REMEMBER: all variables or methods called by main must be static because main itself is static
	 
	//  Create here the Particle array of N Particles , N for example here = 10
	static Particle[] P = new Particle[10] ;
	 
	public static void main(String[] args) {
		 
		 
		 
	}
	
	public static void initializeParticles(int N)
	{
		double rad = 1e18;        	// radius of the whole universe
	    double smass = 1.98892e30;	// sun mass
	    for (int i = 0; i < N; i++)    // loop to calculate pos and velocity of random particles
	    {
	      double px = 1e18*expRand(-1.8)*(.5-Math.random());
	      double py = 1e18*expRand(-1.8)*(.5-Math.random());
	      double magv = circuliarVelocity(px,py);  
	      double absangle = Math.atan(Math.abs(py/px));
	      double thetav= Math.PI/2-absangle;
	      double phiv = Math.random()*Math.PI;
	      double vx   = -1*Math.signum(py)*Math.cos(thetav)*magv;
	      double vy   = Math.signum(px)*Math.sin(thetav)*magv;
	           if (Math.random() <=.5)
	           {
	              vx=-vx;
	              vy=-vy;
	            } 
	           
	      double mass = Math.random()*smass*10+1e20;
	      P[i]   = new Particle(px, py, vx, vy, mass);  //  
	    }
	    P[0]= new Particle(0,0,0,0,1e6*smass);
	}
	public static double circuliarVelocity(double rx, double ry) 
	{
	    double smass=1.98892e30;
	    double r2=Math.sqrt(rx*rx+ry*ry);
	    double num=(6.67e-11)*1e6*smass;
	    return Math.sqrt(num/r2);
	  }
	public static double expRand(double lmda) {
        return -Math.log(1 - Math.random()) / lmda;
    }
}
