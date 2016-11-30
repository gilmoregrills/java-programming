import javax.swing.*;
import java.awt.*;

public class Calc extends JFrame {

	public Calc() {
		this.setTitle("Calculator");
		this.setSize(500, 200);
		/**
		 * Creating an array of all the buttons
		 * then using a loop to create number
		 * buttons, with the two extra buttons 
		 * and textfield done after
		 */
		JButton[] buttons = new JButton[12];
		for (int i = 0; i <= 9; i++) {
			String label = Integer.toString(i);
			buttons[i] = new JButton(label);
		}
		buttons[10] = new JButton(".");
		buttons[11] = new JButton("CE");
		JTextField readout = new JTextField(3);
		/**
		 * Adding all the buttons to the panel
		 * along with the textfield
		 */
		JPanel mainPanel = new JPanel();
		mainPanel.add(readout);		
		for (int j = 11; j >= 0; j--) {
			mainPanel.add(buttons[j]);
		}

		/**
		 * Adding all the buttons to the container
		 * along with the textfield
		 */
		Container cont = this.getContentPane();
		//cont.add(mainPanel);
		cont.add(readout);
		cont.setLayout(new GridLayout(4, 3));
		for (int k = 11; k >= 0; k--) {	
			cont.add(buttons[k]);
		}
		this.pack();
		this.setVisible(true);
	}

	public static void main(String[] args) {
		Calc calc = new Calc();
	}
}
