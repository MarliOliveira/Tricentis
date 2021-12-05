#Author: marlideoliveira2016@gmail.com

Feature: Teste Tricentis
  Eu como candidata quero acessar o site da Tricentis para realizar um teste  
  
  Background: Acessar o site da tricentis 
   Given acessar o site da tricentis "http://sampleapp.tricentis.com/101/app.php"

  Scenario: Cotacao automobile     
    When preencher dados do veiculo 
    And preencher dados do seguro 
    And preencher dados do produto 
    And selecionar opcao pagamento
    And envio a cotacao 
    Then valido a mensagem de envio de e-mail com sucesso 