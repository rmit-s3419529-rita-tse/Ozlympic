import java.lang.Math;
public class Cyclist extends Athlete{

	public Cyclist(String ID, String name, int age, String state){
		super.ID = ID;
		super.name = name;
		super.age = age;
		super.state = state;
		super.score = 0;
		super.time = 0;
	}
	
	public int compete(){
		int time = 0;
		int min = 500;
		int max = 800;
		double a = Math.random();
		time = min + (int)(a * (max - min));
		return time;
	}
}
