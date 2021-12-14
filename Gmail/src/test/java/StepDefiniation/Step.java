package StepDefiniation;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Step {
     WebDriver driver;
    @Given("The user is on login page")
    public void The_user_is_on_login_page() {
        System.setProperty("webdriver.chrome.driver","C:\\Gmail\\src\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://mail.google.com/mail/u/0/#inbox");
        System.out.println("Invoked Gmail in Chrome");
    }

    @When("The user enters credentials and perform gmail login")
    public void The_user_enters_credentials_and_perform_gmail_login() {
        try {
            POM obj = new POM(driver);
            obj.enterEmail();
            obj.enterPassword();
        } catch (Exception e) {
            System.out.println("unable to enter Username and Password");
            e.getMessage();
        }
    }

    @Then("User should send email")
    public void User_should_send_email() {
        try {
            POM obj = new POM(driver);
            obj.sendemail();
        } catch (Exception e) {
            System.out.println("unable to send email");
            e.getMessage();
        }
    }

}
