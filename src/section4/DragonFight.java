package section4;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {
	// 1. Create a main method and put all of the code below inside of it
	public static void main(String[] args) {
		
		ImageIcon dragon = new ImageIcon("src/test/dragonPicture.jpg");		
		
		JOptionPane.showMessageDialog(null, "Defeat the dragon to take its treasure!", "Dragon Fighter", 0, dragon);
		// 2. Create a variable called "playerHealth" to store your health (set it equal to 100)
		int ph = 100;
		// 3. Create a variable called "dragonHealth" to store the dragon's health (set it equal to 100)
		int dh = 100;
		// 4. Create a variable to hold the damage the player's attack does each round
		int pd = 0;
		// 5. Create a variable to hold the damage the dragon's attack does each round
		int dd = 0;
		
		// 6.  Delete the slashes at the beginning of the next line.  
		while(ph>0 && dh>0) {    //this line of code keeps the battle going until someone's health reaches 0 
		
		// 7. Add a closing mustache at the very bottom of this program (since we just added an opening mustache on the previous step).
		
		// 8. Ask the player in a pop-up if they want to attack the dragon with a yell or a kick
		String a = JOptionPane.showInputDialog("do you want to attack the dragon with a yell or a kick");
		// 9. If they typed in "yell":
		if (a.equals("yell")) {
			//-- Find a random number between 0 and 10 and store it in dragonDamage
			int i = new Random().nextInt(11);
			dd = dd + i;
			//-- Subtract that number from the dragon's health variable 
			dh = dh - i;
			JOptionPane.showMessageDialog(null, "dragon health is  " + dh  + "  your health is  "+ ph  + "  dragon demage is   "+ dd + "  your damage is " + pd);	
		}
		// 10. If they typed in "kick":
		if (a.equals("kick")) {
			//-- Find a random number between 0 and 25 and store it in dragonDamage
			int c = new Random().nextInt(26);
			dd = dd + c;
			//-- Subtract that number from the dragon's health variable
			dh = dh - c;
			JOptionPane.showMessageDialog(null, "dragon health is  " + dh  + "  your health is  "+ ph  + "  dragon demage is   "+ dd + "  your damage is " + pd);	
			
			
		}
		else if (a.equals("hi")) {
			ph=ph+20;
		}
		// 11.  Find a random number between 0 and 35 and store it in playerDamage
		int b = new Random().nextInt(36);
		// 12. Subtract this number from the player's health
		ph=ph-b;
		pd=pd+b;
		
		
		// 13. If the user's health is less than or equal to 0
		if (ph <=0) {
		
			//-- Tell the user that they lost
			JOptionPane.showMessageDialog(null, "you lose");
		}
		// 14. Else if the dragon's health is less than or equal to 0
		else if (dh<= 0 ) {
			//-- Tell the user that the dragon is dead and they took a ton of gold!
			JOptionPane.showMessageDialog(null, " you win");
		}
	   //  15.  Else
		else {
			JOptionPane.showMessageDialog(null, "dragon health is  " + dh  + "  your health is  "+ ph  + "  dragon demage is   "+ dd + "  your damage is " + pd);	
		}
			//-- Pop up a message that tells the their current health and the dragon's currently health (Bonus: Also display the amount of health that was lost for each player this round)
			}
		}
	}

