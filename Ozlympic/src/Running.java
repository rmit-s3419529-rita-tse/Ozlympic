import java.util.Random;

public class Running extends Game{
	private final int firstPlace=5;
    private final int secondPlace=2;
    private final int thirdPlace=1;
    
    
	
	 //randomly generate 500 to 800 seconds for a cyclist
  public double compete(){
	  double max=20;
	  double min=10;
	  Random random=new Random();
	  double sprTime=random.nextInt()+min;
	  return sprTime;
  }
}
