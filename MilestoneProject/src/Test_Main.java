import java.util.Scanner;

public class Test_Main {

	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many players: ");
		int size = input.nextInt();
		PlayerManager agents = new PlayerManager(size);
		
		for(int i = 0; i < size; i ++){
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
