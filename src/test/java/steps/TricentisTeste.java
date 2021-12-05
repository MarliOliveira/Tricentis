package steps;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagesTricentis.Insurance;
import pagesTricentis.Metodos;

public class TricentisTeste {
	
	Metodos metodos = new Metodos();
	Insurance ins = new Insurance();
	Elementos elementos = new Elementos();
	
	@Given("acessar o site da tricentis {string}")
	public void acessar_o_site_da_tricentis(String site) {
	 metodos.abriNavegador(site);   
	}

	@When("preencher dados do veiculo")
	public void preencher_dados_do_veiculo() {
		ins.dadosVeiculo("BMW", "Scooter", "1500", "100", "10/10/2019", "5", "3", "Diesel", "250", "450", "50000",
				"30000");
	}

	@When("preencher dados do seguro")
	public void preencher_dados_do_seguro() {
		ins.dadosSeguro("Larissa", "Ferreira", "10/10/1980", "Brazil", "1521259", "Employee");
	}

	@When("preencher dados do produto")
	public void preencher_dados_do_produto() {
		ins.dadosProduto("10/10/2022", "5.000.000,00", "Bonus 3", "Full Coverage", "No");
	}

	@When("selecionar opcao pagamento")
	public void selecionar_opcao_pagamento() {
		ins.dadosPreco();
	}

	@When("envio a cotacao")
	public void envio_a_cotacao() {
		ins.enviarCotacao("testeaccenture@test.com", "Test2", "Tesstt@121", "Tesstt@121",
				"Teste accenture finalizado com sucesso");

	}

	@Then("valido a mensagem de envio de e-mail com sucesso")
	public void valido_a_mensagem_de_envio_de_e_mail_com_sucesso() {
		metodos.validarTexto(elementos.getSendEmail(), "Sending e-mail success!");
		metodos.fecharNavegador();

	}

}
	