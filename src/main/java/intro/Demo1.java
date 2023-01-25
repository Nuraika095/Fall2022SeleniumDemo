package intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Demo1 {

    @Test
    public void testDemo1(){

        WebDriverManager.chromedriver().setup();        // CONFIGURE CHROME DRIVER TO CONNECT BROWSER

        WebDriver driver = new ChromeDriver();         // Creating instance of ChromeDriver
        driver.manage().window().maximize();           // Maximizing window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));  //  Driver will wait 20 secs
        driver.get("https://demoqa.com/text-box");


        WebElement fullNameInputField = driver.findElement(By.id("userName"));  // Hotim   vvyste  v
                                                                                // poleimya polzovatelya

        fullNameInputField.sendKeys("Nura Toktomova");   // Write full name

        WebElement userEmail = driver.findElement(By.id("userEmail"));
         userEmail.sendKeys("ntoktomova@mail.ru");

         WebElement currentAdress = driver.findElement(By.id("currentAddress"));
         currentAdress.sendKeys("Address 123");

         WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        permanentAddress.sendKeys("NewAddress 223");

        currentAdress.getText();

//        WebElement submitButton = driver.findElement(By.id("submit"));
//        submitButton.click();




    }
}
