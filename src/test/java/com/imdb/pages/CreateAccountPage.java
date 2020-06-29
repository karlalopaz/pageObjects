package com.imdb.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateAccountPage
{

    public WebDriver driver;

    WebElement campoNombre; // id="ap_customer_name"
    WebElement campoEmail; // id="ap_email"
    WebElement campoPassword; // id="ap_password"password_check"
    WebElement campoConfirmar; // id="continue"
    WebElement botonCrearCuenta; //    id="ap_

    public CreateAccountPage(WebDriver driver)
    {
        this.driver = driver;
    }
    public void crearCuenta(String name, String email, String password)
    {
    }
}

