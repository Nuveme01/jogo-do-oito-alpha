package ies.br.main;

//opa

public class Celula {
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
}
