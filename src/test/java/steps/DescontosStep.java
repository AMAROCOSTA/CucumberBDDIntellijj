package steps;


import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.CadastroPage;
import pages.HomePage;
import pages.LoginPage;
import runner.RunCucumberTest;

public class DescontosStep extends RunCucumberTest {

    HomePage homepage = new HomePage(getDriver());
    CadastroPage cadastroPage = new CadastroPage();

    String nome = "Amaro";
    String sobrenome = "Costa";
    @Dado("^que estou no site da QAzando$")
    public void acessar_site_qazando(){
        getDriver().manage().window().maximize();
        homepage.acessarAplicacao();
    }
    @Quando("^eu preencho meu e-mail$")
    public void eu_preencho_meu_e_mail() throws InterruptedException {
        homepage.scrolldown();
        homepage.preencheemail();


    }
    @Quando("^clico em ganhar cupom$")
    public void clico_em_ganhar_cupom() {
        homepage.clickGanharDesconto();

    }

    @Então("^eu vejo o código de desconto$")
    public void eu_vejo_o_código_de_desconto() {
        homepage.verificarCupomDesconto();

    }
    @Dado("^que eu tenha o cupom$")
    public void que_eu_tenha_o_cupom() throws InterruptedException {
        getDriver().manage().window().maximize();
        homepage.acessarAplicacao();
        homepage.scrolldown();
        homepage.preencheemail();
        homepage.clickGanharDesconto();
        homepage.verificarCupomDesconto();
    }


    @Quando("^eu preencho o formulário de  cadastro$")
    public void eu_preencho_o_formulário_de_cadastro()  {
        cadastroPage.selectTitle(1);
        cadastroPage.first_name_field("Amaro");
        cadastroPage.last_name_field("Costa");
        cadastroPage.passoword_filed("1234@");
        cadastroPage.selectPaty(22,03,"1987");
        cadastroPage.fill_address1("Rua Automação na veia, 123");
        cadastroPage.fill_city_filed1("Florianópolis");
        cadastroPage.select_state1("Colorado");
        cadastroPage.fill_zip_filed1("88888");
        cadastroPage.fill_phone_name_filed1("+5581999991122");



    }

    @Quando("^clico registrar$")
    public void clico_registrar()  {
        cadastroPage.clickRegister();

    }

    @Então("^vejo cadastro realiado com sucesso$")
    public void vejo_cadastro_realiado_com_sucesso() {
        cadastroPage.valida_cadastro(nome, sobrenome);


    }
    @Dado("^que estou logado no site$")
    public void que_estou_logado_no_site()  {
        cadastroPage.acessarTelaLogin();

    }

    @Quando("^eu preencho o campo de pesquisa$")
    public void eu_preencho_o_campo_de_pesquisa() {
        cadastroPage.pesquisa_filed("shirt");


    }

    @Quando("^clico em pesquisar$")
    public void clico_em_pesquisar() {
        cadastroPage.click_em_pesquisar();

    }

    @Então("^vejo o resultado de pesquisa$")
    public void vejo_o_resultado_de_pesquisa()  {
        cadastroPage.click_em_adicionar();
        cadastroPage.click_em_checkout();

    }

}