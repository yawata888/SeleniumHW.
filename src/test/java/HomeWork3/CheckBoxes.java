package HomeWork3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxes {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-checkbox-demo.php");
        WebElement singleCheckBox= driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
        singleCheckBox.click();
        List<WebElement> checkBoxes=driver.findElements(By.xpath("//input[@class='cb1-element']"));
        for(WebElement checkBox:checkBoxes){
            String value = checkBox.getAttribute("value");
            //  checkBox.click();
            if(value.equalsIgnoreCase("Option-2")){
                checkBox.click();
            }
        }
        WebElement enableCheckBox= driver.findElement(By.xpath("//button[@id='enabledcheckbox']"));
        enableCheckBox.click();
        List<WebElement> checkDemoBoxes=driver.findElements(By.xpath("//input[@class='checkbox-field']"));
        for (WebElement checkDemoBox:checkDemoBoxes){
            String value=checkDemoBox.getAttribute("value");
            if (value.equalsIgnoreCase("Checkbox-4")){
                checkDemoBox.click();
            }
        }
    }
}
