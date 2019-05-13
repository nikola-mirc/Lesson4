package exercises;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class AnimalFarm {

	AnimalFarm() {

		String animal = JOptionPane.showInputDialog("Which animal do you wanna hear?");

		try {

			for (int i = 0;; i++) {

				if (animal.equalsIgnoreCase("cow")) {
					playMoo();
					animal = JOptionPane.showInputDialog("Let's try again.");
				} else if (animal.equalsIgnoreCase("duck")) {
					playQuack();
					animal = JOptionPane.showInputDialog("Let's try again.");
				} else if (animal.equalsIgnoreCase("dog")) {
					playWoof();
					animal = JOptionPane.showInputDialog("Let's try again.");
				} else if (animal.equalsIgnoreCase("cat")) {
					playMeow();
					animal = JOptionPane.showInputDialog("Let's try again.");
				} else if (animal.equalsIgnoreCase("llama")) {
					playLlama();
					animal = JOptionPane.showInputDialog("Let's try again.");
				} else {
					JOptionPane.showMessageDialog(null, "No such animal in this farm for now.");
					animal = JOptionPane.showInputDialog("Let' try again.");

				}

			}

		} catch (Exception e) {

			JOptionPane.showMessageDialog(null, "Bye.");
		}

	}

	void playMoo() {
		playNoise(mooFile);
	}

	void playQuack() {
		playNoise(quackFile);
	}

	void playWoof() {
		playNoise(woofFile);
	}

	void playMeow() {
		playNoise(meowFile);
	}

	void playLlama() {
		playNoise(llamaFile);
	}

	String quackFile = "sound/quack.wav";
	String mooFile = "sound/moo.wav";
	String woofFile = "sound/woof.wav";
	String meowFile = "sound/meow.wav";
	String llamaFile = "sound/llama.wav";

	public void playNoise(String soundFile) {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundFile));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new AnimalFarm();
	}

}
