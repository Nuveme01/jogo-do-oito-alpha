package ies.br.main;

public class Celula implements Movimentos {
	private Integer numero;

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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moverParaBaixo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moverParaEsquerda() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moverParaDireita() {
		// TODO Auto-generated method stub
		
	}
}
