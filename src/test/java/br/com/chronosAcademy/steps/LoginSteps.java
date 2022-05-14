package br.com.chronosAcademy.steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class LoginSteps {

    @Dado("que a modal esteja sendo exibida")
    public void queAModalEstejaSendoExibida() {
        System.out.println("modal");
    }

    @Quando("for realizado um clique fora da modal")
    public void forRealizadoUmCliqueForaDaModal() {

    }

    @Entao("a janela modal deve ser fechada")
    public void aJanelaModalDeveSerFechada() {

    }

    @Quando("for realizado um clique no icone de fechar")
    public void forRealizadoUmCliqueNoIconeDeFechar() {

    }

    @Quando("for realizado um clique no link Create New Account")
    public void forRealizadoUmCliqueNoLinkCreateNewAccount() {

    }

    @Entao("a pagina Create New Account deve ser exibida")
    public void aPaginaCreateNewAccountDeveSerExibida() {

    }


    @Quando("for realizado um clique no botao sign in")
    public void forRealizadoUmCliqueNoBotaoSignIn() {

    }

    @Entao("deve ser possivel logar no sistema")
    public void deveSerPossivelLogarNoSistema() {

    }

    @Quando("os campos de login forem preenchidos da seguinte forma")
    public void osCamposDeLoginForemPreenchidosDaSeguinteForma() {

    }


    @Entao("o sistema deve exibir a mensagem de erro")
    public void oSistemaDeveExibirAMensagemDeErro() {
    }


    @Entao("o botao sign in deve permanecer desabilitado")
    public void oBotaoSignInDevePermanecerDesabilitado() {
    }



}
