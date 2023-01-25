package intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.LinkedList;
import java.util.Set;

public class BrowserHelper {

    private WebDriver driver;

    public BrowserHelper(WebDriver driver){
        this.driver = driver;
    }

    public void openURL(String URL){
        driver.navigate().to(URL);
    }

    public void goBack(){
        driver.navigate().back();
    }

    public void goForward(){
        driver.navigate().forward();
    }

    public void refreshThePage(){
        driver.navigate().refresh();
    }
    public Set<String> getWindowHandles(){
        return driver.getWindowHandles();
    }
    public void switchToWindow(int index){
        LinkedList <String> windowsId = new LinkedList<String>(getWindowHandles());
        if( index < 0 || index >windowsId.size()){
            throw new IllegalArgumentException("Invalid index: "+ index);
        }
        driver.switchTo().window(windowsId.get(index));
    }

    public void switchToParent(){
        LinkedList <String> windowsId = new LinkedList<String>(getWindowHandles());
        driver.switchTo().window(windowsId.get(0));
    }

    public static void waitForElementToBeDisplayed(WebDriver driver,WebElement element){
          new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(element));
    }


}
