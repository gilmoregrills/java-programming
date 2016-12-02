import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class ClickChase extends JFrame 
	implements MouseListener {

	private JPanel mainPanel;
	private String clickMe = "Click me!";
	private JButton[] numButtons = new JButton[9];

	private void initUI() {
		for (int i = 0; i < 9; i++) {
			numButtons[i] = new JButton();
			numButtons[i].addMouseListener(this);
		}
		
		createLayout();
		setTitle("Catch me if you can!");
		setSize(300, 200);
		setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void createLayout() {
		GridLayout layout = new GridLayout(3, 3, 3, 3);
		mainPanel = new JPanel(layout);

		for (int j = 0; j < 9; j++) {
			mainPanel.add(numButtons[j]);
		}
		this.setContentPane(mainPanel);
	}	

	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}	
	public void mouseEntered(MouseEvent e) {
		System.out.println("Moused over!");
	}	
	public void mouseExited(MouseEvent e) {}
	public void mouseClicked(MouseEvent e) {}

	public ClickChase() {
		initUI();
	}

	public static void main(String[] args) {
		ClickChase game = new ClickChase();
	}
}
