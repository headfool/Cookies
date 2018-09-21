package com.foolsinc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

import java.util.List;

import static java.lang.Math.sqrt;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        String localDir = System.getProperty("user.dir");
        String file = "SeleniumResources/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", file);
        WebDriver driver = new ChromeDriver();
        driver.get("http://orteil.dashnet.org/cookieclicker/");
        Thread.sleep(1000);
        int jPrime=20;
        int j =jPrime;
        int n =1;
        while(driver.findElement(By.id("bigCookie")).isDisplayed()) {
            for(int h=0;h<=20;h++) {
                for (int i = 0; i < 100; i++) {
                    try {
                        driver.findElement(By.id("bigCookie")).click();
                    } catch (Exception cc) {
                    }
                }
                try {
                    driver.findElement(By.className("shimmer")).click();
                } catch (Exception c) {
                }
                System.out.print(" h:"+h);
            }
            try {
                driver.findElement(By.id("upgrade1")).click();
            } catch (Exception d) {
            }
            System.out.println(" j: "+j);
            try {
                driver.findElement(By.id("product" + j)).click();
                //driver.findElement(By.id("product" + (j-1))).click();
            } catch (Exception e) {}
            if (j<0){
                jPrime++;
                System.out.print("reset J");
                j=jPrime;
            } else {
                System.out.print(" Decreased j");
                j--;
            }
            n++;
            System.out.print(" n:"+n);
        }
    }
}
