package c00;

// Hello.java (Java SE 5)
import javax.swing.*;

public class SwingHellowWord extends JFrame {
	public SwingHellowWord() {
		super("hello");
		super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		super.add(new JLabel("Hello, world!"));
		super.pack();
		super.setVisible(true);
	}

	public static void main(final String[] args) {
		new SwingHellowWord();
	}
}