import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.util.Random;
//need the label to disappear on mouseover

public class ClickChase extends JFrame 
	implements MouseListener {

	private JPanel mainPanel;
	private JButton[] numButtons = new JButton[9];
	private Random r = new Random();
	private int tmp;
	private int rando;

	private void initUI() {
		for (int i = 0; i < 9; i++) {
			numButtons[i] = new JButton();
		}
		
		createLayout();
		setTitle("Catch me if you can!");
		setSize(300, 200);
		setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void createLayout() {
		GridLayout layout = new GridLayout(3, 3);
		mainPanel = new JPanel(layout);

		for (int j = 0; j < 9; j++) {
			mainPanel.add(numButtons[j]);
		}
		this.setContentPane(mainPanel);
	}

	private void randomLabel() {
		numButtons[rando].setText("");
		numButtons[rando].removeMouseListener(this);
		tmp = rando;
		while (tmp == rando) {
			rando = r.nextInt(9);
		}
		numButtons[rando].setText("Click me!");
		numButtons[rando].addMouseListener(this);
		
			
	}

	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}	
	public void mouseEntered(MouseEvent e) {
		randomLabel();
	}	
	public void mouseExited(MouseEvent e) {}
	public void mouseClicked(MouseEvent e) {}

	public ClickChase() {
		initUI();
		randomLabel();
	}

	public static void main(String[] args) {
		ClickChase game = new ClickChase();
	}
}
