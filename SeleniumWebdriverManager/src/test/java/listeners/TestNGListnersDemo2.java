package listeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class TestNGListnersDemo2 
{
	@Test
	public void test4()
	{
		System.out.println("Iam inside test4");
	}
	@Test
	public void test5()
	{
		System.out.println("Iam inside test5");
		
	}
	@Test
	public void test6()
	{
		System.out.println("Iam inside test6");
		throw new SkipException("This test is Skipped");
		
	}

	
}
