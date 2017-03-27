
public class Athlete extends Person {
	
	private int score;
	public String athleteType;

	public Athlete (String ID,String name,int age, String state, String athleteType){
	super(ID, name, age, state);
	this.athleteType = athleteType;
    }
 
	public void addPoints(int points) 
	{
		this.score += points;
	}
	
	
	public int getPoints() 
	{
	    return score;
	}


	public void setPoints(int points) 
	{
		this.score = points;
	}
	
	//compete method (superclass method to be overridden for the subclasses athletes)
	public void compete(){
		
	}
	
}
