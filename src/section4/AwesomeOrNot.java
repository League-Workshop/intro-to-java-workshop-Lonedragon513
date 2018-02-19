package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
	public static void main(String[] args) {
	

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
		int i = new Random().nextInt(4);
	// 3. Print out this variable
		System.out.println(i);
	// 4. Get the user to enter something that they think is awesome
		String u = JOptionPane.showInputDialog("what do you think is awsome");
	// 5. If the random number is 0
		if ( i == 0) {
    	 		JOptionPane.showMessageDialog(null, "it is awsomez");
		}
	// -- tell the user whatever they entered is awesome!
		if ( i == 1) {
			JOptionPane.showMessageDialog(null, "it is ok");
		}
		// 6. If the random number is 1

	// -- tell the user whatever they entered is ok.

	// 7. If the random number is 2
		if ( i == 2) {
			JOptionPane.showMessageDialog(null, "it is boring");
		}
		// -- tell the user whatever they entered is boring.

	// 8. If the random number is 3
		if ( i == 3) {
			JOptionPane.showMessageDialog(null, " I don't know");
		}
	// -- write your own answer
	}
}


