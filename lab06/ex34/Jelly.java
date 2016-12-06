
public class Jelly {
	//instance variables
	private int health; // health of the Jelly (max health is 100).
	private String name;	
	/**
	 * method checks if the jelly is alive, if a jelly's
	 * HP drops below 0 they are not alive.
	 */
	public boolean isAlive() {
		return (health > 0) ? true : false;
	}
	/**
	 * getter for the health property
	 */
	public int getHealth() {
		return this.health;
	}
	/**
	 * setter for the health property
	 */
	public void setHealth(int i) {
		this.health = i;
	}
	/**
	 * getter for the name property
	 */
	public String getName() {
		return this.name;
	}
	/**
	 * setter for the name property
	 */
	public void setName(String a) {
		this.name = a;
	}
	/**
	 * Constructor.
	 */	
	public Jelly(int health, String name){
		this.health = health;
		this.name = name;
	}
}
