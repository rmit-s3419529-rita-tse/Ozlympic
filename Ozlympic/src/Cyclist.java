import java.util.Random;

public class Cyclist extends Athlete {
      public Cyclist (String ID, String name, int age, String state, String athleteType)
      {
          	 super (ID, name, age, state, athleteType);
      }
      
		public static Cyclist[] cyclists=new Cyclist[5];
		
		public static void CyclistsDB()
		{
			cyclists[0] = new Cyclist("S101", "Cadel", 50, "VIC", "Sprinter");
			cyclists[1] = new Cyclist("S201", "Fernando", 48, "QLD", "S" );
			cyclists[2] = new Cyclist("S301", "George", 34, "NSW", "S" );
			cyclists[4] = new Cyclist("S401", "Lee", 24, "NT", "S");
		} 
      
      }
 