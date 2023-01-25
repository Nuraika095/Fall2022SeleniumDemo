package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;



public class XpathDemo extends BaseTest{

    @Test
    public void xpathTest(){

//        String name = driver.findElement(By.tagName("h5")).getText();
//        System.out.println(name);
//


        driver.get("https://demoqa.com/text-box");

       WebElement  nameText = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[2]/div[1]/label\n"));
                                                                     // ^ nahodim po etomu divu put k xpath ABSOLUTE
                                                                     // if we write // its RELATIVE XPATH
                                                            //     (//button[@type= 'button'])[2]   eshe odin tip


        String expectedEmailText = "Email";                     //  System.out.println(nameText);
        Assert.assertEquals(nameText.getText(),expectedEmailText);
        WebElement nameText2 = driver.findElement(By.xpath("//label[@id='userEmail-label']"));
        Assert.assertTrue(expectedEmailText.contains(nameText2.getText()));




    }

    @Test
    public void xpathTest2(){

        WebElement userName = driver.findElement(By.xpath("//input[@id='userName']"));
        userName.sendKeys("Test123");
        System.out.println("Result: " + userName.getAttribute("value"));
        Assert.assertEquals(userName.getAttribute("value"),"Test123");

    }
}
