package demo;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.Assert;
import org.openqa.selenium.By;
//Selenium Imports
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
///


public class TestCases {
    ChromeDriver driver;
    public TestCases()
    {
        System.out.println("Constructor: TestCases");
        WebDriverManager.chromedriver().timeout(30).setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    public void endTest()
    {
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();

    }

    
    public  void testCase01() throws InterruptedException{
// Navigate to URL  www.google.com
driver.get( "https://www.google.com");
  
// sendkeys "Amazon" Using Locator "XPath" //textarea[@class='gLFyf']
WebElement searchbox=driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
searchbox.sendKeys("Amazon");
Thread.sleep(3000);
// click on the search button Using Locator "XPath" (//input[@class='gNO89b'])[1]
WebElement searchbox1=driver.findElement(By.xpath("(//input[@class='gNO89b'])[1]"));
searchbox1.click();
Thread.sleep(1000);
// perform get text on webelement (//span[text()='Amazon.in'])[1] and then validate with isdisplayed method
WebElement link=driver.findElement(By.xpath("(//span[text()='Amazon.in'])[1]"));
boolean status=link.isDisplayed();
System.out.println("status is: "+ status );
//Assert.assertTrue(status);    

}


}
