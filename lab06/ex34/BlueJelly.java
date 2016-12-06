public class BlueJelly extends Jelly {
	//instance variables
	private String jellyColour = "blue";
	/**
	 * getter for the colour property
	 */
	public String getColour() {
		return this.jellyColour;
	}
	/**
	 * constructor
	 */	
	public BlueJelly(int health, String name) {
		super(health, name);
		jellyColour = "blue";
	}
}
