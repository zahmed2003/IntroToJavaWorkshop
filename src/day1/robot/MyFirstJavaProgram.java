package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot dave = new Robot();

dave.setSpeed(9);
dave.penDown();
dave.setPenColor(255, 150, 73);
for (int i = 0; i < 4; i++) {
	
	dave.move(100);
	dave.turn(90);
	
}


	}
}
