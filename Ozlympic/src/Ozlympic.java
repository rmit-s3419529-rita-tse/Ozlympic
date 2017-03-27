
public class Ozlympic {

	public static void main(String[] args) {
		
		//initializes the DB of athletes and officials
		Official.OfficialsDB();
		Cyclist.CyclistsDB();
		Sprinter.SprintersDB();
		Swimmer.SwimmersDB();
		SuperAthlete.SuperAthletesDB();
		
		//Game control
		Driver Driver = new Driver ();
		Driver.OzlympicStart();
		

		

	}

}
