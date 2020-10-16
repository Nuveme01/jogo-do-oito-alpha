package ies.br.visao;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import ies.br.main.tabuleiro.ControleDoTabuleiro;
import ies.br.main.tabuleiro.Tabuleiro;

public class Tela {

	private JFrame frame;
	private ControleDoTabuleiro controle = new ControleDoTabuleiro(new Tabuleiro());

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela window = new Tela();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Tela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel superiorEsquerdo = new JLabel(controle.getTabuleiro().getSuperiorEsquerda().toString());
		superiorEsquerdo.setBackground(Color.BLACK);
		superiorEsquerdo.setBounds(117, 58, 34, 34);
		frame.getContentPane().add(superiorEsquerdo);

		JLabel superiorCentral = new JLabel(controle.getTabuleiro().getSuperiorCentral().toString());
		superiorCentral.setBackground(Color.BLACK);
		superiorCentral.setBounds(190, 58, 34, 34);
		frame.getContentPane().add(superiorCentral);

		JLabel superiorDireita = new JLabel(controle.getTabuleiro().getSuperiorDireita().toString());
		superiorDireita.setBackground(Color.BLACK);
		superiorDireita.setBounds(262, 58, 34, 34);
		frame.getContentPane().add(superiorDireita);

		JLabel centroEsquerda = new JLabel(controle.getTabuleiro().getCentroEsquerda().toString());
		centroEsquerda.setBackground(Color.BLACK);
		centroEsquerda.setBounds(117, 103, 34, 34);
		frame.getContentPane().add(centroEsquerda);

		JLabel centroCentral = new JLabel(controle.getTabuleiro().getCentro().toString());
		centroCentral.setBackground(Color.BLACK);
		centroCentral.setBounds(190, 103, 34, 34);
		frame.getContentPane().add(centroCentral);

		JLabel centroDireita = new JLabel(controle.getTabuleiro().getCentroDireita().toString());
		centroDireita.setBackground(Color.BLACK);
		centroDireita.setBounds(262, 103, 34, 34);
		frame.getContentPane().add(centroDireita);

		JLabel inferiorCentral = new JLabel(controle.getTabuleiro().getInferiorCentral().toString());
		inferiorCentral.setBackground(Color.BLACK);
		inferiorCentral.setBounds(190, 148, 34, 34);
		frame.getContentPane().add(inferiorCentral);

		JLabel inferiorEsquerdo = new JLabel(controle.getTabuleiro().getInferiorEsquerda().toString());
		inferiorEsquerdo.setBackground(Color.BLACK);
		inferiorEsquerdo.setBounds(117, 148, 34, 34);
		frame.getContentPane().add(inferiorEsquerdo);

		JLabel inferiorDireita = new JLabel(controle.getTabuleiro().getInferiorDireita().toString());
		inferiorDireita.setBackground(Color.BLACK);
		inferiorDireita.setBounds(262, 148, 34, 34);
		frame.getContentPane().add(inferiorDireita);

		JButton botaoCima = new JButton("Cima");
		botaoCima.setBounds(156, 0, 107, 23);

		ActionListener cimaPressionado = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controle.moverPraCima();
				
			}

		};
		
		
		
		KeyListener teclado = new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {			
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				Map<Integer, Runnable> mapa = new HashMap<Integer, Runnable>();
				mapa.put(KeyEvent.VK_W, () -> controle.moverPraCima());
				mapa.put(KeyEvent.VK_S, () -> controle.moverPraBaixo());
				mapa.put(KeyEvent.VK_A, () -> controle.moverPraEsquerda());
				mapa.put(KeyEvent.VK_D, () -> controle.moverPraDireita());

				mapa.get(e.getKeyCode()).run();
				
				atualizeTodasAsCelulas(superiorEsquerdo, superiorCentral, superiorDireita, centroEsquerda,
						centroCentral, centroDireita, inferiorCentral, inferiorEsquerdo, inferiorDireita);
			}
		};

		botaoCima.addActionListener(cimaPressionado);
		botaoCima.addKeyListener(teclado);

		JButton botaoEsquerda = new JButton("Esquerda");
		botaoEsquerda.setBounds(0, 119, 89, 23);

		ActionListener esquerdaPressionado = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controle.moverPraEsquerda();
				atualizeTodasAsCelulas(superiorEsquerdo, superiorCentral, superiorDireita, centroEsquerda,
						centroCentral, centroDireita, inferiorCentral, inferiorEsquerdo, inferiorDireita);
			}
		};

		botaoEsquerda.addActionListener(esquerdaPressionado);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(botaoEsquerda);
		frame.getContentPane().add(botaoCima);

		JButton botaoDireita = new JButton("Direita");
		botaoDireita.setBounds(345, 119, 89, 23);

		ActionListener direitaPressionado = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controle.moverPraDireita();
				atualizeTodasAsCelulas(superiorEsquerdo, superiorCentral, superiorDireita, centroEsquerda,
						centroCentral, centroDireita, inferiorCentral, inferiorEsquerdo, inferiorDireita);
			}
		};

		botaoDireita.addActionListener(direitaPressionado);
		frame.getContentPane().add(botaoDireita);

		JButton botaoBaixo = new JButton("Baixo");
		botaoBaixo.setBounds(156, 238, 107, 23);

		ActionListener baixoPressionado = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controle.moverPraBaixo();
				atualizeTodasAsCelulas(superiorEsquerdo, superiorCentral, superiorDireita, centroEsquerda,
						centroCentral, centroDireita, inferiorCentral, inferiorEsquerdo, inferiorDireita);
			}
		};

		botaoBaixo.addActionListener(baixoPressionado);
		frame.getContentPane().add(botaoBaixo);

	}

	private void atualizeTodasAsCelulas(JLabel superiorEsquerdo, JLabel superiorCentral, JLabel superiorDireita,
			JLabel centroEsquerda, JLabel centroCentral, JLabel centroDireita, JLabel inferiorCentral,
			JLabel inferiorEsquerdo, JLabel inferiorDireita) {
		superiorEsquerdo.setText(controle.getTabuleiro().getSuperiorEsquerda().toString());
		superiorCentral.setText(controle.getTabuleiro().getSuperiorCentral().toString());
		superiorDireita.setText(controle.getTabuleiro().getSuperiorDireita().toString());
		centroEsquerda.setText(controle.getTabuleiro().getCentroEsquerda().toString());
		centroCentral.setText(controle.getTabuleiro().getCentro().toString());
		centroDireita.setText(controle.getTabuleiro().getCentroDireita().toString());
		inferiorCentral.setText(controle.getTabuleiro().getInferiorCentral().toString());
		inferiorEsquerdo.setText(controle.getTabuleiro().getInferiorEsquerda().toString());
		inferiorDireita.setText(controle.getTabuleiro().getInferiorDireita().toString());
	}
}
