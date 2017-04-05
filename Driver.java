import java.util.Scanner;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.Random;

public class Driver {
	
	//scanner object for user input/selections
	Scanner sc = new Scanner (System.in);
	private int userInput;
	
	private int Swimcount=0;
	private int Runcount=0;
	private int Cyclecount=0;
	private String GID=null;

	private static String predictedAthlete;
	private int numberofAthletes;
	private boolean predictioncheck;
    
	public void OzlympicStart() {

		while (true){
		
			int userInput=0;
			do {
				try {
					MainMenu();
					userInput=1;
				}
				catch (NumberFormatException ne){
					System.out.println("Please enter the correct value from the menu");
					System.out.println();
					MainMenu();
			 } catch (InputMismatchException e) {
				 	System.out.println();
					System.out.println("Please enter a valid number from the menu");
					System.out.println();
					MainMenu();
			 }
			 } while (userInput!=0);
			
		} //MainMenu();
	}
	

	
	public void MainMenu(){
		{
		Menu.printMenu();
		userInput=sc.nextInt();
		
		switch(userInput){
		case(1): selectGame(); 
		break;
		//case(2): startGame();
		//break;
		case(3): MakePrediction();
		break;
		case(4): displayResult();//results of game
		break;
		case(5): displayPoints();//score for athletes
		break;
		case(6): Exit();
		default:
			System.out.println("Please enter the correct value from the menu");
			System.out.println();
		}
			} while (true);
	}

		
	
//CASE 1 ------------------method to select which Sports Game to run
	public void selectGame() {
	
		do {
			System.out.println("Enter 7 for Swimming, 8 for Cycling and 9 for Track");
			try {
				int selection = Integer.parseInt(sc.next());
				
			while (selection < 7||selection > 9);


			switch(selection){
			case(7):  System.out.println("You have selected swimming");
			Game.SelectAthletes(7);
			Swimcount++;
			GenerateGameID("SW");
			//counter for each game whenever it is selected.
			
			break;
			case(8): System.out.println("you have selected cycling");
			Game.SelectAthletes(8);
			Cyclecount++;
			GenerateGameID("C");
			
			break;
			case(9): System.out.println("you have selected track/running");
			Game.SelectAthletes(9);
			Runcount++;
			GenerateGameID("R");
			
			break;
			default:
				System.out.println("Please enter the correct value from the menu");
				System.out.println();
			}
			}  catch (NumberFormatException ne){
				System.out.println("Please enter the correct value from the menu");
				System.out.println();
			}		
			} while (true);
	}

//CASE 3 -------- after user selected a game----------------User predicts winner option
			//method that asks user to make a bet/prediction for the winner of each game.
			public static void MakePrediction() {

				Scanner scan = new Scanner (System.in);
				
				System.out.println("Who will be the winner of this game?");
				int bet = scan.nextInt();
				
				//not sure which one to use
				//ArrayList<Predictions> predictions = new ArrayList<Predictions>();//store the value user predicts, prediction class to include game # and then winner of game#
				ArrayList<Integer> predictions = new ArrayList<Integer>();
				
				predictions.add(bet);

				try {
					
					for (int x = 0; x < Game.chosenAthletes.size(); x++) //loop through the arraylist
					{  
						if (Game.chosenAthletes.get(x).getID() == bet) { 
						System.out.println("Your prediction is stored.");
						
						//create string to compared for equalignoredcase for startGame()
						predictedAthlete = Game.chosenAthletes.get(bet).getName();
						
						} else {
							System.out.println("Please enter a valid athlete id from the list");
						}
					}
				} catch(NumberFormatException ne)
					{
						System.out.println("Please enter a valid athlete id");
						System.out.println();
					}
					catch(InputMismatchException e)
					{
						System.out.println();
						System.out.println("Please enter a valid number");
						System.out.println();
						}
				
				System.out.println("To start this game, please select 2 on main menu.");
				
				
			}

//CASE 2 --------------------- from main menu
			/*public void startGame() {

					System.out.println("-----------------GAME STARTS----------------------");
					Official.SelectOfficial(); //selects &prints official
					
				
				//calls on Game Class for a game to run
				//game runs---compete()	
				//add game to arraylist........create method to add games?? without making games list static
					Game.games.add(getGameID(), winner1, winner2, winner3);
					

				//if User did not make prediction...print no prediction was made
				if (predictedAthlete.isEmpty()) {
					System.out.println("You did not predict a winner for this Game.");
				} else 
					
				//checks if prediction is right
					if predictioncheck = predictedAthlete.equalsIgnoreCase(Game.winner1.getName()); {
					System.out.println("Congratulations - your prediction was correct!");
					} 
					System.out.println("Too bad. Your athlete did not win.");
				


				//clear arraylists when game is finished---do we need to clear each athletes list?
				Game.athletes.clear();
				Game.chosenAthletes.clear();			

			}
			*/

//method that generates GameID			
			public void GenerateGameID(String prefix){
				StringBuilder sb = new StringBuilder();
				
				if (prefix == "SW") {
				{
					sb.append(prefix);
					sb.append(Swimcount);
					GID = prefix+Swimcount;
				} 
				} else if (prefix=="C") {
					sb.append(prefix);
					sb.append(Cyclecount);
					GID = prefix+Cyclecount;
					
				} else if (prefix=="R") {
					sb.append(prefix);
					sb.append(Runcount);
					GID = prefix+Runcount;
				}
			}

			public String getGameID(){
				return GID;
			}
			


//CASE 4 ----------------------
			private static void displayPoints() {
				// TODO Auto-generated method stub

			}


//CASE 5 ------------------------------
			private static void displayResult() {
				// TODO Auto-generated method stub
				
				//games.getList();

			}



//CASE 6 -----------------------------------
			public static void Exit() {
				
				System.out.println("Thank you for playing");
				System.exit(0);

			}
			

		}
