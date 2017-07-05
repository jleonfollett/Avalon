package john;

import java.util.ArrayList;
import java.util.Scanner;

public class Card {
	enum Allegiance{
		GOOD,
		BAD
	}
	private String name;
	private String playerName;
	private Allegiance team;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public Allegiance getTeam() {
		return team;
	}
	public void setTeam(Allegiance team) {
		this.team = team;
	}
	public void getInfo(ArrayList<Card> cardList) {
		@SuppressWarnings("resource")
		Scanner lines = new Scanner(System.in);
		System.out.println("Hi " + this.getPlayerName() + "!  Hit enter when you are ready!");
		lines.nextLine();
		System.out.println("You are " + this.getName());
		if(this.getName().equals("Merlin")){
			for(Card card:cardList){
				if(card.getTeam() == Allegiance.BAD && !(card.getName().equals("Mordred"))){
					System.out.println("Yowza! " + card.getPlayerName() + " is bad!");
				} 
			}
			System.out.println("Watch out! There is also a Mordred!");
			
		}
		if(this.getTeam() == Allegiance.BAD){
			for(Card card:cardList){
				if(card.getTeam() == Allegiance.BAD && !(card.getPlayerName().equals(this.getPlayerName()))){
					System.out.println("Yowza! " + card.getPlayerName() + " is on your bad guy team!");
				} 
				}
		}
		if(this.getName().equals("Percival")){
			System.out.println("One of these two people is Merlin.  The other is Morgana.");
			for(Card card:cardList){
				if(card.getName().equals("Merlin") || card.getName().equals("Morgana")){
					System.out.println(card.getPlayerName());
				} 
				}
		}
		System.out.println("Press enter when you are done!");
		lines.nextLine();
		System.out.println("\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n "
				+ "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n "
				+ "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n "
				+ "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n "
				+ "\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n "
				+ "\n \n \n \n \n \n \n \n \n \n \n \n "				+ "         \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
		}
	
	}

