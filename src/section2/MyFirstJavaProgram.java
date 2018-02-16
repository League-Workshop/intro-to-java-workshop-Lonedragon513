package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {

	public static void main(String[] args) {

		// START HERE

		Robot Bb = new Robot();
		Bb.miniaturize();
		Bb.setSpeed(100);
		Bb.penDown();
		// Bb.move(100);
		// Bb.turn(90);
		for (int i = 0; i < 360; i++) {
			Bb.setPenWidth(6);
			Bb.setRandomPenColor();
			Bb.move(2);
			Bb.turn(1);
		}

	}
}
