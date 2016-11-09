
public class NFLPlayer {
	/*	First iteration of NFLPlayer.java to be used in milestone project
	 *  this program will contain all variables and display stats on a given player object
	 */
	String name;						// name of player
	private String position = "0";		// position of player
	private int passYards = 0;			// value for passing yards
	private int rushYards = 0;			// value for rushing yards
	private int receivingYards = 0;		// value for receiving yards
	private int tackles = 0;			// value for tackles
	private int sacks = 0;				// value for sacks
	private int interceptions = 0;		// value for interceptions
	
	NFLPlayer(String input, String pos){		// initializes NFLPlayer object with input name and position
		name = input;
		position = pos;
	}
	
	String getName(){
		return name;
	}
	
	String getPosition(){
		return position;
	}
	
	void setPassYards(int a){		// sets the passing yards
		passYards = a;
	}
	
	int getPassYards(){				// returns the passing yards
		return passYards;
	}
	
	void setRushYards(int a){		// sets rushing yards
		rushYards = a;
	}
	
	int getRushYards(){				// returns rushing yards
		return rushYards;
	}
	
	void setReceivingYards(int a){	// sets receiving yards
		receivingYards = a;
	}
	
	int getReceivingYards(){		// returns receiving yards
		return receivingYards;
	}
	
	void setTackles(int a){			// sets tackles
		tackles = a;
	}
	
	int getTackles(){				// returns tackles
		return tackles;
	}
	
	void setSacks(int a){			// sets sacks
		sacks = a;
	}
	
	int getSacks(){					// returns sacks
		return sacks;
	}
	
	void setInterceptions(int a){	// sets interceptions
		interceptions = a;
	}
	
	int getInterceptions(){			// returns interceptions
		return interceptions;
	}
	
	void displayStats(){			// displays a formatted list of stats to the user
		System.out.printf("%s 					%s\n", name, position);
		System.out.printf("Passing Yards		%d\n", passYards);
		System.out.printf("Rushing Yards		%d\n", rushYards);
		System.out.printf("Receiving Yards		%d\n", receivingYards);
		System.out.printf("Tackles				%d\n", tackles);
		System.out.printf("Sacks				%d\n", sacks);
		System.out.printf("Interceptions		%d\n", interceptions);
	}
}
