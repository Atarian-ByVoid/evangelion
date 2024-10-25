package com.beto.evangelion.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EvangelionSteps {
    private String piloto;
    private String unidade;
    private int taxaSincronizacao;

    @Given("o piloto {string}")
    public void oPiloto(String nome) {
        this.piloto = nome;
    }

    @Given("a unidade de Eva {string}")
    public void aUnidadeDeEva(String unidade) {
        this.unidade = unidade;
    }

    @When("iniciar a sincronização")
    public void iniciarSincronizacao() {
        if ("Shinji Ikari".equals(piloto) && "Unit-01".equals(unidade)) {
            taxaSincronizacao = 75; 
        } else {
            taxaSincronizacao = 0; 
        }
    }

    @Then("a taxa de sincronização deve ser superior a {int}%")
    public void verificarSincronizacao(int taxaEsperada) {
        assertTrue(taxaSincronizacao > taxaEsperada, 
            "Erro: A taxa de sincronização (" + taxaSincronizacao + "%) deveria ser maior que " + taxaEsperada + "% para " + piloto + " e " + unidade);
    }

    @Then("a taxa de sincronização deve falhar")
    public void verificarFalhaDeSincronizacao() {
        assertTrue(taxaSincronizacao == 0, 
            "A sincronização deveria falhar para " + piloto + " com " + unidade);
    }
}
