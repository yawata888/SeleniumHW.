package Homework2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorPractice {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/cssSelector.php");
        WebElement id= driver.findElement(By.xpath("//input[@id='profileID']"));
        id.sendKeys("Hideki888");
        WebElement profile= driver.findElement(By.xpath("//input[@id='profileBox']"));
        profile.sendKeys("Hideki888");
        WebElement feedbackJenny= driver.findElement(By.xpath("//input[@id='feedback']"));
        feedbackJenny.sendKeys("Hideki is the best");
        WebElement feedbackJay= driver.findElement(By.xpath("//input[@class='form-control feedbackBox2']"));
        feedbackJay.sendKeys("Hideki is a great student and the next QA");
        WebElement email= driver.findElement(By.xpath("//input[@name='email']"));
        email.sendKeys("h_yawata@msn.com");
        WebElement topic= driver.findElement(By.xpath("//input[starts-with(@data-content,'CSS')]"));
        topic.sendKeys("Selenium");
        WebElement introCss= driver.findElement(By.xpath("//input[starts-with(@data-starts,'intro')]"));
        introCss.sendKeys("Selenium is great ");
        WebElement conclusion= driver.findElement(By.xpath("//input[@data-ends='CSSModuleConclusion']"));
        conclusion.sendKeys("It is easy when you study");

    }
}
