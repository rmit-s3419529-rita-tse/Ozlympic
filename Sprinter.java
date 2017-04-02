
public class Sprinter extends Athlete{

	public Sprinter(String ID, String name, int age, String state){
		super.ID = ID;
		super.name = name;
		super.age = age;
		super.state = state;
		super.score = 0;
		super.time = 0;
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
}
