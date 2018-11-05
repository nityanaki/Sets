//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - Lab07b

import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import java.util.*;

public class OddEvenSets
{
	private Set<Integer> odds;
	private Set<Integer> evens;

	public OddEvenSets()
	{
		odds = new TreeSet<Integer>();
		evens = new TreeSet<Integer>();
	}

	public OddEvenSets(String line)
	{
		odds = new TreeSet<Integer>();
		evens= new TreeSet<Integer>();
		String[] hey = line.split(" ");
		for (int i=0;i<hey.length;i++)
		{
			if (Integer.parseInt(hey[i])%2==0)
				evens.add(Integer.parseInt(hey[i]));
			if (Integer.parseInt(hey[i])%2==1)
				odds.add(Integer.parseInt(hey[i]));
		}
	}

	public String toString()
	{
		return "ODDS : " + odds + "\nEVENS : " + evens + "\n\n";
	}
}
