package appview;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.SoftBevelBorder;

import model.DAOFuncionario;
import model.DAOProduto;
import model.Funcionario;

import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroDeFuncionario extends JPanel {
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
	public CadastroDeFuncionario() {
		setBackground(new Color(102, 153, 153));
		setLayout(null);
		
		JLabel lblCadastroDeFuncionrio = new JLabel("Cadastro de Funcion\u00E1rios");
		lblCadastroDeFuncionrio.setFont(new Font("Consolas", Font.PLAIN, 27));
		lblCadastroDeFuncionrio.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastroDeFuncionrio.setBounds(270, 11, 371, 23);
		add(lblCadastroDeFuncionrio);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 153, 153));
		panel.setBounds(9, 78, 837, 338);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(22, 23, 46, 14);
		panel.add(lblNome);
		
		txNome = new JTextField();
		txNome.setBounds(58, 20, 405, 20);
		panel.add(txNome);
		txNome.setColumns(10);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o:");
		lblEndereo.setBounds(22, 53, 60, 14);
		panel.add(lblEndereo);
		
		txEndereco = new JTextField();
		txEndereco.setColumns(10);
		txEndereco.setBounds(88, 50, 334, 20);
		panel.add(txEndereco);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setBounds(438, 53, 46, 14);
		panel.add(lblBairro);
		
		txBairro = new JTextField();
		txBairro.setColumns(10);
		txBairro.setBounds(479, 50, 234, 20);
		panel.add(txBairro);
		
		txCidade = new JTextField();
		txCidade.setColumns(10);
		txCidade.setBounds(67, 82, 170, 20);
		panel.add(txCidade);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setBounds(22, 87, 46, 14);
		panel.add(lblCidade);
		
		txCpf = new JTextField();
		txCpf.setColumns(10);
		txCpf.setBounds(319, 81, 170, 20);
		panel.add(txCpf);
		
		JLabel lblCpf = new JLabel("Cpf:");
		lblCpf.setBounds(288, 84, 46, 14);
		panel.add(lblCpf);
		
		txRg = new JTextField();
		txRg.setColumns(10);
		txRg.setBounds(562, 81, 150, 20);
		panel.add(txRg);
		
		JLabel lblRg = new JLabel("Rg:");
		lblRg.setBounds(539, 84, 46, 14);
		panel.add(lblRg);
		
		txEmail = new JTextField();
		txEmail.setColumns(10);
		txEmail.setBounds(62, 118, 334, 20);
		panel.add(txEmail);
		
		JLabel lblEmai = new JLabel("Email:");
		lblEmai.setBounds(22, 121, 60, 14);
		panel.add(lblEmai);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(406, 121, 60, 14);
		panel.add(lblTelefone);
		
		txTelefone = new JTextField();
		txTelefone.setColumns(10);
		txTelefone.setBounds(466, 118, 150, 20);
		panel.add(txTelefone);
		
		txCelular = new JTextField();
		txCelular.setColumns(10);
		txCelular.setBounds(681, 118, 122, 20);
		panel.add(txCelular);
		
		JLabel lblCelular = new JLabel("Celular:");
		lblCelular.setBounds(629, 121, 174, 14);
		panel.add(lblCelular);
		
		JLabel lblUsurio = new JLabel("Usu\u00E1rio:");
		lblUsurio.setBounds(17, 174, 60, 14);
		panel.add(lblUsurio);
		
		txUsuario = new JTextField();
		txUsuario.setColumns(10);
		txUsuario.setBounds(69, 171, 150, 20);
		panel.add(txUsuario);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(240, 174, 42, 14);
		panel.add(lblSenha);
		
		txSenha = new JTextField();
		txSenha.setColumns(10);
		txSenha.setBounds(292, 171, 150, 20);
		panel.add(txSenha);
		
		JLabel lblDataDoCadastro = new JLabel("Data do Cadastro:");
		lblDataDoCadastro.setBounds(466, 174, 102, 14);
		panel.add(lblDataDoCadastro);
		
		txDataCadastro = new JTextField();
		txDataCadastro.setColumns(10);
		txDataCadastro.setBounds(575, 171, 150, 20);
		panel.add(txDataCadastro);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try{
					Funcionario funcionario = new Funcionario();
					funcionario.setNome(txNome.getText());
					funcionario.setEndereço(txEndereco.getText());
					funcionario.setBairro(txBairro.getText());
					funcionario.setCidade(txCidade.getText());
					funcionario.setCpf(txCpf.getText());
					funcionario.setRg(txRg.getText());
					funcionario.setEmail(txEmail.getText());
					funcionario.setTelefone(txTelefone.getText());
					funcionario.setCelular(txCelular.getText());
					funcionario.setUsuario(txUsuario.getText());
					funcionario.setSenha(txSenha.getText());
					//funcionario.setDataCadastro(txDataCadastro.getText());
					
					DAOFuncionario dao = new DAOFuncionario();
					dao.cadastrar(funcionario);
					JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
					
					
				}catch(Exception e1){
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null, "Erro ao cadastrar");
					
				}
				
				
			}
		});
		btnCadastrar.setFont(new Font("Consolas", Font.BOLD, 16));
		btnCadastrar.setBounds(494, 234, 140, 29);
		panel.add(btnCadastrar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Consolas", Font.BOLD, 16));
		btnCancelar.setBounds(644, 234, 140, 29);
		panel.add(btnCancelar);

	}
}
