package test;
import java.util.*;

import org.omg.CORBA.INTERNAL;

import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory.Default;

//import java.n
import java.math.BigDecimal;
class TestCollection11{  
	{
	
	
	try
	{
		m1();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
 public static void main(String args[]){  
  /* 
  TreeSet<Integer> al=new TreeSet<Integer>();  
  al.add("Ravi");  
  al.add("Vijay");  
  al.add("Ravi");  
  al.add("Ajay");  
  al.
  al.add(0);
  al.size();
  al.add(null);
  
  Iterator<Integer> itr=al.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 TreeMap<Integer,String> hm=new TreeMap<Integer,String>();  
  
  hm.put(100,"Amit");  
  hm.put(102,"Ravi");  
  hm.put(101,"Vijay");  
  hm.put(103,"Rahul");
  //hm.put(null, "mahi");
  
  
  for(Map.Entry m:hm.entrySet()){  
   System.out.println(m.getKey()+" "+m.getValue());  
  }  
  */
HashMap<Integer,String> hm1=new HashMap<Integer,String>();  
  
  hm1.put(100,"Amit");  
  hm1.put(101,"Vijay");  
  hm1.put(102,"Rahul");
  hm1.put(null, "mahi");
  hm1.put(null, "mahdi");
  for(Map.Entry h:hm1.entrySet())
	  System.out.println(h.getKey());
 }  
}  