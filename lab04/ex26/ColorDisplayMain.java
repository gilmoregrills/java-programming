/**
 * A main method for iterating over RGB colour component values with a
 * ColorDisplay object.
 */

class ColorDisplayMain {
	public static void main(String[] args) {

		ColorDisplay gui = new ColorDisplay();

		gui.setDelay(10); // Set a delay of 10 milliseconds.

		gui.changeColor(245, 250, 215); // Show a single colour.
	}
}
