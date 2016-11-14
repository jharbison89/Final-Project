
public class PlayerManager {

	NFLPlayer players[];		// initializes array to hold players
	private int i = 0;			// initializes variable to keep track of size and position of new players in array
	private int playerIndex = 0;
	
	PlayerManager(int size){	// constructor
		players = new NFLPlayer[size];
	}
	
	
	void createPlayer(String name, String position){		// adds new player to array
		players[i] = new NFLPlayer(name, position);
		i++;
	}
	
	void displayPlayers(){			// displays players and positions in list form
		for(int j = 0; j < i; j++){
			System.out.printf("%-15s %s\n", players[j].getName(), players[j].getPosition());
		}
	}
	
	private int getPlayer(String name){		// finds array index of given player based on name
		for(int j= 0; j < i; j++){
			if(players[j].getName() == name){
				playerIndex = j;
				break;
			}
		}
		return playerIndex;
	}
	
	int getPassYards(String name){
		return players[getPlayer(name)].getPassYards();
	}
	
	void setPassYards(String name, int yards){
		players[getPlayer(name)].setPassYards(yards);
	}
	
	int getRushYards(String name){
		return players[getPlayer(name)].getRushYards();
	}
	
	void setRushYards(String name, int yards){
		players[getPlayer(name)].setRushYards(yards);
	}
	
	int getRecievingYards(String name){
		return players[getPlayer(name)].getReceivingYards();
	}
	
	void setRecieviengYards(String name, int yards){
		players[getPlayer(name)].setReceivingYards(yards);
	}
	
	int getTackes(String name){
		return players[getPlayer(name)].getTackles();
	}
	
	void setTackles(String name, int tackles){
		players[getPlayer(name)].setTackles(tackles);
	}
	
	int getSacks(String name){
		return players[getPlayer(name)].getSacks();
	}
	
	void setSacks(String name, int sacks){
		players[getPlayer(name)].setSacks(sacks);
	}
	
	int getInterceptions(String name){
		return players[getPlayer(name)].getInterceptions();
	}
	
	void setInterceptions(String name, int interceptions){
		players[getPlayer(name)].setInterceptions(interceptions);
	}
}
