package test;

public class Hcl1 {
	public static void main(String[] args) {
		int x=5,y=0;
		try
		{
			try
			{
				System.out.println(x);
				System.out.println(x/y);
				System.out.println(y);
	
			}
			catch(ArithmeticException ex)
			{
				System.out.println("inner catch");
				throw ex;
			}
			catch (RuntimeException ex) {
				// TODO: handle exception
				System.out.println("inner catch 1");
				throw ex;
	
			}
			finally {
				System.out.println("inner finally 1");
				
			}
		}
		catch (Exception ex) {
			// TODO: handle exception
			System.out.println("outer catch 1");
			
		}

	}

}
