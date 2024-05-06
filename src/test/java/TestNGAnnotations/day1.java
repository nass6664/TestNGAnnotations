package TestNGAnnotations;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNGAnnotations.Listeners.class)
public class day1 {
    @AfterTest
    public void lastexecution() {
        System.out.println("day1  @AfterTest I will execute last");
    }

    @Test
    public void Demo() {
        System.out.println("day1 - hello I am in Demo...");//automation
        Assert.assertEquals("A","A");
    }

    @Test
    public void skipMe() {
        System.out.println("I was skipped...");//automation
        throw new SkipException("I was skipped");
    }

    @AfterSuite
    public void afSyite() {
        System.out.println("day1 -   @AfterSuite - I am the no 1 from last -After Suite ");
    }

    @Test
    public void SecondTest() {
        System.out.println("day1 -bye");
    }


}
