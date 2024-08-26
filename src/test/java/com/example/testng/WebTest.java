package com.example.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
import java.time.Duration;
import webtest.utils.WebTestUtils;
public class WebTest {

    private EdgeDriver driver;



    @Test
    public void testBaidu() {
        driver.navigate().to("https://www.baidu.com/"); //访问百度首页
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//停顿10s，等待页面加载完成
//        driver.findElement(By.xpath("//input[@id='kw']")).sendKeys("webdriver"); //findElement by xpath
        driver.findElement(By.className("s_ipt")).sendKeys("webdriver"); //findElement by class_name
        driver.findElement(By.xpath("//input[@id='su']")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(driver.getPageSource().contains("简介及元素定位-CSDN博客"));
    }

}
