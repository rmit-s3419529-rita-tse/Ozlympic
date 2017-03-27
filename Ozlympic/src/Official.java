
public class Official extends Person {
	
	public Official (String ID,String name,int age, String state)
	{
		super(ID,name,age,state);
	}
	
	public static Official[] officials=new Official[4];
	
	public static void OfficialsDB()
	{
		officials[0] = new Official("101", "Thomas", 50, "VIC");
		officials[1] = new Official("201", "Frank", 48, "QLD" );
		officials[2] = new Official("301", "Tim", 34, "NSW" );
		officials[4] = new Official("401", "Nicole", 24, "NT");
	} 
}