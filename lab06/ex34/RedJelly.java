
public class RedJelly extends Jelly {
	//instance variables
	private String jellyColour = "red";
	/**
	 * getter for the colour property
	 */
	public String getColour() {
		return this.jellyColour;
	}
	/**
	 * constructor
	 */
	public RedJelly(int health, String name) {
		super(health, name);

	}
}
