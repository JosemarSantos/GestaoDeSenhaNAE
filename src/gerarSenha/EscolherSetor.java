package gerarSenha;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import java.awt.event.ActionEvent;

public class EscolherSetor extends JInternalFrame {
	
	private int escolhaSetor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EscolherSetor frame = new EscolherSetor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EscolherSetor() {
		setBounds(100, 100, 645, 514);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 635, 80);
		getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(0, 81, 635, 401);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("NAE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Método de clique no botao
				escolhaSetor = 1;
				confirmar(escolhaSetor);
				
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(34, 139, 34));
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 35));
		btnNewButton.setBounds(72, 93, 492, 82);
		panel_1.add(btnNewButton);
		
		JButton btnProuniOuFies = new JButton("ProUni ou FIES");
		btnProuniOuFies.setFont(new Font("Dialog", Font.BOLD, 35));
		btnProuniOuFies.setForeground(new Color(255, 255, 255));
		btnProuniOuFies.setBackground(new Color(34, 139, 34));
		btnProuniOuFies.setBounds(72, 181, 492, 82);
		panel_1.add(btnProuniOuFies);
		
		JButton btnOutros = new JButton("Outros");
		btnOutros.setFont(new Font("Dialog", Font.BOLD, 35));
		btnOutros.setForeground(new Color(255, 255, 255));
		btnOutros.setBackground(new Color(34, 139, 34));
		btnOutros.setBounds(72, 275, 492, 82);
		panel_1.add(btnOutros);
		
		JLabel lblEscolhaOSetor = new JLabel("Escolha o setor pelo qual deseja ser atendido");
		lblEscolhaOSetor.setFont(new Font("Dialog", Font.BOLD, 24));
		lblEscolhaOSetor.setBounds(12, 12, 611, 69);
		panel_1.add(lblEscolhaOSetor);

	}
	
	
	private void confirmar(int setor) {
		if(setor == 1) {
			
		}
		if(setor == 1) {
			
		}
		if(setor == 1) {
		}
		
		ConfirmeSenha confirmeSenha = new ConfirmeSenha();
		GerarSenha.frame.add(confirmeSenha);
		GerarSenha.es.setVisible(false);
		confirmeSenha.setVisible(true);
	}

}
