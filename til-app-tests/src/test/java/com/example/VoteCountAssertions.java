package com.example;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.junit.Assert;

public class VoteCountAssertions {

    @Test
    public void InterestingVoteCount() {
        System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://til-jade.vercel.app/");
        
        // wait until all facts display
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector(".fact")));

        // find a fact to vote on
        driver.findElement(By.xpath("//button[contains(text(), 'finance')]"));

        // click on vote button for the same fact
        driver.findElement(By.id("interesting-vote")).click();

        // find vote count
        String expectedCount = "👍 1";

        WebElement element = driver.findElement(By.xpath("//button[text()='1']"));
        String actualCount = element.getText();

        Assert.assertEquals(actualCount, expectedCount);
    }
}
