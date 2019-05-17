package gerarSenha;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;

public class GerarSenha {

	public static JFrame frame;
	
	public static JDesktopPane desktopPane = new JDesktopPane();
	public static EscolherSetor es = new EscolherSetor();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GerarSenha window = new GerarSenha();
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
	public GerarSenha() {
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
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setResizable(false);
		
	
		desktopPane.setBounds(0, 0, 1, 1);
		frame.getContentPane().add(desktopPane);
		
		
		Dimension resolucao = desktopPane.getSize();
		
		es.setSize(resolucao);
		frame.add(es);
		es.setVisible(true);
		try {
			es.setSelected(true);
			es.setMaximum(true);
		} catch (PropertyVetoException e) {
			e.printStackTrace();
		}
	}
}
