package Homework2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/Xpath.php");
        WebElement userName= driver.findElement(By.xpath("//input[@id='title']"));
        userName.sendKeys("Hyawata");
        WebElement button= driver.findElement(By.xpath("//button[@id='DisplayName']"));
        button.click();
        WebElement securityQuestion= driver.findElement(By.xpath("//input[@id='DisplayName']"));
        securityQuestion.sendKeys("I love Java");
        WebElement text= driver.findElement(By.xpath("//label[contains(text(),'ipsum')]"));
        System.out.println(text.getText());
        WebElement apiSettings= driver.findElement(By.xpath("//input[starts-with(@id,'apiSettings')]"));
        apiSettings.sendKeys("Hideki888");
        WebElement email1= driver.findElement(By.xpath("//input[@class='form-control backup']"));
        email1.sendKeys("H_yawata@msn.com");
        WebElement email2= driver.findElement(By.xpath("(//input[@class='form-control backup'])[2]"));
        email2.sendKeys("H_yawata@msn.com");
        WebElement email3= driver.findElement(By.xpath("(//input[@class='form-control backup'])[3]"));
        email3.sendKeys("H_yawata@msn.com");
        WebElement field1= driver.findElement(By.xpath("//input[@name='customField']"));
        field1.sendKeys("Hola");
        WebElement fiel2= driver.findElement(By.xpath("//input[@data-detail='two' and @name='customField']"));
        fiel2.sendKeys("Hello");
        WebElement field3= driver.findElement(By.xpath("//input[@name='customField1']"));
        field3.sendKeys("Kon nichiwa");
        WebElement field4= driver.findElement(By.xpath("(//input[@name='customField1'])[2]"));
        field4.sendKeys("Ola");



    }
}
