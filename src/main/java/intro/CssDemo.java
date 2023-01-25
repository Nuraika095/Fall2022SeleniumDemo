package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.net.http.WebSocket;
import java.util.List;


public class CssDemo extends BaseTest {

    @Test
    public void cssTest() {

        driver.get("https://www.amazon.com/");

        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Iphone", Keys.ENTER);

//        WebElement appleText = driver.findElement(By.cssSelector("li[id='p_89/Apple']"));
//
//        System.out.println(appleText.getText());


        WebElement find = driver.findElement(By.xpath("(//span[@class='a-expander-prompt'])[2]"));
        System.out.println(find.getText());

        List<WebElement> allBrands = driver.findElements(By.xpath("//div[@id='brandsRefinements']//ul/li/span/a"));
        int count = 0;
        for (WebElement e : allBrands) {
            count++;
            if (e.getText().contains("SAMSUNG")) {
                driver.findElement(By.xpath("(//div[@id='brandsRefinements']//ul/li/span/a/div/label/i)" + "[" + count + "]")).click();
                break;
            }
        }
    }
}


//        List<WebElement>allBrands = driver.findElements(By.xpath("//div[@id='brandsRefinements']"));
//
//        for (WebElement e : allBrands){
//            System.out.println(e.getText());
//            if (e.getText().equals("Nokia")){
//                e.click();
//            }
//        }
//    }
//}

