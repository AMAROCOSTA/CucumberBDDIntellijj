$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("cadastro_usuario.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: pt"
    }
  ],
  "line": 4,
  "name": "Cadastro de usuário",
  "description": "",
  "id": "cadastro-de-usuário",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 3,
      "name": "@cadastro"
    }
  ]
});
formatter.scenario({
  "line": 9,
  "name": "Pesquisar produto",
  "description": "",
  "id": "cadastro-de-usuário;pesquisar-produto",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 8,
      "name": "@pesquisa_produto"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "que estou logado no site",
  "keyword": "Dado "
});
formatter.step({
  "line": 11,
  "name": "eu preencho o campo de pesquisa",
  "keyword": "Quando "
});
formatter.step({
  "line": 12,
  "name": "clico em pesquisar",
  "keyword": "E "
});
formatter.step({
  "line": 13,
  "name": "vejo o resultado de pesquisa",
  "keyword": "Então "
});
formatter.match({
  "location": "DescontosStep.que_estou_logado_no_site()"
});
formatter.result({
  "duration": 15566771300,
  "status": "passed"
});
formatter.match({
  "location": "DescontosStep.eu_preencho_o_campo_de_pesquisa()"
});
formatter.result({
  "duration": 165656200,
  "status": "passed"
});
formatter.match({
  "location": "DescontosStep.clico_em_pesquisar()"
});
formatter.result({
  "duration": 4547510900,
  "status": "passed"
});
formatter.match({
  "location": "DescontosStep.vejo_o_resultado_de_pesquisa()"
});
formatter.result({
  "duration": 8550095700,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Registra novo usuário com sucesso",
  "description": "",
  "id": "cadastro-de-usuário;registra-novo-usuário-com-sucesso",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 15,
      "name": "@cadastro_suceso"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "que estou na tela de login",
  "keyword": "Dado "
});
formatter.step({
  "line": 18,
  "name": "acesso o cadastro de usuário",
  "keyword": "E "
});
formatter.step({
  "line": 19,
  "name": "eu preencho o formulário de  cadastro",
  "keyword": "Quando "
});
formatter.step({
  "line": 20,
  "name": "clico registrar",
  "keyword": "E "
});
formatter.step({
  "line": 21,
  "name": "vejo cadastro realiado com sucesso",
  "keyword": "Então "
});
formatter.match({
  "location": "LoginStep.que_estou_na_tela_de_login()"
});
formatter.result({
  "duration": 1920400400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.acesso_o_cadastro_de_usuário()"
});
formatter.result({
  "duration": 373076700,
  "status": "passed"
});
formatter.match({
  "location": "DescontosStep.eu_preencho_o_formulário_de_cadastro()"
});
formatter.result({
  "duration": 8776022900,
  "status": "passed"
});
formatter.match({
  "location": "DescontosStep.clico_registrar()"
});
formatter.result({
  "duration": 15959115900,
  "status": "passed"
});
formatter.match({
  "location": "DescontosStep.vejo_cadastro_realiado_com_sucesso()"
});
formatter.result({
  "duration": 183767100,
  "status": "passed"
});
});