package day3;

import javax.swing.JOptionPane;

public class MadLibs

{

	public static void main(String[] args) 
	
	{
		
		String Noun1 = JOptionPane.showInputDialog("Input a subject (you, we, they)");
		String Verb = JOptionPane.showInputDialog("Input a present tense verb");
		String Noun2 = JOptionPane.showInputDialog("Input a place");
		
		JOptionPane.showMessageDialog(null, Noun1  +  " are " +Verb  + " to the " +  Noun2 + ". ");
		
	}
	
}
