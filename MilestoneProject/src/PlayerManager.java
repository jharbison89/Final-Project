
public class PlayerManager {

	NFLPlayer players[] = new NFLPlayer[10];		// initializes array to hold players
	private int i = 0;			// initializes variable to keep track of size and position of new players in array
	
	PlayerManager(){			// constructor
	}
	
	
	void createPlayer(String name, String position){		// adds new player to array
		players[i] = new NFLPlayer(name, position);
		i++;
	}
	
	void displayPlayers(){			// displays players and positions in list form
		for(int j = 0; j < i; j++){
			System.out.println(players[j].getName() + ".............." + players[j].getPosition());
		}
	}
	
}
