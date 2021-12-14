package StepDefiniation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POM {

    WebDriver driver;

    POM(WebDriver driver) {
        this.driver = driver;
    }

    public void enterEmail(){
        By objEmail= By.xpath("//*[@id=\"identifierId\"]");
        By objNextEmail= By.xpath("(//*[@class=\"VfPpkd-vQzf8d\"])[1]");
        driver.findElement(objEmail).sendKeys("vikasdagwar12345@gmail.com");
        driver.findElement(objNextEmail).click();
        System.out.println("Entered Email ID");
    }

    public void enterPassword(){
        By objPassword= By.xpath(" //*[@name=\"password\"]");
        By objNextPass= By.xpath("//*[@id=\"passwordNext\"]");
        driver.findElement(objPassword).sendKeys("November2021");
        driver.findElement(objNextPass).click();
        System.out.println("Entered Password");
    }

    public void sendemail(){
        By objCompose= By.xpath("//*[@class=\"T-I T-I-KE L3\"]");
        By objTo= By.xpath("//*[@name=\"to\"]");
        By objSub= By.xpath("//*[@class=\"aoT\"]");
        By objMsg= By.xpath("//*[@class=\"Am Al editable LW-avf tS-tW\"]");
        By objSend= By.xpath("//*[@class=\"T-I J-J5-Ji aoO v7 T-I-atl L3\"]");
        driver.findElement(objCompose).click();
        driver.findElement(objTo).sendKeys("vikasdagwar12345@gmail.com");
        driver.findElement(objSub).sendKeys("Incubyte");
        driver.findElement(objMsg).sendKeys("Automation QA test for Incubyte");
        driver.findElement(objSend).click();
        System.out.println("Sent Email");
    }
}
