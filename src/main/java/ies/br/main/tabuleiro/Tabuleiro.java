package ies.br.main.tabuleiro;

import ies.br.main.celulas.Celula;
import ies.br.main.celulas.CelulaCentral;
import ies.br.main.celulas.CelulaCentralDireita;
import ies.br.main.celulas.CelulaCentralEsquerda;
import ies.br.main.celulas.CelulaInferiorCentral;
import ies.br.main.celulas.CelulaInferiorDireita;
import ies.br.main.celulas.CelulaInferiorEsquerda;
import ies.br.main.celulas.CelulaSuperiorCentral;
import ies.br.main.celulas.CelulaSuperiorDireita;
import ies.br.main.celulas.CelulaSuperiorEsquerda;

public class Tabuleiro {

	private Celula ponteiro;
	private CelulaCentral centro;
	private CelulaCentralDireita centroDireita;
	private CelulaCentralEsquerda centroEsquerda;
	private CelulaInferiorCentral inferiorCentral;
	private CelulaInferiorDireita inferiorDireita;
	private CelulaInferiorEsquerda inferiorEsquerda;
	private CelulaSuperiorCentral superiorCentral;
	private CelulaSuperiorDireita superiorDireita;
	private CelulaSuperiorEsquerda superiorEsquerda;

	public Tabuleiro() {
		superiorEsquerda = new CelulaSuperiorEsquerda(Integer.valueOf(1));
		superiorCentral = new CelulaSuperiorCentral(Integer.valueOf(2));
		superiorDireita = new CelulaSuperiorDireita(Integer.valueOf(3));
		centroEsquerda = new CelulaCentralEsquerda(Integer.valueOf(4));
		centro = new CelulaCentral(Integer.valueOf(5));
		centroDireita = new CelulaCentralDireita(Integer.valueOf(6));
		inferiorEsquerda = new CelulaInferiorEsquerda(Integer.valueOf(7));
		inferiorCentral = new CelulaInferiorCentral(Integer.valueOf(8));
		inferiorDireita = new CelulaInferiorDireita(Integer.valueOf(0));
		setPonteiro(inferiorDireita);

		superiorEsquerda.fixarBaixo(centroEsquerda);
		superiorEsquerda.fixarDireita(superiorCentral);

		superiorCentral.fixarBaixo(centro);
		superiorCentral.fixarDireita(superiorDireita);
		superiorCentral.fixarEsquerda(superiorEsquerda);

		superiorDireita.fixarBaixo(centroDireita);
		superiorDireita.fixarEsquerda(superiorCentral);

		centroEsquerda.fixarDireita(centro);
		centroEsquerda.fixarBaixo(inferiorEsquerda);
		centroEsquerda.fixarCima(superiorEsquerda);

		centro.fixarBaixo(inferiorCentral);
		centro.fixarCima(superiorCentral);
		centro.fixarDireita(centroDireita);
		centro.fixarEsquerda(centroEsquerda);

		centroDireita.fixarBaixo(inferiorDireita);
		centroDireita.fixarCima(superiorDireita);
		centroDireita.fixarEsquerda(centro);

		inferiorEsquerda.fixarCima(centroEsquerda);
		inferiorEsquerda.fixarDireita(inferiorCentral);

		inferiorCentral.fixarCima(centro);
		inferiorCentral.fixarDireita(inferiorDireita);
		inferiorCentral.fixarEsquerda(inferiorEsquerda);

		inferiorDireita.fixarCima(centroDireita);
		inferiorDireita.fixarEsquerda(inferiorCentral);
	}

	public void atualizarPonteiro(Celula celula) {
		setPonteiro(celula);
	}

	public void moverPonteiroPraCima() {
		ponteiro.moverParaCima();
		atualizarPonteiro(ponteiro.getCima());
	}

	public void mostrarTabuleiro() {
		System.out.println(getSuperiorEsquerda() + "" + getSuperiorCentral() + "" + getSuperiorDireita());
		System.out.println(getCentroEsquerda() + "" + centro.getNumero() + "" + getCentroDireita());
		System.out.println(getInferiorEsquerda() + "" + getInferiorCentral() + "" + getInferiorDireita());
		System.out.println("-----------");
	}

	public Celula getPonteiro() {
		return ponteiro;
	}

	public void setPonteiro(Celula ponteiro) {
		this.ponteiro = ponteiro;
	}

	public Integer getCentro() {
		return centro.getNumero();
	}

	public Integer getCentroDireita() {
		return centroDireita.getNumero();
	}

	public Integer getCentroEsquerda() {
		return centroEsquerda.getNumero();
	}

	public Integer getInferiorCentral() {
		return inferiorCentral.getNumero();
	}

	public Integer getInferiorDireita() {
		return inferiorDireita.getNumero();
	}

	public Integer getInferiorEsquerda() {
		return inferiorEsquerda.getNumero();
	}

	public Integer getSuperiorCentral() {
		return superiorCentral.getNumero();
	}

	public Integer getSuperiorDireita() {
		return superiorDireita.getNumero();
	}

	public Integer getSuperiorEsquerda() {
		return superiorEsquerda.getNumero();
	}

}
