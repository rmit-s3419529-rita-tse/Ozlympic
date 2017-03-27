import java.util.Random;

public class Sprinter extends Athlete{
	 public Sprinter (String ID, String name, int age, String state, String athleteType){
	      super (ID, name, age, state, athleteType);
	      }
	         
	 
		public static Sprinter[] sprinters=new Sprinter[5];
		
		public static void SprintersDB()
		{
			sprinters[0] = new Sprinter("S101", "Sandra", 50, "VIC", "Sprinter");
			sprinters[1] = new Sprinter("S201", "Jack", 48, "QLD", "S" );
			sprinters[2] = new Sprinter("S301", "Nick", 34, "NSW", "S" );
			sprinters[4] = new Sprinter("S401", "Harrison", 24, "NT", "S");
		} 

	}

