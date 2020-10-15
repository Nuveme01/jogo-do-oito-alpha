package ies.br.main.tabuleiro;

public class ControleDoTabuleiro {

	private OrganizadorDeTabuleiro tabuleiro;

	public ControleDoTabuleiro(OrganizadorDeTabuleiro tabuleiro) {
		this.setTabuleiro(tabuleiro);
	}

	public OrganizadorDeTabuleiro getTabuleiro() {
		return tabuleiro;
	}

	public void setTabuleiro(OrganizadorDeTabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
	}

	public void moverPraCima() {
		tabuleiro.getPonteiro().moverParaCima();
		tabuleiro.atualizarPonteiro(tabuleiro.getPonteiro().getCima());
		tabuleiro.mostrarTabuleiro();
	}
	
	public void moverPraBaixo() {
		tabuleiro.getPonteiro().moverParaBaixo();
		tabuleiro.atualizarPonteiro(tabuleiro.getPonteiro().getBaixo());
		tabuleiro.mostrarTabuleiro();
	}
	
	public void moverPraEsquerda() {
		tabuleiro.getPonteiro().moverParaEsquerda();
		tabuleiro.atualizarPonteiro(tabuleiro.getPonteiro().getEsquerda());
		tabuleiro.mostrarTabuleiro();
	}

	
	public void moverPraDireita() {
		tabuleiro.getPonteiro().moverParaDireita();
		tabuleiro.atualizarPonteiro(tabuleiro.getPonteiro().getDireita());
		tabuleiro.mostrarTabuleiro();
	}
}
