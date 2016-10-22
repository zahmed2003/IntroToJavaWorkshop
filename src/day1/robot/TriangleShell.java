package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class TriangleShell {

	// 1. Create a new Robot
Robot dave = new Robot();
	
	void go() {
	// 3. delete this line (used only for testing)

		// 6. Make the robot go as fast as possible
dave.setSpeed(10);
		// 4. make a variable to hold the length of the triangle and set it to 50
int length = 210;

		// 7. Do the following (up to step 10) 60 times
for (int i = 0; i < 10; i++) {
	drawTriangle(210);
dave.setRandomPenColor();	
	dave.turn(6);
	
}
			// 9. Change the color of the pen to a random color
	
			// 8. Increase the length of the side by 10 pixels
	
			// 5. call your drawTriangle() method using your length variable
	
			// 10. Turn the tortoise 6 degrees to the right

	}

	/* 2. fill in the method below to draw a triangle. Use the length variable for the size of the triangle. */
	private void drawTriangle(int length) {
	
		
		dave.penDown();
		for (int i = 0; i < 3; i++) {
			
			dave.turn(360/3);
			dave.move(length);
			
		}
		
		
	}

	
	public static void main(String[] args) {
		new TriangleShell().go();
	}
}
