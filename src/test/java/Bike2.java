package test;

class Vehicle{  
	protected void run(){System.out.println("Vehicle is running");}  
}  
class Bike2 extends Vehicle{  
	public void run(){System.out.println("Bike is running safely");}  
  
public static void main(String args[]){  
	Vehicle obj = new Bike2();  
	obj.run(); 
	/*Vehicle v=new Vehicle();
			v.run();
obj.run(); 
Bike2 obj1 = new Bike2();  
obj1.run();

private
protected
default
public
*/}  
}