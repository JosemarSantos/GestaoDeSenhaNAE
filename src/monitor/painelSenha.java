package monitor;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class painelSenha {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					painelSenha window = new painelSenha();
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
	public painelSenha() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 690, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 690, 452);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(0, 0, 690, 122);
		panel.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(50, 205, 50));
		panel_2.setBounds(0, 120, 419, 332);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblSenha = new JLabel("SENHA");
		lblSenha.setFont(new Font("Dialog", Font.BOLD, 58));
		lblSenha.setBounds(100, 12, 225, 66);
		panel_2.add(lblSenha);
		
		JLabel lblN = new JLabel("N001");
		lblN.setFont(new Font("Dialog", Font.BOLD, 68));
		lblN.setBounds(120, 90, 198, 207);
		panel_2.add(lblN);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(60, 179, 113));
		panel_3.setBounds(424, 120, 266, 332);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblBalco = new JLabel("BALCÃO");
		lblBalco.setFont(new Font("Dialog", Font.BOLD, 50));
		lblBalco.setBounds(12, 12, 242, 66);
		panel_3.add(lblBalco);
		
		JLabel label = new JLabel("02");
		label.setFont(new Font("Dialog", Font.BOLD, 68));
		label.setBounds(87, 90, 94, 207);
		panel_3.add(label);
	}
}
