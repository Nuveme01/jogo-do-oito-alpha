package ies.br.main.visao;

import java.awt.EventQueue;

import javax.swing.JFrame;

import ies.br.main.tabuleiro.ControleDoTabuleiro;
import ies.br.main.tabuleiro.OrganizadorDeTabuleiro;

import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tela {

	private JFrame frame;

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

		ControleDoTabuleiro controle = new ControleDoTabuleiro(new OrganizadorDeTabuleiro());

		JButton btnNewButton = new JButton("Cima");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controle.moverPraCima();
			}
		});
		frame.getContentPane().add(btnNewButton, BorderLayout.NORTH);
		
		JButton btnNewButton_1 = new JButton("Esquerda");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controle.moverPraEsquerda();
			}
		});
		frame.getContentPane().add(btnNewButton_1, BorderLayout.WEST);
		
		JButton btnNewButton_2 = new JButton("Direita");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controle.moverPraDireita();
			}
		});
		frame.getContentPane().add(btnNewButton_2, BorderLayout.EAST);
		
		JButton btnNewButton_3 = new JButton("Baixo");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controle.moverPraBaixo();
			}
		});
		frame.getContentPane().add(btnNewButton_3, BorderLayout.SOUTH);
	}

}
