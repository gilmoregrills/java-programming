import javax.swing.*;
import java.awt.*;

public class RGButtons extends JFrame {

	private JPanel mainPanel;
	private JButton buttonRed;
	private JButton buttonBlue;
	private JButton buttonGreen;

	public RGButtons() {
		this.setTitle("Red, Green, or Blue??");
		this.setSize(500, 200);
		
		button1 = new JButton("1");
		button2 = new JButton("2");
		button3 = new JButton("3");
		
		mainPanel = new JPanel();
		mainPanel.add(button1);
		mainPanel.add(button2);
		mainPanel.add(button3);

		Container cont = this.getContentPane();
		cont.setLayout(new GridLayout(3, 4));
		cont.add(mainPanel);
		cont.add(button1, GridLayout(1, 1));
		cont.add(button2, GridLayout(1, 2));
		cont.add(button3, GridLayout(1, 3));
		this.pack();
		this.setVisible(true);
	}

	public static void main(String[] args) {
		RGButtons rgb = new RGButtons();
	}
}
