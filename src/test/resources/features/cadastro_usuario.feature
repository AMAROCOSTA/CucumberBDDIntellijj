# language: pt

@cadastro
Funcionalidade: Cadastro de usuário



    @pesquisa_produto
  Cenario: Pesquisar produto
    Dado que estou logado no site
    Quando eu preencho o campo de pesquisa
    E clico em pesquisar
    Então vejo o resultado de pesquisa

  @cadastro_suceso
  Cenario: Registra novo usuário com sucesso
    Dado que estou na tela de login
    E acesso o cadastro de usuário
    Quando eu preencho o formulário de  cadastro
    E clico registrar
    Então vejo cadastro realiado com sucesso