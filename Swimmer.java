import java.lang.Math;
public class Swimmer extends Athlete{

	public Swimmer(String ID, String name, int age, String state){
		super.ID = ID;
		super.name = name;
		super.age = age;
		super.state = state;
		super.score = 0;
		super.time = 0;
	}
	
	public int compete(){
		int time = 0;
		int min = 100;
		int max = 200;
		double a = Math.random();
		time = min + (int)(a * (max - min));
		return time;
	}
}
