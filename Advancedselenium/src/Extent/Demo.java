package Extent;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Demo {
	@Test
	public void disp()
	{
		ExtentReports ER= new ExtentReports("./reports/r.html",false);
	ExtentTest t1	= ER.startTest("tc1");
	
	t1.log(LogStatus.PASS, "passed tc");
	t1.log(LogStatus.FAIL, "failed tc");
	t1.log(LogStatus.SKIP, "skiped tc");
	ER.endTest(t1);
}
}
