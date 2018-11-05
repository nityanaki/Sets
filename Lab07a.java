//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.*;

public class Lab07a
{
	public static void main( String args[] )
	{
		String list = "a b c d e f g h a b c d e f g h i j k"; 
		System.out.println("Original List : " + list);
		out.println("Uniques : " + UniquesDupes.getUniques(list));
		out.println("Dupes : " + UniquesDupes.getDupes(list) + "\n\n");
		
		//more test cases
		String notherlist = "f f f f f g g a b c e df cats cats and boots";
		System.out.println("Original List : "+ notherlist);
		out.println("Uniques : " + UniquesDupes.getUniques(notherlist));
		out.println("Dupes : " + UniquesDupes.getDupes(notherlist) + "\n\n");
		
		String anotherlist = "tositinsolemn silence silence on a dull dull dark dock";
		System.out.println("Original List : "+ anotherlist);
		out.println("Uniques : " + UniquesDupes.getUniques(anotherlist));
		out.println("Dupes : " + UniquesDupes.getDupes(anotherlist) + "\n\n");
		
		String yetanotherlist = "";
		System.out.println("Original List : "+ yetanotherlist);
		out.println("Uniques : " + UniquesDupes.getUniques(yetanotherlist));
		out.println("Dupes : " + UniquesDupes.getDupes(yetanotherlist) + "\n\n");
				
	}
}