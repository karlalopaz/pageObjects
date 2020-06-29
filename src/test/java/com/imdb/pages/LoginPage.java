package com.imdb.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage
{

    public WebDriver driver;
    WebElement botonCrearUsuario;    //    : css=".create-account"
    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
    }
    public void comenzarRegistro()
    {
    }

}
