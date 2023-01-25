package intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Demo3 {
    @Test
    public void testDemo33(){

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://demoqa.com/text-box");

//        String text = driver.findElement(By.id())

        String expected = "Nura Toktomova";
        Assert.assertEquals("Nura Toktomova","Nura Toktomova");

        WebElement fullNameInputField = driver.findElement(By.id("userName"));
        fullNameInputField.sendKeys(expected);
        WebElement userEmail = driver.findElement(By.id("userEmail"));
        userEmail.sendKeys("ntoktomova@mail.ru");

        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys("Address 123");

        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        permanentAddress.sendKeys("NewAddress 223");
        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();

    }
}
