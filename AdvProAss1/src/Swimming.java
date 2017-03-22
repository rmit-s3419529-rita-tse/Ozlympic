import java.util.Random;

public class Swimming extends Game{
	private final int firstPlace=5;
    private final int secondPlace=2;
    private final int thirdPlace=1;
    
    //randomly generate 100 to 200 seconds for a Sprinter
    public double compete(){
    	double max=200;
    	double min=100;
  	  Random random=new Random();
  	double swimTime=random.nextInt()+min;
  	  return swimTime;
	
    }	 
}
