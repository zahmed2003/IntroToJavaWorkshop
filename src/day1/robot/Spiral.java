package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
	
		Robot dave = new Robot();
	
		dave.penDown();
	
dave.setSpeed(10);
	
for (int i = 0; i < 75; i++) {
	
	dave.turn(360/7);
	dave.move(5*i);
	dave.setRandomPenColor();
	dave.setPenWidth(i);
	
}

	}
}
