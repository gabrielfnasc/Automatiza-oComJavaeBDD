package br.sp.ferreira.steps;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Assert;
import org.junit.Ignore;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	@Given("que estou no site")
	public void queEstouNoSite() {

	}

	@When("clico")
	public void clico() {

	}

	@Then("logo no site")
	public void logoNoSite() {

	}

	private int contador = 0;

	@Given("que o valor do contador é {int}")
	public void queOValorDoContadorÉ(Integer int1) {

		contador = int1;
	}

	@When("eu incrementar {int}")
	public void euIncrementar(Integer int1) {
		contador = contador + int1;
	}

	@Then("o valor do contador será {int}")
	public void oValorDoContadorSerá(Integer int1) {
		System.out.println(int1);
		System.out.println(contador);

	}

	Date entrega = new Date();

	@Given("que a entrega é dia {int}\\/{int}\\/{int}")
	public void queAEntregaÉDia(Integer dia, Integer mes, Integer ano) {
		Calendar cal = Calendar.getInstance();

		cal.set(Calendar.DAY_OF_MONTH, dia);
		cal.set(Calendar.MONTH, mes);
		cal.set(Calendar.YEAR, ano);
		entrega = cal.getTime();
	}

	@When("a entrega atrasar {int} dias")
	public void aEntregaAtrasarDias(Integer int1) {

		Calendar cal = Calendar.getInstance();
		cal.setTime(entrega);
		cal.add(Calendar.DAY_OF_MONTH, int1);
		entrega = cal.getTime();

	}

	@Then("^a entrega sera efetuada em (.*?)$")
	public void aEntregaSeraEfetuadaEm(String data) {

		DateFormat format = new SimpleDateFormat("dd/mm/yyyy");
		String dataformatada = format.format(entrega);
		// Assert.assertEquals(data, dataformatada);
	}

}
