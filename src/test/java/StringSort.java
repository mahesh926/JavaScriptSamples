package test;

import java.util.Comparator;

class StringSort implements Comparator<String>
{
	public int compare(String arg0,String arg1)
	{
	 return arg0.charAt(1)-arg1.charAt(1);
	}
	
}