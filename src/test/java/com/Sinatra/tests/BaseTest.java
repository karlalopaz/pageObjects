package com.Sinatra.tests;

import com.Sinatra.pages.HomePage;
import com.Sinatra.pages.LoginPage;
import com.Sinatra.pages.SongsPage;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    WebDriver driver;

    protected HomePage home;
    protected LoginPage login;
    protected SongsPage songs;

    @Before
    public void setUp()
    {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        home = new HomePage(driver);
        login = new LoginPage(driver);
        songs = new SongsPage(driver);
    }

    @After
    public void tearDown()
    {
        driver.quit();
    }
}
