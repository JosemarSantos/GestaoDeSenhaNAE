package gerarSenha;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class painelGerarSenha {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					painelGerarSenha window = new painelGerarSenha();
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
	public painelGerarSenha() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 691, 485);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 691, 89);
		frame.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(0, 90, 691, 367);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblSelecioneOSetor = new JLabel("Selecione o setor pelo qual deseja ser atendido");
		lblSelecioneOSetor.setFont(new Font("Dialog", Font.BOLD, 23));
		lblSelecioneOSetor.setBounds(37, 12, 621, 47);
		panel_1.add(lblSelecioneOSetor);
		
		JButton btnNewButton = new JButton("NAE");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(34, 139, 34));
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 30));
		btnNewButton.setBounds(47, 73, 595, 73);
		panel_1.add(btnNewButton);
		
		JButton btnProuniOuFies = new JButton("ProUni ou FIES");
		btnProuniOuFies.setBackground(new Color(34, 139, 34));
		btnProuniOuFies.setForeground(new Color(255, 255, 255));
		btnProuniOuFies.setFont(new Font("Dialog", Font.BOLD, 30));
		btnProuniOuFies.setBounds(47, 158, 595, 73);
		panel_1.add(btnProuniOuFies);
		
		JButton btnOutros = new JButton("Outros");
		btnOutros.setFont(new Font("Dialog", Font.BOLD, 30));
		btnOutros.setForeground(new Color(255, 255, 255));
		btnOutros.setBackground(new Color(34, 139, 34));
		btnOutros.setBounds(47, 243, 595, 73);
		panel_1.add(btnOutros);
	}
}
