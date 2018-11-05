//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - Lab07c

import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import static java.lang.System.*;

public class MathSet
{
	private Set<Integer> one;
	private Set<Integer> two;

	public MathSet()
	{
		one = new TreeSet<Integer>();
		two = new TreeSet<Integer>();
	}

	public MathSet(String o, String t)
	{
		one = new TreeSet<Integer>();
		two = new TreeSet<Integer>();
		String[] cats = o.split(" ");
		for (int i=0;i<cats.length;i++)
			one.add(Integer.parseInt(cats[i]));
		String[] pigs = t.split(" ");
		for (int j=0;j<pigs.length;j++)
			two.add(Integer.parseInt(pigs[j]));
	}

	public Set<Integer> union()
	{
		Set<Integer> onion = new TreeSet<Integer>();
		onion.addAll(one);
		onion.addAll(two);
		return onion;
	}

	public Set<Integer> intersection()
	{
		Set<Integer> onion = new TreeSet<Integer>();
		onion.addAll(one);
		onion.addAll(two);
		onion.retainAll(one);
		onion.retainAll(two);
		return onion;
	}

	public Set<Integer> differenceAMinusB()
	{
		Set<Integer> onion = new TreeSet<Integer>();
		onion.addAll(one);
		onion.removeAll(two);
		return onion;
	}

	public Set<Integer> differenceBMinusA()
	{
		Set<Integer> onion = new TreeSet<Integer>();
		onion.addAll(two);
		onion.removeAll(one);
		return onion;
	}
	
	public Set<Integer> symmetricDifference()
	{	
		Set<Integer> onion = new TreeSet<Integer>();
		onion.addAll(one);
		onion.removeAll(two);
		Set<Integer> honion = new TreeSet<Integer>();
		honion.addAll(two);
		honion.removeAll(one);
		Set<Integer> onionz = new TreeSet<Integer>();
		onionz.addAll(onion);
		onionz.addAll(honion);	
		return onionz;
	}	
	
	public String toString()
	{
		return "Set one " + one + "\n" +	"Set two " + two +  "\n";
	}
}
