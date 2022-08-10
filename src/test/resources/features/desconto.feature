# language: pt

  Funcionalidade: Receber o cupom desconto da qazando
     Eu como usuário da qazando
     quero receber um cupom de desconto
     para comprar um curso com valor reduzido

    @gerar-cupom
    Cenario: Visualizar código de desconto
      Dado que estou no site da QAzando
      Quando eu preencho meu e-mail
      E clico em ganhar cupom
      Então eu vejo o código de desconto

    @confirmar-cupom
    Cenario: Visualizar código de desconto
      Dado que eu tenha o cupom

