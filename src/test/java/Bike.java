package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

abstract class Bike{  
	  abstract void run();  
	}  
	  
abstract class Honda4 extends Bike{  
	void run(){System.out.println("running safely..");}  
}
class honda{
	
	public static void main(String args[]){  
	 honda obj = new Honda4();  
	 obj.run();  
	 List l=new ArrayList();
	 
	 Map<String, String> m=new HashMap<String, String>();
	 m.put("1", "mahesh");
	}  
	}  }