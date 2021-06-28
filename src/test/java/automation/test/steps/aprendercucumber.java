package automation.test.steps;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class aprendercucumber {

	
	
	@Given("A tela de Pesquisa Google")
	public void a_tela_de_pesquisa_google() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("TUD CERTO");
	}

	@When("pesquisar Youtube")
	public void pesquisar_youtube() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("TUD CERTO");
	}

	@Then("aparecer Youtube")
	public void aparecer_youtube() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("TUD CERTO");
	}
	
	private int contador = 0;
	
	@When("Pesquisar {int}")
	public void pesquisar(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	   contador= int1;
	}
	@Then("valor da pesquisa {int}")
	public void valor_da_pesquisa(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		contador++;
	    assert contador == int1;
	}
	
	@After(order = 1) //order te deixa colocar varios Afters depois da execucao, ordef 1 seria o rpimeiro 
	public void schreenShot() {
		
	}
	
	
}
