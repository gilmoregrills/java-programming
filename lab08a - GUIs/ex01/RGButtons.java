import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class RGButtons extends JFrame {

	/**
	 * Instantiating all my components
	 */
	private JButton buttonRed;
	private JButton buttonBlue;
	private JButton buttonGreen;
	private JPanel colorField;
	private JPanel contentPane;
	
	/**
	 * This method creates the UI elements,
	 * labels them, and adds behaviour
	 */
	private void initializeUI() {
		colorField = new JPanel(); 
		colorField.setBackground(Color.BLACK);
		buttonRed = new JButton("Red");
		buttonRed.addActionListener((ActionEvent click) -> {
			colorField.setBackground(Color.RED);
		});
		buttonBlue = new JButton("Blue");
		buttonBlue.addActionListener((ActionEvent click) -> {
			colorField.setBackground(Color.BLUE);
		});
		buttonGreen = new JButton("Green");
		buttonGreen.addActionListener((ActionEvent click) -> {
			colorField.setBackground(Color.GREEN);
		});
		
		createLayout();	
		setTitle("Red, Green, or Blue??");
		setSize(220, 100);
		setVisible(true);
	}
	/**
	 * This method creates the layout
	 * manager, creates the main panel
	 * and adds everything to it
	 */
	private void createLayout() {
		GridLayout layout = new GridLayout(2, 2, 5, 5);
		contentPane = new JPanel(layout);
		contentPane.add(buttonRed);
		contentPane.add(buttonBlue);
		contentPane.add(buttonGreen);
		contentPane.add(colorField);
		this.setContentPane(contentPane);
	}

	/**
	 * Constructor, calls initializeUI() on
	 * instantiation, and GUI is built from there
	 */
	public RGButtons() {
		initializeUI();
		}

	public static void main(String[] args) {
		RGButtons rgb = new RGButtons();
	}
}
