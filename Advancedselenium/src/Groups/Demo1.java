package Groups;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo1  {
	@Test(groups = "value1" )
	public void demo1()
	{
		System.out.print("hello1");
}
	@Test(groups = { "value1","value2"} )
	
		public void demo2()
		{
			System.out.print("hello2");
Assert.fail();
	}
	@Test(groups = "value1" )
	
	public void demo3()
	{
		System.out.print("hello3");

}
	@Test(groups = "value2" )
	public void demo4()
	{
		System.out.print("hello4");

}
	
}