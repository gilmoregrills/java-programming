import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.ComponentOrientation;

public class Calc extends JFrame {

	//declare all the variables/objects 
	//that need to be accessed by multiple 
	//methods.
	private JTextField readout;
	private JPanel numPanel;
	private JPanel textPanel;
	private JPanel mainPanel;
	private JButton ceButton;
	private JButton dotButton;
	private JButton[] numButtons;
	private String view = "";
	/**
	 * Method creates all buttons/fields,
	 * as well defining their behaviours
	 * and finally calling the createLayout
	 * method to organise them before it
	 * presents them
	 */
	private void initUI() {
		numButtons = new JButton[10];
		for (int i = 9; i >= 0; i--) {		
			String label = Integer.toString(i);
			numButtons[i] = new JButton(label);
			numButtons[i].addActionListener((ActionEvent click) -> {
				updateReadout(label);
			});
		}

		readout = new JTextField(14);
		
		ceButton = new JButton("CE");
		ceButton.addActionListener((ActionEvent click) -> {
			view = "";
			updateReadout("");
		});
		dotButton = new JButton(".");
		dotButton.addActionListener((ActionEvent click) -> {
			if (view.indexOf(".") == -1) {
				updateReadout(".");
			}
		});

		createLayout();
		setTitle("Taschenrechner");
		setSize(175, 175);
		setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); //does ctrl-c on cmd line on window-close
	}

	/**
	 *Method creates layout, panel for 
	 *the readout (and adds readout to it)
	 *then adds panel for buttons and adds
	 *all the buttons to it, finally adding
	 *0, dot and CE in the correct order
	 *then both sub-panels are added to 
	 *mainPanel to be displayed
	 */
	private void createLayout() {
		GridLayout layout = new GridLayout(4, 3, 3, 3);
		textPanel = new JPanel();	
		textPanel.add(readout);
		readout.setEditable(false); //removes ability to use k/b input

		numPanel = new JPanel(layout);
		numPanel.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		for (int j = 9; j > 0; j--) {
			numPanel.add(numButtons[j]);
		}
		numPanel.add(ceButton);		
		numPanel.add(dotButton);
		numPanel.add(numButtons[0]);

		mainPanel = new JPanel();
		mainPanel.add(textPanel);
		mainPanel.add(numPanel);
		this.setContentPane(mainPanel);
	}
	/**
	 * Method adds the String passed as arg
	 * to calculator readout, then refreshes
	 * the calculator view
	 */
	private void updateReadout(String input) {
		view = view + input;
		readout.setText(view);		
	}
	/**
	 * Constructor, just calls initUI()
	 */	
	public Calc() {
		initUI();
	}

	public static void main(String[] args) {
		Calc calc = new Calc();
	}
}
