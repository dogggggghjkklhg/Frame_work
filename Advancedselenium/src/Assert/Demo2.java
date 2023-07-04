package Assert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo2 {
	@Test 
	public void demo1()
	{
		System.out.print("hello1");
}
	@Test (dependsOnMethods = "demo1")
	
		public void demo2()
		{
			System.out.print("hello2");
Assert.fail();
	}
	@Test(dependsOnMethods = "demo2")
	public void demo3()
	{
		System.out.print("hello3");

}
	@Test(dependsOnMethods = "demo3")
	public void demo4()
	{
		System.out.print("hello4");

}

}
