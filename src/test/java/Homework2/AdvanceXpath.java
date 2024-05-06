package Homework2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceXpath {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/advanceXpath.php");
        WebElement enterFirstBook= driver.findElement(By.xpath("//input[@id='favourite-book']"));
        enterFirstBook.sendKeys("The Four Agreements");
        WebElement enterSecondBook= driver.findElement(By.xpath("//input[@id='favourite-book']/following-sibling::input[1]"));
        enterSecondBook.sendKeys("12 Rules of Life");
        WebElement enter3book= driver.findElement(By.xpath("//input[@id='favourite-book']/following-sibling::input[2]"));
        enter3book.sendKeys("The Mountain is You ");
        WebElement reverseOrder= driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[2]"));
        reverseOrder.sendKeys("The Mountain is You");
        WebElement reverseOrder1= driver.findElement(By.xpath("//input[@id='least-favorite']/preceding-sibling::input[1]"));
        reverseOrder1.sendKeys("12 Rules of Life");
        WebElement reverseOrder2= driver.findElement(By.xpath("//input[@id='least-favorite']"));
        reverseOrder2.sendKeys("The Four Agreements");
        WebElement names= driver.findElement(By.xpath("//div[@id='familyTree']/child::input[1]"));
        names.sendKeys("Rosa");
        WebElement names1= driver.findElement(By.xpath("//div[@id='familyTree']/child::input[2]"));
        names1.sendKeys("Julia");
        WebElement names2= driver.findElement(By.xpath("//div[@id='familyTree']/child::input[3]"));
        names2.sendKeys("Emma");





    }
}
