package TestNGAnnotations;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {

	
	@Test(groups={"Smoke"})
	public void ploan()
	{
		System.out.println("day2 -I am in ploan - Groups Smoke");
	}
	
	@BeforeTest
	public void prerequisite()
	{
		System.out.println("day2 -@BeforeTest I will execute first- prerequisite");
	}
}
