package com.example;

import org.junit.Test;
import java.util.List;
import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class Assertions {

    @Test
    public void TitlePage() {
        System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://til-jade.vercel.app/");
        
        String expectedTitle = "Today I Learned";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @Test
    public void AllCategoryNumberOfFacts() {
        System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://til-jade.vercel.app/");

        driver.findElement(By.cssSelector(".btn-all-categories")).click();

        int expectedCount = 12;

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector(".fact")));

        List<WebElement> elements = driver.findElements(By.cssSelector(".fact"));
        int actualCount = elements.size();

        Assert.assertEquals(expectedCount, actualCount);
    }

    @Test
    public void TechnologyCategoryNumberOfFacts() {
        System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://til-jade.vercel.app/");

        driver.findElement(By.xpath("//button[contains(text(), 'technology')]")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector(".fact")));

        List<WebElement> elements = driver.findElements(By.cssSelector(".fact"));
        int actualCount = elements.size();
        int expectedCount = 3;

        Assert.assertEquals(actualCount, expectedCount);
    }

    @Test
    public void ScienceCategoryNumerOfFacts() {
        System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://til-jade.vercel.app/");

        driver.findElement(By.xpath("//button[contains(text(), 'science')]")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector(".fact")));

        List<WebElement> elements = driver.findElements(By.cssSelector(".fact"));
        int actualCount = elements.size();
        int expectedCount = 2;

        Assert.assertEquals(actualCount, expectedCount);
    }

    @Test
    public void FinanceCategoryNumberOfFacts() {
        System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://til-jade.vercel.app/");

        driver.findElement(By.xpath("//button[contains(text(), 'finance')]")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector(".fact")));

        List<WebElement> elements = driver.findElements(By.cssSelector(".fact"));
        int actualCount = elements.size();
        int expectedCount = 1;

        Assert.assertEquals(actualCount, expectedCount);
    }

    @Test
    public void SocietyCategoryNumberOfFacts() {
        System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://til-jade.vercel.app/");

        driver.findElement(By.xpath("//button[contains(text(), 'society')]")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector(".fact")));

        List<WebElement> elements = driver.findElements(By.cssSelector(".fact"));
        int actualCount = elements.size();
        int expectedCount = 2;

        Assert.assertEquals(actualCount, expectedCount);
    }

    @Test
    public void EntertainmentCategoryNumberOfFacts() {
        System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://til-jade.vercel.app/");

        driver.findElement(By.xpath("//button[contains(text(), 'entertainment')]")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector(".fact")));

        List<WebElement> elements = driver.findElements(By.cssSelector(".fact"));
        int actualCount = elements.size();
        int expectedCount = 1;

        Assert.assertEquals(actualCount, expectedCount);
    }

    @Test
    public void HealthCategoryNumberOfFacts() {
        System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://til-jade.vercel.app/");

        driver.findElement(By.xpath("//button[contains(text(), 'health')]")).click();

        List<WebElement> elements = driver.findElements(By.cssSelector(".fact"));
        int actualCount = elements.size();
        int expectedCount = 0;

        Assert.assertEquals(actualCount, expectedCount);
    }

    @Test
    public void HistoryCategoryNumberOfFacts() {
        System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://til-jade.vercel.app/");

        driver.findElement(By.xpath("//button[contains(text(), 'history')]")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector(".fact")));

        List<WebElement> elements = driver.findElements(By.cssSelector(".fact"));
        int actualCount = elements.size();
        int expectedCount = 3;

        Assert.assertEquals(actualCount, expectedCount);
    }

    @Test
    public void NewsCategoryNumberOfFacts() {
        System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://til-jade.vercel.app/");

        driver.findElement(By.xpath("//button[contains(text(), 'news')]")).click();

        List<WebElement> elements = driver.findElements(By.cssSelector(".fact"));
        int actualCount = elements.size();
        int expectedCount = 0;

        Assert.assertEquals(actualCount, expectedCount);
    }
}
