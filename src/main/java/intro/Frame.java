package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Frame extends BaseTest{

    @Test
    public void test2(){
        driver.get("https://demoqa.com/frames");
//        driver.switchTo().frame(0);                     // with index
//        driver.switchTo().frame("frame1");           //      with ID
//        driver.switchTo().frame(driver.findElement(By.id("frame1"))); //By webElement
//        driver.switchTo().defaultContent();             // vozvrat na glavnuyu stranisu

        driver.switchTo().frame(2);
        WebElement text = driver.findElement(By.id("sampleHeading"));
        System.out.println(text.getText());
        driver.switchTo().defaultContent();
        driver.switchTo().frame(3);
        WebElement text2 = driver.findElement(By.id("sampleHeading"));
        System.err.println(text2.getText());
        driver.switchTo().defaultContent();

        WebElement frame = driver.findElement(By.xpath("//div[@class='pattern-backgound playgound-header']"));
        System.out.println(frame.getText());

    }
}
