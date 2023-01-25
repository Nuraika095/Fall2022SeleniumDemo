package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HomeWork extends BaseTest{

    @Test

    public void moveToElement(){
        driver.get("https://www.imoving.com/");

        WebElement houseTypeSelectMenu = driver.findElement(By.id("houseTypeSelectList"));

        Select select = new Select(houseTypeSelectMenu);
        select.selectByValue("1080");
        Helper.pause(3000);

        WebElement moveToSize = driver.findElement(By.id("hp-nav-select-house"));
        Select select1 = new Select(moveToSize);
        select1.selectByValue("9509");
        Helper.pause(3000);

        WebElement moveToNext = driver.findElement(By.xpath("//button[@class='btn btn-white quickQuoteLink']"));
        moveToNext.click();
        Helper.pause(3000);

        WebElement continueBox = driver.findElement(By.xpath("//span[@class='col-sm-9 col-xs-12']"));
        continueBox.click();
        Helper.pause(3000);

        driver.findElement(By.xpath("//div[@class='modal-buttons']/a")).click();
        Helper.pause(3000);
        driver.findElement(By.id("closeTutorial")).click();


        Actions action = new Actions(driver);
        WebElement pictureDresser = driver.findElement(By.xpath("//div[@class='14']//figure"));
        action.moveToElement(pictureDresser).build().perform();
        driver.findElement(By.xpath("//div[@class='14']//a[@class='btn btn-blue'][normalize-space()='Add to Inventory']")).click();
        Helper.pause(3000);
    }
}
