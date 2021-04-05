package demo;

public class ExceptionHandling {

	public static void main(String[] args) 
	{
 
		try 
		{
			System.out.println("Hello Saurabh");
			int i=1/0;
			System.out.println("Completed");
			
		}
		catch(Exception exp)
		{
			System.out.println("I am inside catch block");
			System.out.println("Mesaage is:"+exp.getMessage());
			System.out.println("cause is:"+exp.getCause());
			exp.printStackTrace();
		}
		finally
		{
			System.out.println("Kaisa hai bhai");
		}
		
		
		
	}

}
