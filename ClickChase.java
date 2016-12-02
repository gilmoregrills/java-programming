import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;

public class ClickChase extends JFrame {

	private JPanel mainPanel;
	private String clickMe = "Click me!";
	private JButton[] buttons = new JButton[9];

	private void initUI() {
		for (int i = 0; i <= 9; i++) {
			numButtons[i] = new JButton();
			numButtons[i].addMouseListener((MouseEvent hover) -> {
				//call method that sends the label to a random button
			});
		}
		
		createLayout();
		setTitle("Catch me if you can!");
		setSize(300, 200);
		setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void createLayout() {
		GridLayout layout = new GridKayout(3, 3, 3, 3);
		mainPanel = new JPanel();

		for (int j = 0; j <= 9; j++) {
			mainPanel.add(numButtons[i]);
		}
		this.setContentPane(mainPanel);
	}

	public ClickChase() {
		initUI();
	}

	public static void main(String[] args) {
		ClickChase game = new ClickChase();
	}
}
