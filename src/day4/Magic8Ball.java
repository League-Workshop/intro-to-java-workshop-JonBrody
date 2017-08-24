package day4;

// Copyright Wintriss Technical Schools 2013
import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
	public static void main(String[] args) {

		// 2. Make a variable that will hold a random number and put a random number
		// into this variable using "new Random().nextInt(4)"
		int Boba_fett = new Random().nextInt(11);
		// 3. Print out this variable
		System.out.println(Boba_fett);
		// 4. Get the user to enter a question for the 8 ball
		String me = JOptionPane.showInputDialog("ask any question");
		// 5. If the random number is 0
		if (Boba_fett == 0) {
			JOptionPane.showMessageDialog(null, "never you idiot");
		}
		if (Boba_fett == 1) {
			JOptionPane.showMessageDialog(null, "shut up and die");
		}
		if (Boba_fett == 2) {
			JOptionPane.showMessageDialog(null, "most likely");
		}
		if (Boba_fett == 3) {
			JOptionPane.showMessageDialog(null, "die in a hole");
		}

		if (Boba_fett == 4) {
			JOptionPane.showMessageDialog(null, "definatelly?");
		}

		if (Boba_fett == 5) {
			JOptionPane.showMessageDialog(null, "your stupid");
		}

		if (Boba_fett == 6) {
			JOptionPane.showMessageDialog(null, "i will not tell you");
		}

		if (Boba_fett == 7) {
			JOptionPane.showMessageDialog(null, "you are retarded");
		}
		if (Boba_fett == 8) {
			JOptionPane.showMessageDialog(null, "maybe");
		}

		if (Boba_fett == 9) {
			JOptionPane.showMessageDialog(null, "its possible");
		}

		if (Boba_fett == 10) {
			JOptionPane.showMessageDialog(null, "no");
		}

		if (Boba_fett == 11) {
			JOptionPane.showMessageDialog(null, "yes");
		}

		// -- tell the user "Yes"

		// 6. If the random number is 1

		// -- tell the user "No"

		// 7. If the random number is 2

		// -- tell the user "Maybe you should ask Google?"

		// 8. If the random number is 3

		// -- write your own answer
	}
}