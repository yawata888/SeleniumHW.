package HomeWork1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        WebElement createButton = driver.findElement(By.linkText("Create new account"));
        createButton.click();
        Thread.sleep(2000);

        WebElement firstName = driver.findElement(By.name("firstname"));
        firstName.sendKeys("Hideki");
        Thread.sleep(2000);

        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys("Yawata");
        Thread.sleep(2000);

        WebElement email = driver.findElement(By.name("reg_email__"));
        email.sendKeys("HIdekiyawata@msn.com");
        Thread.sleep(2000);

        WebElement emailConfirm= driver.findElement(By.name("reg_email_confirmation__"));
        emailConfirm.sendKeys("HIdekiyawata@msn.com");
        Thread.sleep(2000);

        WebElement newPassword = driver.findElement(By.name("reg_passwd__"));
        newPassword.sendKeys("Yawata123");
        Thread.sleep(2000);

        WebElement birthMonth = driver.findElement(By.name("birthday_month"));
        birthMonth.sendKeys("May");
        Thread.sleep(2000);

        WebElement birthDay = driver.findElement(By.name("birthday_day"));
        birthDay.sendKeys("03");
        Thread.sleep(2000);

        WebElement birthYear = driver.findElement(By.name("birthday_year"));
        birthYear.sendKeys("1985");
        Thread.sleep(2000);

        WebElement sex = driver.findElement(By.xpath("//input[@name='sex' and @value='2']"));
        sex.click();

        WebElement button = driver.findElement(By.name("websubmit"));
        button.click();

        WebElement message= driver.findElement(By.className("We need more information"));
        String text=message.getText();
        System.out.println(text);
    }
}



