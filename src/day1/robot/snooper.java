package day1.robot;

import javax.swing.JOptionPane;

public class snooper {
public static void main(String[] args) {
	String ultron=JOptionPane.showInputDialog("Who is your master?");
	String slave1=JOptionPane.showInputDialog("who is better brody mor asher?");
	String jangofett=JOptionPane.showInputDialog("who did you play in star trek?");
	String bobafett=JOptionPane.showInputDialog("did you know that i have had dihareah since easters?");
	JOptionPane.showMessageDialog(null, "your master is "+ultron+ " brody"+ " you played "+jangofett);
}
}
