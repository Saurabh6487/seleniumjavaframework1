package test;

import org.testng.annotations.Test;

@Test(groups= {"AllClassTests"})
public class TestNgGroupsdemo 
{
	
@Test(groups ={"sanity"})
public void test1()
{
	System.out.println("inside test1");
}
@Test(groups= {"sanity","smoke"})
public void test2()
{
	System.out.println("inside test2");
}	
@Test(groups= {"sanity","regression"})
public void test3()
{
	System.out.println("inside test3");
}
@Test
public void test4()
{
	System.out.println("inside test4");
}
}
