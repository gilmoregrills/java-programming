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
		
		buttonRed = new JButton("Red");
		buttonBlue = new JButton("Blue");
		buttonGreen = new JButton("Green");
		
		mainPanel = new JPanel();
		mainPanel.add(buttonRed);
		mainPanel.add(buttonBlue);
		mainPanel.add(buttonGreen);

		Container cont = this.getContentPane();
		cont.add(mainPanel, BorderLayout.NORTH);
		cont.add(buttonRed, BorderLayout.WEST);
		cont.add(buttonBlue, BorderLayout.CENTER);
		cont.add(buttonGreen, BorderLayout.EAST);
		this.pack();
		this.setVisible(true);
	}

	public static void main(String[] args) {
		RGButtons rgb = new RGButtons();
	}
}
