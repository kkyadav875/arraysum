import java.awt.*;
import java.awt.event.*;

class Hello1 extends Frame {
	 Label text;
	 Button exitButton;
	
	public Hello1() {
		
		text = new Label("Hello World!", Label.CENTER);
		add(text, "North");
		
		exitButton = new Button("exit");
		add(exitButton, "South");
		
		ExitButtonListener exitListener = new ExitButtonListener();
		exitButton.addActionListener(exitListener);
		
		setSize(300,100);
		setVisible(true);
		}
		class ExitButtonListener implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
		}
		}
		public static void main(String[] args) {
			new Hello1();
		}
}