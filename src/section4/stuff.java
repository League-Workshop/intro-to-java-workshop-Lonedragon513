package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class stuff {
	

	String Ans1 = JOptionPane.showInputDialog("what is your name");
	String Ans2 = JOptionPane.showInputDialog("Hi" + Ans1 + "do you want to play a game");
	if (Ans2 = "yes") {
		JOptionPane.showMessageDialog(null, "ok lets play");
		int i = new Random().nextInt(101);
		String Ans5 = JOptionPane.showInputDialog("chouse a number between 0 and 100.");
	}
	if (Ans2 = "no") {
		JOptionPane.showMessageDialog(null, "oh well");
	}
}
