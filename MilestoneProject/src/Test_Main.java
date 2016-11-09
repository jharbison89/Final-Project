import java.util.Scanner;

public class Test_Main {

	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		PlayerManager agents = new PlayerManager();
		
		for(int i = 0; i < 10; i ++){
			System.out.print("Enter Player name: ");
			String name = input.next();
			
			System.out.print("Enter Position: ");
			String position = input.next();
			
			agents.createPlayer(name, position);
		}
		
		input.close();
		
		agents.displayPlayers();
	}
}
