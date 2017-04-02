import java.util.*;


public class Athlete extends Participant {

	protected int score;
	protected int time;
	
	public Athlete(){
		this.score = 0;
		this.time = 0;
	}
	
	
	public int compete(){
		int time = 0;
		int min = 100;
		int max = 200;
		double a = Math.random();
		time = min + (int)(a * (max - min));
		return time;
	}

	public int compete(int gametype){
		int time = 0;
		int min = 0;
		int max = 0;
		switch (gametype){
		case 1:min = 100; max = 200; break;
		case 2:min = 500; max = 800; break;
		default: min = 10; max = 20; break;
		}
		double a = Math.random();
		time = min + (int)(a * (max - min));
		return time;
	}

	
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	public ArrayList<Athlete> insertAthlete(){
		ArrayList<Athlete> athArray= new ArrayList<Athlete>();
		athArray.add(new Swimmer("SW001","Alex",16,"VIC"));
		athArray.add(new Swimmer("SW002","Betty",17,"VIC"));
		athArray.add(new Swimmer("SW003","Caroline",18,"ACT"));
		athArray.add(new Swimmer("SW004","David",19,"NSW"));
		athArray.add(new Swimmer("SW005","Eva",20,"ACT"));
		athArray.add(new Swimmer("SW006","Frank",21,"NSW"));
		athArray.add(new Swimmer("SW007","George",18,"VIC"));
		athArray.add(new Swimmer("SW008","Harry",19,"NSW"));
		athArray.add(new Swimmer("SW009","Tom",15,"QLD"));
		athArray.add(new Swimmer("SW010","Jerry",22,"QLD"));
		athArray.add(new Swimmer("SW011","Kate",24,"TAS"));
		athArray.add(new Swimmer("SW012","Louis",23,"TAS"));
		
		athArray.add(new Cyclist("CY001","Adam",18,"WA"));
		athArray.add(new Cyclist("CY002","Bob",18,"SA"));
		athArray.add(new Cyclist("CY003","Cathy",18,"SA"));
		athArray.add(new Cyclist("CY004","Dan",18,"SA"));
		athArray.add(new Cyclist("CY005","Mario",18,"SA"));
		athArray.add(new Cyclist("CY006","Fen",18,"TAS"));
		athArray.add(new Cyclist("CY007","Gary",18,"QLD"));
		athArray.add(new Cyclist("CY008","Hendry",18,"QLD"));
		athArray.add(new Cyclist("CY009","Jess",18,"VIC"));
		athArray.add(new Cyclist("CY010","Jessica",17,"NSW"));
		athArray.add(new Cyclist("CY011","Kathrine",17,"QLD"));
		athArray.add(new Cyclist("CY012","Maddie",17,"VIC"));
		
		athArray.add(new Sprinter("SP001","Meng",16,"VIC"));
		athArray.add(new Sprinter("SP002","Jackie",16,"NSW"));
		athArray.add(new Sprinter("SP003","Jack",16,"NSW"));
		athArray.add(new Sprinter("SP004","Jacky",16,"QLD"));
		athArray.add(new Sprinter("SP005","Rita",16,"ACT"));
		athArray.add(new Sprinter("SP006","Rex",16,"NT"));
		athArray.add(new Sprinter("SP007","wirya",19,"VIC"));
		athArray.add(new Sprinter("SP008","Jane",19,"NT"));
		athArray.add(new Sprinter("SP009","Qi",18,"QLD"));
		athArray.add(new Sprinter("SP010","Krystine",20,"ACT"));
		athArray.add(new Sprinter("SP011","Wydia",20,"NSW"));
		athArray.add(new Sprinter("SP012","Yuwis",22,"VIC"));
		
		athArray.add(new SuperAthlete("SU001","Sunny",24,"NT"));
		athArray.add(new SuperAthlete("SU002","Steven",25,"QLD"));
		athArray.add(new SuperAthlete("SU003","Ken",22,"ACT"));
		athArray.add(new SuperAthlete("SU004","Jason",23,"NSW"));
		athArray.add(new SuperAthlete("SU005","Wenny",21,"NT"));
		athArray.add(new SuperAthlete("SU006","Agnes",18,"VIC"));
		athArray.add(new SuperAthlete("SU007","Yvonne",19,"QLD"));
		athArray.add(new SuperAthlete("SU008","Anna",17,"NT"));
		athArray.add(new SuperAthlete("SU009","Tiffany",16,"NSW"));
		athArray.add(new SuperAthlete("SU010","VVand",16,"QLD"));
		athArray.add(new SuperAthlete("SU011","Alexander",19,"ACT"));
		athArray.add(new SuperAthlete("SU012","Peter",18,"VIC"));
		return athArray;
	}


	public int getTime() {
		return time;
	}


	public void setTime(int time) {
		this.time = time;
	}
}
