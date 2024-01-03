
public class Player {
	
	private String playerCountry,playerName;
	
	public Player()
	{
		this("Sachin");
		playerCountry = "India";
	}
	
	public Player(String playerName)
	{
		//this();
		this.playerName = playerName;
	}

	public String toString() {
	return "Player[ Name = "+playerName+" Country = "+playerCountry+"]";
	}

	public static void main(String[] args) {
		//Player p = new Player("Virat");
		Player p = new Player();
		System.out.println(p);	
	}
}
