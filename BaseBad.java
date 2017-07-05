package john;

import java.util.Scanner;

public class BaseBad extends Card{
	Scanner scanner = new Scanner(System.in);
	BaseBad(){
		this.setName("Minion of Mordred");
		this.setTeam(Allegiance.BAD);
	}
}
