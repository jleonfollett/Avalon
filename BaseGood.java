package john;

import java.util.Scanner;

public class BaseGood extends Card{
	Scanner scanner = new Scanner(System.in);
	BaseGood(){
		this.setName("Loyal Servant of Arthur");
		this.setTeam(Allegiance.GOOD);
	}
}
