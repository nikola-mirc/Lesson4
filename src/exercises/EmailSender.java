package exercises;

import java.util.Random;

import javax.swing.JOptionPane;

public class EmailSender {

	void go() {

		try {
			emailAddress = JOptionPane.showInputDialog("Enter e-mail address:");
			setEmailAddress(emailAddress);
			String message = JOptionPane.showInputDialog("Enter message:");

			if (emailChecker() == true) {
				send(message);
				JOptionPane.showMessageDialog(null, "Email sent");
			} else {
				JOptionPane.showMessageDialog(null, "Invalid email");
			}

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

	boolean emailChecker() {
		if (this.emailAddress.isBlank() || !emailAddress.contains("@") || !emailAddress.contains(".")) {

			return false;
		} else
			return true;
	}

	private String emailAddress = "";
	private String message = "";

	void setEmailAddress(String email) {
		this.emailAddress = email;
	}

	void send(String message) {
		this.message = message;
	}

	public static void main(String[] args) {
		new EmailSender().go();
	}
}
