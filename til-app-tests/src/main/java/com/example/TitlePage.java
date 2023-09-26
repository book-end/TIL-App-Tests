package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitlePage {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://til-jade.vercel.app/");
        System.out.println(driver.getTitle());
    }
}
