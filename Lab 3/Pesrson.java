import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

public class Pesrson {

	public static int counter = 9;
	public final int constAnt = 500;
	private int x;
	private  String name;
	public Pesrson(){
	}
	// overriding
	public Pesrson(int x, String name)
	{
		this.x = x;
		this.name = name;
				}
	
	public Pesrson(int x)
	{
		this.x = x;
		 
	}
	
	public int getX()
	{
	 return x;
	}
}
