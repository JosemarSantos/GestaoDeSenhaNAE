package gerarSenha;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConfirmeSenha extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConfirmeSenha frame = new ConfirmeSenha();
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
	public ConfirmeSenha() {
		setBounds(100, 100, 600, 362);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 590, 330);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Prioridade?");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 30));
		lblNewLabel.setBounds(204, 12, 192, 69);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("SIM");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				GerarSenha gerarSenha = new GerarSenha();
				gerarSenha.es.setVisible(false);
				
				JOptionPane msg = new JOptionPane();
				msg.createDialog("Retire sua senha");
				
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(34, 139, 34));
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 30));
		btnNewButton.setBounds(84, 93, 427, 86);
		panel.add(btnNewButton);
		
		JButton btnNo = new JButton("NÃO");
		btnNo.setForeground(new Color(255, 255, 255));
		btnNo.setBackground(new Color(204, 51, 51));
		btnNo.setFont(new Font("Dialog", Font.BOLD, 30));
		btnNo.setBounds(84, 193, 427, 86);
		panel.add(btnNo);

	}
}
