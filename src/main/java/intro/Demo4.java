package intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Demo4 {

     WebDriver driver;

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.amazon.com/");

    }

//    @Test
//    public void checkTest(){
//
//        WebElement nameText = driver.findElement(By.xpath("//h2[@class='a-color-base headline truncate-2line']"));
//        String expectedElectronicsText = "Electronics";
//        Assert.assertEquals(nameText.getText(),expectedElectronicsText);e4e
//    }

    @Test
    public  void setDriver(){

        WebElement nameText2 = driver.findElement(By.xpath("//h2[@class='a-color-base headline truncate-2line']"));

        String expectedDressesText = "Dresses";
        Assert.assertEquals(nameText2.getText(),expectedDressesText);

    }

    @AfterClass
    public void tearDown(){
        driver.close();
        driver.quit();
    }
}
