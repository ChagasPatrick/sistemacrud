package appview;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class TelaInicial extends JFrame {

	private JPanel contentPane;
	private JTextField txLogin;
	private JTextField txSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial frame = new TelaInicial();
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
	public TelaInicial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 527, 314);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSejaVemVindo = new JLabel("");
		lblSejaVemVindo.setIcon(new ImageIcon("E:\\Codes\\projeto-logo.png"));
		lblSejaVemVindo.setBounds(75, 11, 360, 80);
		contentPane.add(lblSejaVemVindo);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblLogin.setBounds(87, 141, 89, 41);
		contentPane.add(lblLogin);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Consolas", Font.PLAIN, 20));
		lblSenha.setBounds(87, 193, 73, 14);
		contentPane.add(lblSenha);
		
		txLogin = new JTextField();
		txLogin.setBounds(152, 147, 266, 25);
		contentPane.add(txLogin);
		txLogin.setColumns(10);
		
		txSenha = new JTextField();
		txSenha.setColumns(10);
		txSenha.setBounds(152, 187, 266, 25);
		contentPane.add(txSenha);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setBounds(219, 240, 91, 23);
		contentPane.add(btnEntrar);
	}
}
