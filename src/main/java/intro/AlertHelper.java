package intro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class AlertHelper {

    private WebDriver driver;
    private  Alert alert ;

    public AlertHelper(WebDriver driver) {
        this.driver = driver;
    }


    public void acceptAlert(){
        alert = driver.switchTo().alert();
        alert.accept();
    }
    public void dismissAlert(){
        alert.dismiss();
    }
    public void sendKeysAlert(String text){
        driver.switchTo().alert();
        alert.sendKeys(text);

    }


}
