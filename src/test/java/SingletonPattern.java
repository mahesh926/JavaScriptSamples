package test;

public class SingletonPattern {
	
	public static SingletonPattern obj;
	private SingletonPattern()
	{
		
	}
	
	public static SingletonPattern getInstance()
	{
		if(obj==null)
		{
			synchronized(SingletonPattern.class){  
		        if (obj == null){  
		            obj = new SingletonPattern();//instance will be created at request time  
		        }  
		    }
		
		    }
		return obj;  
		
	}
	
	/*
	public static SingletonPattern s=new SingletonPattern();
	
	
	public static SingletonPattern getInstance()
	{
		return s;
		
	}*/
	
	public void m1()
	{
		System.out.println("mahesh kumar");
	}

}
