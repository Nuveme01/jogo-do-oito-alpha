package ies.br.main;

import ies.br.main.tabuleiro.ControleDoTabuleiro;
import ies.br.main.tabuleiro.OrganizadorDeTabuleiro;

public class Main {
	public static void main(String[] args) {
		ControleDoTabuleiro controle = new ControleDoTabuleiro(new OrganizadorDeTabuleiro());
		controle.getTabuleiro().mostrarTabuleiro();
		controle.moverPraCima();
		controle.moverPraEsquerda();

	}
}
