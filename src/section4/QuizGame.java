package section4;

import javax.print.attribute.standard.JobMessageFromOperator;
import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int s = 0;
		// 2.  Ask the user a question 
		
		// 3.  Use an if statement to check if their answer is correct
		
		//}
		//if (Ans == "I don't know") {
		///	JOptionPane.showMessageDialog(null, "sorry");
		//}
		// 4.  if the user's answer is correct
			
		
			// -- add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		String Ans5 = JOptionPane.showInputDialog("how many moon is in the sky");
		if (Ans5 == "1") {
			JOptionPane.showMessageDialog(null, "you are right");
			s=s+1;
		}
		
		String Ans1 = JOptionPane.showInputDialog("how many sun is in the sky");
		if (Ans1 == "1") {
			JOptionPane.showMessageDialog(null, "you are right");
			s=s+1;
		}
		String Ans2 = JOptionPane.showInputDialog("how many star is in the sky");
		if (Ans2 == "100 b") {
			JOptionPane.showMessageDialog(null, "you are right");
			s=s+1;
		}
		// 6.  After all the questions have been asked, print the user's score 
		JOptionPane.showMessageDialog(null, s );

	}
}
