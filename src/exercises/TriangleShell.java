package exercises;

import org.jointheleague.graphical.robot.Robot;

public class TriangleShell {

	Robot bb8 = new Robot("mini");

	void go() {

		bb8.setSpeed(100);
		int length = 50;
		for (int i = 0; i < 60; i++) {

			bb8.setRandomPenColor();
			length += 10;
			drawTriangle(length);
			bb8.turn(6);
		}
	}

	private void drawTriangle(int length) {

		bb8.setPenWidth(10);
		bb8.penDown();

		for (int i = 0; i < 3; i++) {

			bb8.move(length);
			bb8.turn(120);

		}

	}

	public static void main(String[] args) {
		new TriangleShell().go();
	}
}
