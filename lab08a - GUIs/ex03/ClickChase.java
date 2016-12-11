import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.util.Random;

public class ClickChase extends JFrame 
	implements MouseListener {

	private JPanel mainPanel;
	private JButton[] numButtons = new JButton[9];
	private Random r = new Random();
	private int tmp;
	private int rando;

	/**
	 * Method creates all the buttons in loop,
	 * then creates the layout, sets the title
	 * etc
	 */
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
	
	/**
	 * Method creates a new GridLayout and JPanel
	 * then adds all the buttons to the panel. 
	 */
	private void createLayout() {
		GridLayout layout = new GridLayout(3, 3);
		mainPanel = new JPanel(layout);

		for (int j = 0; j < 9; j++) {
			mainPanel.add(numButtons[j]);
		}
		this.setContentPane(mainPanel);
	}

	/**
	 * Method initially removes the text
	 * and MouseListener from the current button
	 * then generates a new random number repre-
	 * senting the button it will go to next
	 * (while loop so it wont be the same one)
	 * once destination button decided, adds 
	 * text and listener to it.
	 */
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

	//all the abstract MouseListener methods start
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}	
	public void mouseEntered(MouseEvent e) {
		randomLabel();
		//when the mouse enters the button area, calling
		//randomLabel moves it to a new button
	}	
	public void mouseExited(MouseEvent e) {}
	public void mouseClicked(MouseEvent e) {}
	//all the abstract MouseListener Methods end
	/**
	 * Constructor, on instantiaion the UI is 
	 * initialized and randomLabel is called 
	 * once to start the game off
	 */
	public ClickChase() {
		initUI();
		randomLabel();
	}

	public static void main(String[] args) {
		ClickChase game = new ClickChase();
	}
}
