package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.LoginPage;
import runner.RunCucumberTest;
import support.Utils;

public class LoginStep extends RunCucumberTest {

    LoginPage loginPage = new LoginPage();

    @Dado("^que estou na tela de login$")
    public void que_estou_na_tela_de_login() {
        loginPage.acessarTelaLogin();

    }
    @Dado("^acesso o cadastro de usuário$")
    public void acesso_o_cadastro_de_usuário() {
        loginPage.fillEmailCreate(Utils.getRandomEmail());
        loginPage.clickCreateAccountButton();

    }



}
