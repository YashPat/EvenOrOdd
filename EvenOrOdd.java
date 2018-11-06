import javax.swing.JOptionPane;					
import java.util.Scanner;								
import java.util.Random;
import java.awt.*;								
import java.applet.*;								
import java.awt.event.*;								
import java.io.*;   //for files						
import java.net.*;
import javax.sound.midi.*;
import java.util.Vector;
//import jmidi.*;
import static java.lang.System.*;
import static java.lang.Math.*;
import java.awt.Color;

public class EvenOrOdd
{
	public static void main (String args[])
	{
		    String even = "THE NUMBER IS EVEN";
		    String odd = "THE NUMBER IS ODD";
	    	int input;
	    	String input2;
	    	int determine;
	    	Scanner inMy = new Scanner (in);
			out.println("Enter a number:");
			input = inMy.nextInt();
			determine = input % 2;
			if (determine == 0)
			{
			
				out.println(even);
			}
			else
			if (determine != 0)
			{
				
				out.println(odd);
			}
    	
	}
}