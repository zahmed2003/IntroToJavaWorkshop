package day1.robot;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

/* Teacher’s note: before beginning, draw a pentagon and have students work out the angle that the robot will have to turn (360/5) */

public class PentagonCrazy {

	private void makePrettyThings() {
		
Robot dave = new Robot();
	
for (int i = 0; i < 1000; i++) {

	dave.move(i);
	dave.penDown();
	int pent = 5;
	int deg = 73;
	dave.turn(deg);
	dave.setSpeed(10);
	dave.setRandomPenColor();
	
}
	

	}

	// Variations:
	// *12. make the pattern really huge
	// *13. randomize the color of the pattern 
	// *14. experiment with different shapes

	public static void main(String[] args) {
		new PentagonCrazy().makePrettyThings();
	}
}