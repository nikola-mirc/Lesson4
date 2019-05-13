package exercises;

import org.jointheleague.graphical.robot.Robot;

import javax.swing.JOptionPane;

public class ObedientRobot {

	static Robot r2d2 = new Robot();

	static void drawCircle() {

		for (int i = 0; i < 36; i++) {

			r2d2.setPenWidth(20);
			r2d2.setSpeed(100);
			r2d2.penDown();
			r2d2.move(10);
			r2d2.turn(10);

		}
	}

	static void drawSquare() {

		for (int i = 0; i < 4; i++) {

			r2d2.setPenWidth(20);
			r2d2.setSpeed(100);
			r2d2.penDown();
			r2d2.move(200);
			r2d2.turn(90);

		}

	}

	static void drawTriangle() {

		for (int i = 0; i < 3; i++) {

			r2d2.setPenWidth(20);
			r2d2.setSpeed(100);
			r2d2.penDown();
			r2d2.move(200);
			r2d2.turn(120);

		}

	}

	public static void main(String[] args) {
		int shape = JOptionPane.showOptionDialog(null, "Which shape would you like me to draw?", "Obedient Robot", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Circle", "Square", "Triangle" }, null);

		new ObedientRobot();

		if (shape == 0) {
			drawCircle();
		} else if (shape == 1) {
			drawSquare();
		} else {
			drawTriangle();
		}

	}

}