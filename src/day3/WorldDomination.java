package day3;

import javax.swing.JOptionPane;

import org.omg.Messaging.SyncScopeHelper;

public class WorldDomination 

{
	public static void main(String[] args) 
	
	{
	
String code = JOptionPane.showInputDialog("Do you know how to write code?");

if(code.equalsIgnoreCase("yes"))
	
{
	
	JOptionPane.showMessageDialog(null, "You will rule the world!");
	
}

else
	
{
	
	JOptionPane.showMessageDialog(null, "Good luck washing dishes!");
	
}

	}
	
}

