package TestNGAnnotations;

import org.testng.ITestListener;
import org.testng.ITestResult;

/*

onStart(|TestContext argO)
onFinish(|TestContext argO)
onTestFailure(ITestResult result)
onTestSkipped(ITestResult arg0)
onTestStart(ITestResult result)
onTestSuccess(Restesutl ITestResult arg0)
onTestFailedButWithinSuccessPercentage||TestResult agrO)
 */
public class Listeners implements ITestListener {

   public void onTestStart(ITestResult arg0){
       System.out.println("Start test ........"+ arg0.getName());
    }
    public void onTestSuccess(ITestResult arg0){
        System.out.println("Passed Test ........"+ arg0.getName());
    }
public void onTestFailure(ITestResult arg0) {
    System.out.println("Test Failed ........" + arg0.getName());
}
 public void onTestSkipped(ITestResult arg0){
     System.out.println("Test Skipped ........" + arg0.getName());
}

}
