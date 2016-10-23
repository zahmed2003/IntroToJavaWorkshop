package day3;

import java.io.IOException;

import javax.swing.JOptionPane;

public class StephenHawking {


	public static void main(String[] args) 
	
	{
		
		for (int i = 0; i < 20; i++) {
		
		String sent = JOptionPane.showInputDialog("Input a sentance");
		speak(sent);
		
		}
		
	}

	static void speak(String words) {
		try 
		
		{
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
