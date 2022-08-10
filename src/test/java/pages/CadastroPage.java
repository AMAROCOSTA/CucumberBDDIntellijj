package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import runner.RunCucumberTest;
import support.Utils;

import static support.Utils.waitElementEstarPresente;

public class CadastroPage extends RunCucumberTest {


    private By titleM = By.id("id_gender1");
    private By titleF = By.id("id_gender2");
    private By first_name_field = By.id("customer_firstname");
    private By last_name_field = By.id("customer_lastname");
    private By passoword_filed = By.id("passwd");
    private By select_day_filed = By.id("days");
    private By select_months_filed = By.id("months");
    private By select_Years_filed = By.id("years");
    private By fill_address_filed = By.id("address1");
    private By fill_city_filed = By.id("city");
    private By select_state_filed = By.id("id_state");
    private By fill_zip_filed = By.id("postcode");
    private By fill_phone_filed = By.id("phone_mobile");
    private By subbmit_button = By.id("submitAccount");
    private By pesquisa_filed = By.id("search_query_top");
    private By create_email_field = By.id("email_create");
    private By Botao_pesquisa = By.className("button-search");
    private By adicionar_carrinho = By.className("ajax_add_to_cart_button");
    private By proceed_checkout = By.className("button-medium");
    private By continue_shopping = By.name("icon-chevron-left");


    public void selectTitle(Integer type) {
        Utils.waitElementEstarPresente(titleM, 20);
        if (type == 1) {
            getDriver().findElement(titleM).click();
        } else if (type == 2) {
            getDriver().findElement(titleF).click();

        }

    }

    public void first_name_field(String name) {
        getDriver().findElement(first_name_field).sendKeys(name);
    }

    public void last_name_field(String sobrenome) {
        getDriver().findElement(last_name_field).sendKeys(sobrenome);
    }

    public void passoword_filed(String pass) {
        getDriver().findElement(passoword_filed).sendKeys(pass);
    }

    public void selectPaty(Integer day, Integer months, String year) {
        Select select_day = new Select(getDriver().findElement(select_day_filed));
        select_day.selectByIndex(day);

        Select select_month = new Select(getDriver().findElement(select_months_filed));
        select_month.selectByIndex(months);

        Select select_year = new Select(getDriver().findElement(select_Years_filed));
        select_year.selectByValue(year);
    }

    public void fill_address1(String address) {
        getDriver().findElement(fill_address_filed).sendKeys(address);
    }

    public void fill_city_filed1(String city) {
        getDriver().findElement(fill_city_filed).sendKeys(city);
    }

    public void select_state1(String state) {
        Select select_state = new Select(getDriver().findElement(select_state_filed));
        select_state.selectByVisibleText(state);

    }

    public void fill_zip_filed1(String zipcode) {
        getDriver().findElement(fill_zip_filed).sendKeys(zipcode);
    }

    public void fill_phone_name_filed1(String phone) {
        getDriver().findElement(fill_phone_filed).sendKeys(phone);
    }

    public void clickRegister() {
        getDriver().findElement(subbmit_button).click();
    }


    public void valida_cadastro(String nome, String sobrenome) {
        Utils.waitElementEstarPresente(By.className("button-search"), 20);
        String resultado_atual = getDriver().findElement(By.cssSelector("#header > div.nav > div > div > nav > div:nth-child(1) > a > span")).getText();
        Assert.assertEquals(nome + " " + sobrenome, resultado_atual);

    }

    public void pesquisa_filed(String search) {
        getDriver().findElement(pesquisa_filed).sendKeys(search);



    }
    public void click_em_pesquisar(){
        getDriver().findElement(Botao_pesquisa).click();
    }

    public void acessarTelaLogin() {
        getDriver().get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        Utils.waitElementEstarPresente(create_email_field, 15);
    }

    public void click_em_adicionar(){
        getDriver().findElement(adicionar_carrinho).click();
        Utils.waitElementEstarPresente(By.className("exclusive-medium"), 15);
    }
    public void click_em_checkout(){

        getDriver().findElement(proceed_checkout).click();

    }
}

