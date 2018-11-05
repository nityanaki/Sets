//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - Lab07b: This lab goes with the OddEvenSets Java file. It creates a set of odd numbers and a set of even numbers from a given String.

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab07b
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("lab07b.dat"));
		while(file.hasNext())
		{
			String sent = file.nextLine();
			OddEvenSets test = new OddEvenSets(sent);
			out.println(test);
		}

	}
}
