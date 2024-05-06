package HomeWork1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Syntax {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/input-form-locator.php");

        WebElement firstName=driver.findElement(By.name("first_name"));
        firstName.sendKeys("Hideki");
        Thread.sleep(2000);

        WebElement lastName=driver.findElement(By.name("last_name"));
        lastName.sendKeys("Yawata");
        Thread.sleep(2000);

        WebElement email=driver.findElement(By.name("email"));
        email.sendKeys("Hidekiyawata@msn.com");
        Thread.sleep(2000);

        WebElement submitButton=driver.findElement(By.id("submit_button"));
        submitButton.click();
    }
}

