package intro;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.time.Duration;

public class Demo2 {


        @Test
        public  void testDemo2() throws InterruptedException {


        Faker faker = new Faker();

        WebDriverManager.chromedriver().setup();

       WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
        driver.get("https://demoqa.com/text-box");

        WebElement fullNameInputField = driver.findElement(By.id("userName"));


//        WebElement emailInputField = driver.findElement(By.id("userEmail"));
//        WebElement currentAddressInputField = driver.findElement(By.id("currentAddress"));
//        WebElement permanentAddressInputField = driver.findElement(By.id("permanentAddress"));

//            JavascriptExecutor js =(JavascriptExecutor) driver;
//            js.executeScript("window.scrollBy(0,250)","");







        String fullName = faker.name().fullName();   //Nuraiym
//        String email =faker.internet().emailAddress();
//        String currentAddress = faker.address().fullAddress();
//        String permanentAddress = faker.address().secondaryAddress();

        fullNameInputField.sendKeys(fullName);
//        emailInputField.sendKeys(email);
//        currentAddressInputField.sendKeys(currentAddress);
//        permanentAddressInputField.sendKeys(permanentAddress);

        Thread.sleep(3000); //mojno preostonobit no 3 sec

            WebElement submitButton = driver.findElement(By.id("submit"));
            submitButton.click();



        WebElement actualFullNameElement = driver.findElement(By.id("name"));
//        WebElement actualEmailElement = driver.findElement(By.id("email"));
//        WebElement actualCurrentAddressElement = driver.findElement(By.xpath("//p[@id='currentAddress']"));
//        WebElement actualPermanentAddressElement = driver.findElement(By.xpath("//p[@id='permanentAddress']"));

            String actualNameText = actualFullNameElement.getText();
//            String actualEmailText = actualEmailElement.getText();
//            String actualCurrentAddressText = actualCurrentAddressElement.getText();
//            String actualPermanentAddressText =  actualPermanentAddressElement.getText();

            Assert.assertEquals(actualNameText,"Name:" + fullName);







    }
}
