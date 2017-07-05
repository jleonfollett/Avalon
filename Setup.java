package john;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Setup {
	Random rand = new Random();
	Scanner scanner = new Scanner(System.in);
	private ArrayList<String> playerList = new ArrayList<String>();
	private ArrayList<Card> characterList = new ArrayList<Card>();
	private ArrayList<Card> playerCard = new ArrayList<Card>();
	
	Setup(){
		makePlayers();
		makeCards();
		assignCards();	
		getInfo();
		ladyOfLake();
		ladyOfLake();
		ladyOfLake();
	}
	
	// Asks for name then adds names to a player list until 10 is reached
	public void makePlayers(){
		String name = "";
		for(int i = 0; i < 10; i++){
			System.out.println("Hi what is your name?");
			name = scanner.nextLine();
			playerList.add(name);
			
		}
	}
	
	// Adds 6 good guys and 4 bad guys to character list
	public void makeCards(){
		characterList.add(new MerlinGood());
		characterList.add(new PercivalGood());
		characterList.add(new BaseGood());
		characterList.add(new BaseGood());
		characterList.add(new BaseGood());
		characterList.add(new BaseGood());
		characterList.add(new MorganaBad());
		characterList.add(new MordredBad());
		characterList.add(new BaseBad());
		characterList.add(new BaseBad());
	}
	
	//  Assign cards to players by setting the name in the card object.
	public void assignCards(){
		int cardNumb;
		for(String player: playerList){
			cardNumb = rand.nextInt(characterList.size());
			characterList.get(cardNumb).setPlayerName(player);
			playerCard.add(characterList.get(cardNumb));
			characterList.remove(cardNumb);
		}
		
	}
	public void getInfo(){
		for(Card player: playerCard){
			player.getInfo(playerCard);
		}
	}
	public void ladyOfLake(){
		System.out.println("Pick who you would like to use the lady of the lake on.");
		String userInput;
		for(Card player: playerCard){
			System.out.println(player.getPlayerName());
		}
		userInput = scanner.nextLine();
		for(Card player: playerCard){
			if(userInput.equals(player.getPlayerName())){
				System.out.println(player.getPlayerName() + " is " + player.getTeam() + "\n");
			}
		}
		System.out.println("Press enter when you are done!");
		scanner.nextLine();
		System.out.println("\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n "
				+ "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n "
				+ "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n "
				+ "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n "
				+ "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n "
				+ "\n \n \n \n \n \n \n \n \n \n \n \n "				+ "         \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
		}
	}
	

