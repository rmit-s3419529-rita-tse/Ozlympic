import java.util.ArrayList;
import java.util.Scanner;


public class Cycle extends Game{

	static int autoIncrease = 1;
	
	public Cycle(){
		String id = new String("");
		id = String.format("C%02d", autoIncrease);
		this.setGameID(id);
		autoIncrease++;
		super.athleteOfGame = new ArrayList<Athlete>();
		super.refereeOfGame = new Official();
		super.predictWinner = new Athlete();
	}
	public ArrayList<Athlete> selectAthletes(){
		ArrayList<Athlete> athArray = new ArrayList<Athlete>();
		ArrayList<Athlete> tempArray = new ArrayList<Athlete>();
		ArrayList<Athlete> resultArray = new ArrayList<Athlete>();
		Athlete ath = new Athlete();
		athArray = ath.insertAthlete();
		int select = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please select cyclists from the list, you must select 3-8 athletes:");
		System.out.println("\tID\t\tName\t\tAge\t\tState");
		int i = 0;
		for (Athlete anAthlete : athArray)
		{
			if(anAthlete instanceof Cyclist || anAthlete instanceof Sprinter || anAthlete instanceof SuperAthlete)
			{
				i++;
				System.out.println(i+".\t"+anAthlete.getID() + "\t\t" + anAthlete.getName() + "\t\t" + anAthlete.getAge() + "\t\t" + anAthlete.getState());
				tempArray.add(anAthlete);
			}
		}
		
		do{
			System.out.println("Please select one cyclist at first:");
			select = sc.nextInt();
			if(select <= 0 || select > i)
			{
				System.out.println("Please input a valid number.");
			}
			}while(select <= 0 || select > i);
		System.out.println(tempArray.get(select-1).getName()+" has been selected.");
		resultArray.add(tempArray.get(select-1));
		do{
			System.out.println("Please select the second cyclist:");
			select = sc.nextInt();
			if(select <= 0 || select > i)
			{
				System.out.println("Please input a valid number.");
			}
			}while(select <= 0 || select > i);
		System.out.println(tempArray.get(select-1).getName()+" has been selected.");
		resultArray.add(tempArray.get(select-1));
		do{
			System.out.println("Please select the third cyclist:");
			select = sc.nextInt();
			if(select <= 0 || select > i)
			{
				System.out.println("Please input a valid number.");
			}
			}while(select <= 0 || select > i);
		System.out.println(tempArray.get(select-1).getName()+" has been selected.");
		resultArray.add(tempArray.get(select-1));
		int other = 0;
		
		while(other<5 && select!=0){
		do{
			System.out.println("If you want to select one more cyclist, input his number, otherwise input 0:");
			select = sc.nextInt();
			if(select < 0 || select > i)
			{
				System.out.println("Please input a valid number.");
			}
			}while(select < 0 || select > i);
		if(select!=0){
			System.out.println(tempArray.get(select-1).getName()+" has been selected.");
			resultArray.add(tempArray.get(select-1));
			other++;
		}
		if(other == 5){
			System.out.println("You have already selected 8 athletes. No more athletes can be selected.");
		}
		}
		System.out.println("The athletes you selected are:");
		for (Athlete a : resultArray){
			System.out.println(a.getName());
		}
		return resultArray;
	}
}
