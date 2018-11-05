//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - Lab07a

import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.ArrayList;
import static java.lang.System.*;

public class UniquesDupes
{
	public static Set<String> getUniques(String input)
	{
		//Set<String> uniques = new TreeSet<String>();
		
		String[] words= input.split(" ");
		//ArrayList<String> hi= new ArrayList<String>(Arrays.asList(words));
		Set<String> uniques = new TreeSet<String>(Arrays.asList(words));
		

		return uniques;
	}

	public static Set<String> getDupes(String input)
	{
		Set<String> dupes = new TreeSet<String>();
		String[] words = input.split(" ");
		Set<String> uniques = new TreeSet<String>();
		for (int i=0;i<words.length;i++)
		{
			if (uniques.add(words[i])==false)
			{
				dupes.add(words[i]);
			}
		}
		
		return dupes;
	}
}
