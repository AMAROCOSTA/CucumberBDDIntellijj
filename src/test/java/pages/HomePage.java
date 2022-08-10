package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import support.Utils;

public class HomePage extends Utils {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void acessarAplicacao(){
        driver.get("https://qazando.com.br/curso.html");
        waitElementEstarPresente(By.id("btn-ver-cursos"),10);
        Assert.assertEquals("Não acessou a aplicação",true,
                driver.findElement(By.id("btn-ver-cursos")).isDisplayed());
    }

    public void scrolldown() throws InterruptedException {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollTo(0, 10000)");
        Thread.sleep(2000);

    }
    public void preencheemail(){
        driver.findElement(By.id("email")).sendKeys("amaro_costa_87@hotmail.com");

    }
    public void clickGanharDesconto(){
        driver.findElement(By.id("button")).click();
    }

    public void verificarCupomDesconto(){
        String texto_cupom = driver.findElement(By.cssSelector("#cupom > h2 > span")).getText();
        System.out.println(texto_cupom);
        Assert.assertEquals("O cupom esta errado!","QAZANDO15OFF",texto_cupom);

    }

}
