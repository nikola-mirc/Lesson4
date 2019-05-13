package optional;

import javax.swing.JOptionPane;

import voce.SpeechSynthesizer;

public class StephenHawking {

	static void speak(String words) {
		SpeechSynthesizer speaker = new SpeechSynthesizer("speaker");
		speaker.synthesize(words);
	}

	public static void main(String[] args) {

		new StephenHawking();

		for (int i = 0; i < 3; i++) {

			String sentence = JOptionPane.showInputDialog("Enter sentence");
			speak(sentence);

		}

	}

}
