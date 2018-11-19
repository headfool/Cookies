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
        int jPrime=480;
        int j =jPrime;
        int n =1;
        WebElement bigC = driver.findElement(By.id("bigCookie"));
        while(bigC.isDisplayed()) {
            for(int h=0;h<=18;h++) {
                try {
                    for (int i = 0; i < 100; i++) {
                        bigC.click();
                        bigC.click();
                        }
                    }catch (Exception cc) {
                }
                try {
                    driver.findElement(By.className("shimmer")).click();
                } catch (Exception c) {
                }
                System.out.print(" h:"+h);
            }
            WebElement upGrade = driver.findElement(By.id("upgrade1"));
            if (upGrade.getAttribute("class").equals("crate upgrade enabled")) {
                upGrade.click();
            }
            System.out.println(" j: "+j);
            int upg;
            if (j>15)
                upg = 15;
            else
                upg = j;
            WebElement product = driver.findElement(By.id("product" + upg));
            if (product.getAttribute("class").equals("product unlocked enabled")){
                product.click();
                jPrime=jPrime+2;
                j=j+jPrime;
            }
            /*try {
                driver.findElement(By.id("product" + j)).click();
                Thread.sleep(2000);
                j=j+10;
            } catch (Exception e) {}*/
            if (j<0){
                jPrime++;
                j=jPrime;
                System.out.print("J: "+j);
            } else {
                j--;
                System.out.print("j: "+j);
            }
            n++;
            System.out.print(" n:"+n);
        }
    }
}
