package exercises;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

import voce.SpeechSynthesizer;

public class SpellingBee {

	/*
	 * Get a random word using the randomWord() method and ask the user how to spell
	 * it using the speak() method. If the user spells it right move on to a new
	 * word, but if they do not spell it right ask again. The only place that you
	 * need to write code in is the stuffForYouToDo() method.
	 */

	// having a bit of trouble with this one.

	void stuffForYouToDo() {

		try {

			for (int i = 0;; i++) {

				String rw = getRandomWord();
				speak(rw);
				String spell = JOptionPane.showInputDialog(null, "How do you spell this word");

				while (!spell.equalsIgnoreCase(rw))

				{

					spell = JOptionPane.showInputDialog(null, "Try again");
					speak(rw);

				}
				if (spell.equalsIgnoreCase(rw)) {
					JOptionPane.showMessageDialog(null, "Correct.");

				}
			}
		}

		catch (Exception e) {
			
			System.out.println("user has quit.");
			JOptionPane.showMessageDialog(null, "bye.");
		}
	}

	public String getRandomWord() {
		return words.get(new Random().nextInt(lines));
	}

	public void speak(String words) {
		SpeechSynthesizer speaker = new SpeechSynthesizer("speaker");
		speaker.synthesize(words);
	}

	private int lines;
	private ArrayList<String> words = new ArrayList<>();

	public SpellingBee() {
		try {
			// Get the amount of lines
			LineNumberReader lnr = new LineNumberReader(
					new FileReader(new File("C:\\Users\\n1kola\\JavaFundamentals\\Lesson4\\lib", "randomwords.txt")));
			lnr.skip(Long.MAX_VALUE);// Skip to the end
			lines = lnr.getLineNumber();// Get last line number
			System.out.println(lines + " words loaded.");
			lnr.close();
			BufferedReader br = new BufferedReader(
					new FileReader(new File("C:\\Users\\n1kola\\JavaFundamentals\\Lesson4\\lib", "randomwords.txt")));
			for (int i = 0; i < lines; i++) {
				words.add(br.readLine()); // adds every line to the array
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		stuffForYouToDo();
	}

	public static void main(String[] args) {
		new SpellingBee();
	}

}