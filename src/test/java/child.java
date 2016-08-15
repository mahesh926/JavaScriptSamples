package test;
import javax.swing.JComponent;
import java.lang.RuntimeException;;

public class child extends parent
{
	
	public child()
	{
		count++;
	}
	
	
	public static void main(String[] args) {
	
		System.out.println(getcount());
		
		child c=new child();
		System.out.println(getcount());
	}
}
