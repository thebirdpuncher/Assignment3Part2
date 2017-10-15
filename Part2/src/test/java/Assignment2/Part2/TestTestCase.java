package Assignment2.Part2;

import junit.framework.TestCase;

public class TestTestCase extends TestCase 
{
	TestClass testObj;
	int a;
	int b;
	
	protected void setUp() throws Exception
	{
		a = 2;
		b = 1;
		testObj = new TestClass();
	}
	
	protected void tearDown() throws Exception
	{
		testObj = null;
		a = 0;
		b = 0;
	}
	
	public void testAdd()
	{
		assertEquals(3, testObj.add(a, b));
	}
	
	public void testMultiply()
	{
		assertEquals(2, testObj.multiply(a,b));
	}
		
	public void testSubtract()
	{
		assertEquals(1, testObj.subtract(a, b));
	}
	
	public void testCube()
	{
		assertEquals(8, testObj.cube(a));
	}

}
