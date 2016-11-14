
public class Jelly {
	//instance variables
	public int health; // health of the Jelly (max health is 100).
	public String name;
	/**
	 * method checks if the jelly is alive, if a jelly's
	 * HP drops below 0 they are not alive.
	 */
	public boolean isAlive() {
		return (health > 0) ? true : false;
	}
	/**
	 * Constructor.
	 */	
	public Jelly(int health, String name){
		this.health = health;
		this.name = name;
	}

	public abstract int attack() {
		//the type of attack a jelly does, must be 
		//overridden
	}
}
