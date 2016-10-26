/**
 * A main method for iterating over RGB colour component values with a
 * ColorDisplay object.
 */

class ColorDisplayMain {
	public static void main(String[] args) {

		ColorDisplay gui = new ColorDisplay();

		gui.setDelay(10); // Set a delay of 10 milliseconds.

		gui.changeColor(0, 0, 0); // Show a single colour.
	
		/**
		 * Iterates through the blue values very fast, green 
		 * very slowly, and red incredibly slowly.
		 */
		for (int i = 0; i <= 255; i++) {
			gui.setDelay(10);
			gui.changeColor(i, 0, 0);
			for (int j = 0; j <= 255; j++) {
				gui.setDelay(5);
				gui.changeColor(i, j, 0);
				for (int k = 0; k <= 255; k++) {
					gui.setDelay(2);	
					gui.changeColor(i, j, k);
				}
			}
		}	

	}
}
