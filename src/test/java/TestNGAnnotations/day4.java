package TestNGAnnotations;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class day4 {

	@Parameters({ "URL" })
	@Test
	public void WebloginHomeLoan(String uname)
	{
		//selenium
		System.out.println("day4 webloginhomePersonalLoan");
		System.out.println(uname);
		
	}
	
	
	@Test(groups={"Smoke"})
	public void MobileLoginHomeLoan()
	{
		//Appium
		System.out.println("day4 -MobileloginHome");
	}
	
	@Test
	public void LoginAPIHomeLoan()
	{
		//Rest API automation
		System.out.println("day4  - APIloginHome");
	}
}
