package com.imdb.tests.registration;

import com.imdb.tests.search.BaseTest;
import org.junit.Test;

public class registerTest extends BaseTest {

    @Test
    public void testRegisterNewUser() {
        home.navegar("https://imdb.com");
        home.verificarPagina();
        home.clickSignIn();
        login.comenzarRegistro();
        createAccount.crearCuenta("user", "email", "password");
        home.verificarNombreUsuario("user");
    }
}
