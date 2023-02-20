package com.sdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleBrowser {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.ie.driver", "Selenium\\demo\\src\\common\\Resources\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");

        WebElement googleInput = driver.findElement(By.className("gLFyf"));
        googleInput.sendKeys("Teste");
        googleInput.submit();
        Thread.sleep(5000);
        driver.quit();
        
    }
}
