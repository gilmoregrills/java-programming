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

	private void initUI() {
		numButtons = new JButton[10];
		for (int i = 9; i >= 0; i--) {
			String label = Integer.toString(i);
			numButtons[i] = new JButton(label);
		}

		readout = new JTextField(14);
		
		ceButton = new JButton("CE");
		ceButton.addActionListener((ActionEvent click) -> {
			readout.setText("");
		});
		dotButton = new JButton(".");
		ceButton.addActionListener((ActionEvent click) -> {
			//add a dot
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
	
	public Calc() {
		initUI();
	}

	public static void main(String[] args) {
		Calc calc = new Calc();
	}
}
