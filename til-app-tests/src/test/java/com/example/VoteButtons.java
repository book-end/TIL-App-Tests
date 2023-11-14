package com.example;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.junit.Assert;

public class VoteButtons {

    @Test
    public void InterestingVoteCount() {
         System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://til-jade.vercel.app/");

        // find a fact to vote on
        driver.findElement(By.xpath("//button[contains(text(), 'finance')]")).click();
        
        // wait until all facts display
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector(".fact")));

        String actualCount = driver.findElement(By.id("mindblowing-vote")).getText();
        
        driver.findElement(By.id("mindblowing-vote")).click();

        String expectedCount = driver.findElement(By.id("mindblowing-vote")).getText();

        Assert.assertEquals(expectedCount, actualCount);      
    }

    @Test
    public void MindblowingVoteCount() {
         System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://til-jade.vercel.app/");

        // find a fact to vote on
        driver.findElement(By.xpath("//button[contains(text(), 'finance')]")).click();
        
        // wait until all facts display
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector(".fact")));

        String actualCount = driver.findElement(By.id("mindblowing-vote")).getText();

        // click on vote button for the same fact and get count
        driver.findElement(By.id("mindblowing-vote")).click();

        String expectedCount = driver.findElement(By.id("mindblowing-vote")).getText();

        Assert.assertEquals(expectedCount, actualCount);       
    }

    @Test
    public void FalseVoteCount() {
         System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://til-jade.vercel.app/");

        // find a fact to vote on
        driver.findElement(By.xpath("//button[contains(text(), 'finance')]")).click();
        
        // wait until all facts display
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector(".fact")));

        String actualCount = driver.findElement(By.id("false-vote")).getText();

        driver.findElement(By.id("false-vote")).click();

        String expectedCount = driver.findElement(By.id("false-vote")).getText();

        Assert.assertEquals(expectedCount, actualCount);       
    }
}
