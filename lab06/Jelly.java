
public class Jelly {
	public static final int BLUE_JELLY = 0;
	public static final int RED_JELLY = 1;
	
	public int type; // to indicate which colour the Jelly is.
	public int health; // health of the Jelly (max health is 100).
	public String name;
	
	public Jelly(int type, int health, String name){
		this.type = type;
		this.health = health;
		this.name = name;
	}


}
