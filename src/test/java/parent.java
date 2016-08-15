package test;

public class parent {
	
	protected static int count=0;
	parent()
	{
		count++;
		
	}
	
	static int getcount()
	{
		return count;
		
	}

}
