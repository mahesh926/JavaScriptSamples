package test;

public class foo {
	
	native int bar(String s);
	static
	{
		System.out.println("foo bar");	
	}
}
