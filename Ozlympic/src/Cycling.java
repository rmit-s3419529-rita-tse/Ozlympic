import java.util.Random;

public class Cycling extends Game{
      private final int firstPlace=5;
      private final int secondPlace=2;
      private final int thirdPlace=1;
      
	
	
	 //randomly generate 500 to 800 seconds for a cyclist
    public double compete(){
  	  double max=800;
  	  double min=500;
  	  Random random=new Random();
  	  double cycTime=random.nextInt()+min;
  	  return cycTime;
    }
}
