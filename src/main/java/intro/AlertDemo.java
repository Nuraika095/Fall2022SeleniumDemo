package intro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class AlertDemo extends BaseTest{

    @Test
    public void testAlert1(){
        driver.get("https://demoqa.com/alerts");

        WebElement alertButton = driver.findElement(By.id("alertButton"));
        alertButton.click();

        Alert alert = driver.switchTo().alert();
        alert.accept();
        Helper.pause(3000);
    }
    @Test
    public void testExplicitWaitAndAlert(){

        driver.get("https://demoqa.com/alerts");

        WebElement alertButton = driver.findElement(By.id("timerAlertButton"));
        alertButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        alert.accept();


    }
}
