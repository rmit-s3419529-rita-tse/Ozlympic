import java.util.Scanner;
import java.util.Random;

public class Driver {
	
	Game game = new Game ();
	
	String prediction;
	int[]athleteScoreArray;
	int predictionWin=0;
	

	public void OzlympicStart() {
//needs some cleaning up
		
		Scanner sc = new Scanner (System.in);
		int userInput = sc.nextInt();
		//does this need to be in Ozlympic class?
		
		do {
		printmainmenu();
		}
		//!!!exception needs to be completed
		while (userInput<1||userInput>6);
		System.out.print("ERROR! PLEASE ENTER AGAIN:  ");
		System.out.println("\\n");

		switch(userInput){
		case(1): selectGame(); 
		break;
		case(2): prediction();
		break;
		case(3): startGame();
		break;
		case(4): displayResult();
		break;
		case(5): displayPoints();
		break;
		case(6): Exit();
		default:
			System.out.println("Please enter the correct value from the menu");
			System.out.println();
		}
	}

	//method to PRINT MENU
	static void printmainmenu() {
		System.out.println("Ozlympic Game");
		System.out.println("====================================");
		System.out.println("1. Select a game to run");
		System.out.println("2. Predict the winner of the game");
		System.out.println("3. Start the game");
		System.out.println("4. Display the final results of all games");
		System.out.println("5. Display the points of all athletes");
		System.out.println("6. Exit");
		System.out.print("Enter an option: ");
	}


	//remember to scan close & exit...........

//method to select which Sports Game to run
	public void selectGame() {
		
		Scanner sc = new Scanner (System.in);
		int selection = sc.nextInt();
		
		do {
			System.out.println("Enter 1 for Swimming, 2 for Cycling and 3 for Track");
			
			//try catch - exceptions
			//try {String selection = s.nextLine();
			//int gameSelect = Integer.parseInt(selection);
			
		} while (selection < 1||selection > 3);
			System.out.print("ERROR! PLEASE ENTER AGAIN:  ");

			switch(selection){
			case(1):  System.out.println("You have selected swimming");
			RandomAthletes();//method to be done!!
			break;
			case(2): System.out.println("you have selected cycling");
			RandomAthletes();
			break;
			case(3): System.out.println("you have selected track/running");
			RandomAthletes();
			break;
			default:
				System.out.println("Please enter the correct value from the menu");
				System.out.println();
			} 
			}
			
			

			public void RandomAthletes(){
				Random ran = new Random();
				int numberofAthletes = ran.nextInt(8);//at least 4 participants
				//makes it select from the right array of athletes

				if (numberofAthletes < 4) {
					System.out.println("Game Cancelled: there are not enough participants in this game.");
				} else { System.out.println("Let the Game Begins!");
				SelectAthletes();
				}
			}

			//select athletes methods based on the random numbers
			public void SelectAthletes(){
				
				//needs to write method here

				//--->gamestarts method ;
			}

			
			public void GameReadySetGo(){
				System.out.println("Participating Athletes & Officials:");
				System.out.println("===================================");
				System.out.println("Game No: " + Game.gameID);
				System.out.println("===================================");
				
				System.out.println("Ready, Set, Go!!!");
			}
			/*METHOD to start game from user's selection
	----> method to randomly number of athletes
	----> method to randomly select the athletes from array
	
	
	
			 *----> creates game # value
			 *----> selects officials (make them only ref one type of game
			 */


			
			
			
			
			
			private static void prediction() {
				//system print out list of athletes
				System.out.println("Which game do you want to predict the winner?");

			}				


			private static void displayPoints() {
				// TODO Auto-generated method stub

			}

			private static void displayResult() {
				// TODO Auto-generated method stub

			}

			private static void startGame() {
				// TODO Auto-generated method stub

			}


			private static void Exit() {
				System.exit(0);

			}

		}
