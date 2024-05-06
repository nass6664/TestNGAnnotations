package TestNGAnnotations;

import org.testng.annotations.*;


public class day3 {
    @BeforeClass
    public void befoclas() {
        System.out.println("@BeforeClass = before executing any methods in the class - day3");
    }

    @Parameters({"URL", "APIKey/usrname"})
    @Test
    public void WebloginCarLoan(String urlname, String key) {
        //selenium
        System.out.println("Day3: WebloginCarLoan");
        System.out.println(urlname);
        System.out.println(key);

    }

    @BeforeMethod
    public void beforeevery() {
        System.out.println(" Days 3: I will execute before every test method in day 3 class");
    }

    @AfterMethod
    public void afterevery() {
        System.out.println("Days 3:   @AfterMethod I will execute after  every test method in day 3 class");
    }

    @AfterClass
    public void afteclas() {
        System.out.println("Day 3:  @AfterClass After executing all methods in the class");
    }

    @Test(groups = {"Smoke"})
    public void MobileLogincarLoan() {
        //Appium
        System.out.println("Day 3: Mobilelogincar  = Smoke");
    }

    @BeforeSuite
    public void Bfsuite() {
        System.out.println("@BeforeSuite - day3 - I am no 1");
    }

    @Test(enabled = false)
    public void MobilesignimcarLoan() {
        //Appium
        System.out.println(" day3 Mobile MobilesignimcarLoan");
    }

    @Test(dataProvider = "getData")
    public void MobilesignoutcarLoan(String username, String password) {
        //Appium
        System.out.println("day3 Mobile SIGNOUT");
        System.out.println(username);
        System.out.println(password);

    }

    @Test(dependsOnMethods = {"WebloginCarLoan", "MobilesignoutcarLoan"})
    public void APIcarLoan() {
        //Rest API automation
        System.out.println("APIlogincar");
    }

    @DataProvider
    public Object[][] getData() {
        //1st combiantion - username password - good credit history= row
        //2nd - username password  - no crdit history
        // 3rd - fraudelent credit history
        Object[][] data = new Object[3][2];
        //1st set
        data[0][0] = "firstsetusername";
        data[0][1] = "firstpassword";
        //couloumns in the row are nothing but values for that particualar combination(row)

        //2nd set
        data[1][0] = "secondsetusername";
        data[1][1] = "secondpassword";

        //3rd set
        data[2][0] = "thirdsetusername";
        data[2][1] = "thirdpassword";
        return data;


    }

}
