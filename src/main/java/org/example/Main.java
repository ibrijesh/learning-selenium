package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Main {

    public static void main(String[] args)
    {
        WebDriver driver=new ChromeDriver();

        driver.get("http://google.com");

        WebElement searchBox=driver.findElement(By.name("q"));
        searchBox.click();

        searchBox.sendKeys("Selenium Testing");
        searchBox.sendKeys(Keys.ENTER);

        List<WebElement> allLinks = driver.findElements(By.tagName("a"));

        long count=0;

        WebElement link=allLinks.get(42);

        driver.get(link.getAttribute("href"));

        System.out.println(link.getAttribute("href"));

//        for(WebElement link:allLinks){
//
//            System.out.println(link.getText() + " - " + link.getAttribute("href"));
//            System.out.println(count+" \n");
//            count+=1;
//        }

    }
}
