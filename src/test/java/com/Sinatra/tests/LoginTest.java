package com.Sinatra.tests;

import org.junit.Test;

public class LoginTest extends BaseTest
{

    @Test
    public void testLoginHappyPath()
    {
        home.navegar("https://evening-bastion-49392.herokuapp.com");
        home.verificarPagina();
        home.clickLogin();
        login.loginCorrecto("frank","sinatra");
        songs.verificarPagina();
        songs.verificarMensajeBienvenida("You are now logged in as frank");
    }

}
