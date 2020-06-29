package com.Sinatra.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;

    WebElement imageSinatra; //xpath=//img[@alt='Frank Sinatra']
    WebElement linkLogin; //linkText="log in"

    public HomePage(WebDriver wd){
        this.driver= wd;
    }

    public void navegar(String url){

    }

    public void verificarPagina() {

    }

    public void clickLogin(){

    }
}
