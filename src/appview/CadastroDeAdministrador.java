package appview;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;

import model.Administrador;
import model.DAOAdministrador;

import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroDeAdministrador extends JPanel {
	private JTextField txNome;
	private JTextField txEndereco;
	private JTextField txBairro;
	private JTextField txCidade;
	private JTextField txCpf;
	private JTextField txRg;
	private JTextField txEmail;
	private JTextField txTelefone;
	private JTextField txCelular;
	private JTextField txUsuario;
	private JTextField txSenha;
	private JTextField txDataCadastro;

	/**
	 * Create the panel.
	 */
	public CadastroDeAdministrador() {
		setBackground(new Color(102, 153, 153));
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(102, 153, 153));
		panel.setBounds(23, 82, 837, 338);
		add(panel);
		
		JLabel label = new JLabel("Nome:");
		label.setBounds(22, 23, 46, 14);
		panel.add(label);
		
		txNome = new JTextField();
		txNome.setColumns(10);
		txNome.setBounds(58, 20, 405, 20);
		panel.add(txNome);
		
		JLabel label_1 = new JLabel("Endere\u00E7o:");
		label_1.setBounds(22, 53, 60, 14);
		panel.add(label_1);
		
		txEndereco = new JTextField();
		txEndereco.setColumns(10);
		txEndereco.setBounds(88, 50, 334, 20);
		panel.add(txEndereco);
		
		JLabel label_2 = new JLabel("Bairro:");
		label_2.setBounds(438, 53, 46, 14);
		panel.add(label_2);
		
		txBairro = new JTextField();
		txBairro.setColumns(10);
		txBairro.setBounds(479, 50, 234, 20);
		panel.add(txBairro);
		
		txCidade = new JTextField();
		txCidade.setColumns(10);
		txCidade.setBounds(67, 82, 170, 20);
		panel.add(txCidade);
		
		JLabel label_3 = new JLabel("Cidade:");
		label_3.setBounds(22, 87, 46, 14);
		panel.add(label_3);
		
		txCpf = new JTextField();
		txCpf.setColumns(10);
		txCpf.setBounds(319, 81, 170, 20);
		panel.add(txCpf);
		
		JLabel label_4 = new JLabel("Cpf:");
		label_4.setBounds(288, 84, 46, 14);
		panel.add(label_4);
		
		txRg = new JTextField();
		txRg.setColumns(10);
		txRg.setBounds(562, 81, 150, 20);
		panel.add(txRg);
		
		JLabel label_5 = new JLabel("Rg:");
		label_5.setBounds(539, 84, 46, 14);
		panel.add(label_5);
		
		txEmail = new JTextField();
		txEmail.setColumns(10);
		txEmail.setBounds(62, 118, 334, 20);
		panel.add(txEmail);
		
		JLabel label_6 = new JLabel("Email:");
		label_6.setBounds(22, 121, 60, 14);
		panel.add(label_6);
		
		JLabel label_7 = new JLabel("Telefone:");
		label_7.setBounds(406, 121, 60, 14);
		panel.add(label_7);
		
		txTelefone = new JTextField();
		txTelefone.setColumns(10);
		txTelefone.setBounds(466, 118, 150, 20);
		panel.add(txTelefone);
		
		txCelular = new JTextField();
		txCelular.setColumns(10);
		txCelular.setBounds(681, 118, 122, 20);
		panel.add(txCelular);
		
		JLabel label_8 = new JLabel("Celular:");
		label_8.setBounds(629, 121, 174, 14);
		panel.add(label_8);
		
		JLabel label_9 = new JLabel("Usu\u00E1rio:");
		label_9.setBounds(17, 174, 60, 14);
		panel.add(label_9);
		
		txUsuario = new JTextField();
		txUsuario.setColumns(10);
		txUsuario.setBounds(69, 171, 150, 20);
		panel.add(txUsuario);
		
		JLabel label_10 = new JLabel("Senha:");
		label_10.setBounds(240, 174, 42, 14);
		panel.add(label_10);
		
		txSenha = new JTextField();
		txSenha.setColumns(10);
		txSenha.setBounds(292, 171, 150, 20);
		panel.add(txSenha);
		
		JLabel label_11 = new JLabel("Data do Cadastro:");
		label_11.setBounds(466, 174, 102, 14);
		panel.add(label_11);
		
		txDataCadastro = new JTextField();
		txDataCadastro.setColumns(10);
		txDataCadastro.setBounds(575, 171, 150, 20);
		panel.add(txDataCadastro);
		
		JButton button = new JButton("Cadastrar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try{
					Administrador administrador = new Administrador();
					administrador.setNome(txNome.getText());
					administrador.setEndereco(txEndereco.getText());
					administrador.setBairro(txBairro.getText());
					administrador.setCidade(txCidade.getText());
					administrador.setCpf(txCpf.getText());
					administrador.setRg(txRg.getText());
					administrador.setEmail(txEmail.getText());
					administrador.setTelefone(txTelefone.getText());
					administrador.setCelular(txCelular.getText());
					administrador.setUsuario(txUsuario.getText());
					administrador.setSenha(txSenha.getText());
					//administrador.setDataCadastro(txDataCadastro.getText());
					
					DAOAdministrador dao = new DAOAdministrador();
					dao.cadastrar(administrador);
					
					JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");
					
					}catch(Exception e1){
						e1.printStackTrace();
						JOptionPane.showMessageDialog(null, "Erro ao sucesso");
					}				
				}
		});
		button.setFont(new Font("Consolas", Font.BOLD, 16));
		button.setBounds(494, 234, 140, 29);
		panel.add(button);
		
		JButton button_1 = new JButton("Cancelar");
		button_1.setFont(new Font("Consolas", Font.BOLD, 16));
		button_1.setBounds(644, 234, 140, 29);
		panel.add(button_1);
		
		JLabel lblCadastroDeAdministradores = new JLabel("Cadastro de Administradores");
		lblCadastroDeAdministradores.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastroDeAdministradores.setFont(new Font("Consolas", Font.PLAIN, 27));
		lblCadastroDeAdministradores.setBounds(235, 23, 445, 23);
		add(lblCadastroDeAdministradores);

	}

}
