package section3;

import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String Ans = JOptionPane.showInputDialog("do you know how to code");
		// 2. If they say "yes", tell them they will rule the world.
		if (Ans.equals("yes")) {
			JOptionPane.showMessageDialog(null, "you will rule the world");
		}
		// 3. Otherwise, wish them good luck washing dishes.
		else if (Ans.equals("no")){
			JOptionPane.showMessageDialog(null, "good luck washing dishes");
		}
		
	
	}
}

