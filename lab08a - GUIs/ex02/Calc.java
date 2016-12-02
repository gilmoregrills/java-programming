import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Calc extends JFrame {

	private JTextField readout;
	private JPanel numPanel;
	private JPanel textPanel;
	private JPanel mainPanel;
	private JButton ceButton;
	private JButton dotButton;
	private JButton[] numButtons;
	private String view = "";

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
	}

	private void createLayout() {
		GridLayout layout = new GridLayout(4, 3, 3, 3);
		textPanel = new JPanel();	
		textPanel.add(readout);

		numPanel = new JPanel(layout);
		for (int j = 9; j >= 0; j--) {
			numPanel.add(numButtons[j]);
		}
		numPanel.add(dotButton);
		numPanel.add(ceButton);

		mainPanel = new JPanel();
		mainPanel.add(textPanel);
		mainPanel.add(numPanel);
		this.setContentPane(mainPanel);
	}

	private void updateReadout(String input) {
	//add text to textfield method
	//each key when pressed adds text to a variable
	//that represents the contents of readout then 
	//calls readout.setText(String)
	//pressing ceButton sets the string to "" and
	//pressing dotButton checks if there is already
	//a "." there before it adds one
		view = view + input;
		readout.setText(view);		
	}
	
	public Calc() {
		initUI();
	}

	public static void main(String[] args) {
		Calc calc = new Calc();
	}
}
