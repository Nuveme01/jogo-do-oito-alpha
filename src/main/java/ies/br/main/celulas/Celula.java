package ies.br.main.celulas;

import ies.br.main.Movimentos;

public class Celula implements Movimentos {
	private Integer numero;
	private Celula cima;
	private Celula baixo;
	private Celula esquerda;
	private Celula direita;

	public Celula(Integer numero) {
		this.setNumero(numero);
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public static void trocarNumero(Celula origem, Celula destino) {
		Integer armazenamentoTemporario = origem.getNumero();
		origem.setNumero(destino.getNumero());
		destino.setNumero(armazenamentoTemporario);
	}

	@Override
	public void moverParaCima() {
		// Não possui ações, pois a celula ainda não possui posição
	}

	@Override
	public void moverParaBaixo() {
		// Não possui ações, pois a celula ainda não possui posição
	}

	@Override
	public void moverParaEsquerda() {
		// Não possui ações, pois a celula ainda não possui posição
	}

	@Override
	public void moverParaDireita() {
		// Não possui ações, pois a celula ainda não possui posição
	}

	public Celula getCima() {
		return cima;
	}

	public void setCima(Celula cima) {
		this.cima = cima;
	}

	public Celula getBaixo() {
		return baixo;
	}

	public void setBaixo(Celula baixo) {
		this.baixo = baixo;
	}

	public Celula getEsquerda() {
		return esquerda;
	}

	public void setEsquerda(Celula esquerda) {
		this.esquerda = esquerda;
	}

	public Celula getDireita() {
		return direita;
	}

	public void setDireita(Celula direita) {
		this.direita = direita;
	}
}
