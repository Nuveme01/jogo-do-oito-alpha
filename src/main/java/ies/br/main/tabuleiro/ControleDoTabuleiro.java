package ies.br.main.tabuleiro;

public class ControleDoTabuleiro {

	private Tabuleiro tabuleiro;

	public ControleDoTabuleiro(Tabuleiro tabuleiro) {
		this.setTabuleiro(tabuleiro);
	}

	public Tabuleiro getTabuleiro() {
		return tabuleiro;
	}

	public void setTabuleiro(Tabuleiro tabuleiro) {
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
