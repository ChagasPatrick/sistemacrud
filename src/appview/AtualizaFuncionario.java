package appview;

import javax.swing.JPanel;
import javax.swing.border.SoftBevelBorder;

import model.DAOFuncionario;
import model.Funcionario;

import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AtualizaFuncionario extends JPanel {
	private JTextField txNome;
	private JTextField txUsuario;
	private JTextField txEmail;
	private JTextField txCidade;
	private JTextField txEndereco;
	private JTextField txBairro;
	private JTextField txCpf;
	private JTextField txRg;
	private JTextField txCelular;
	private JTextField txTelefone;
	private JTextField txSenha;
	private JTextField txDataCadastro;
	private JTextField txId;
	private static Funcionario funcionario;

	/**
	 * Create the panel.
	 */
	public AtualizaFuncionario(long id) {
		DAOFuncionario dao = new DAOFuncionario();
		funcionario = dao.getBuscaId(id);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(255, 255, 255));
		panel.setBackground(new Color(102, 153, 153));
		panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 54, 812, 381);
		add(panel);
		panel.setLayout(null);
		
		
		txId = new JTextField();
		txId.setEditable(false);
		txId.setColumns(10);
		txId.setBounds(406, 17, 76, 20);
		panel.add(txId);
		
		JLabel lblId = new JLabel("Id:");
		lblId.setForeground(Color.WHITE);
		lblId.setBounds(365, 20, 46, 14);
		panel.add(lblId);
		
		
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setForeground(new Color(255, 255, 255));
		lblNome.setBounds(22, 23, 46, 14);
		panel.add(lblNome);
		
		txNome = new JTextField();
		txNome.setBounds(69, 20, 258, 20);
		panel.add(txNome);
		txNome.setColumns(10);
		
		txUsuario = new JTextField();
		txUsuario.setColumns(10);
		txUsuario.setBounds(62, 180, 150, 20);
		panel.add(txUsuario);
		
		JLabel label = new JLabel("Usu\u00E1rio:");
		label.setForeground(new Color(255, 255, 255));
		label.setBounds(10, 183, 60, 14);
		panel.add(label);
		
		JLabel label_1 = new JLabel("Email:");
		label_1.setForeground(new Color(255, 255, 255));
		label_1.setBounds(15, 130, 60, 14);
		panel.add(label_1);
		
		txEmail = new JTextField();
		txEmail.setColumns(10);
		txEmail.setBounds(55, 127, 334, 20);
		panel.add(txEmail);
		
		JLabel label_2 = new JLabel("Cidade:");
		label_2.setForeground(new Color(255, 255, 255));
		label_2.setBounds(15, 96, 46, 14);
		panel.add(label_2);
		
		txCidade = new JTextField();
		txCidade.setColumns(10);
		txCidade.setBounds(60, 91, 170, 20);
		panel.add(txCidade);
		
		JLabel label_3 = new JLabel("Endere\u00E7o:");
		label_3.setForeground(new Color(255, 255, 255));
		label_3.setBounds(15, 62, 60, 14);
		panel.add(label_3);
		
		txEndereco = new JTextField();
		txEndereco.setColumns(10);
		txEndereco.setBounds(81, 59, 334, 20);
		panel.add(txEndereco);
		
		txBairro = new JTextField();
		txBairro.setColumns(10);
		txBairro.setBounds(472, 59, 234, 20);
		panel.add(txBairro);
		
		JLabel label_4 = new JLabel("Bairro:");
		label_4.setForeground(new Color(255, 255, 255));
		label_4.setBounds(431, 62, 46, 14);
		panel.add(label_4);
		
		txCpf = new JTextField();
		txCpf.setColumns(10);
		txCpf.setBounds(312, 90, 170, 20);
		panel.add(txCpf);
		
		JLabel label_5 = new JLabel("Cpf:");
		label_5.setForeground(new Color(255, 255, 255));
		label_5.setBounds(281, 93, 46, 14);
		panel.add(label_5);
		
		txRg = new JTextField();
		txRg.setColumns(10);
		txRg.setBounds(555, 90, 150, 20);
		panel.add(txRg);
		
		JLabel label_6 = new JLabel("Rg:");
		label_6.setForeground(new Color(255, 255, 255));
		label_6.setBounds(532, 93, 46, 14);
		panel.add(label_6);
		
		txCelular = new JTextField();
		txCelular.setColumns(10);
		txCelular.setBounds(674, 127, 122, 20);
		panel.add(txCelular);
		
		JLabel label_7 = new JLabel("Celular:");
		label_7.setForeground(new Color(255, 255, 255));
		label_7.setBounds(622, 130, 174, 14);
		panel.add(label_7);
		
		txTelefone = new JTextField();
		txTelefone.setColumns(10);
		txTelefone.setBounds(459, 127, 150, 20);
		panel.add(txTelefone);
		
		JLabel label_8 = new JLabel("Telefone:");
		label_8.setForeground(new Color(255, 255, 255));
		label_8.setBounds(399, 130, 60, 14);
		panel.add(label_8);
		
		txSenha = new JTextField();
		txSenha.setColumns(10);
		txSenha.setBounds(285, 180, 150, 20);
		panel.add(txSenha);
		
		JLabel label_9 = new JLabel("Data do Cadastro:");
		label_9.setForeground(new Color(255, 255, 255));
		label_9.setBounds(459, 183, 102, 14);
		panel.add(label_9);
		
		txDataCadastro = new JTextField();
		txDataCadastro.setColumns(10);
		txDataCadastro.setBounds(568, 180, 150, 20);
		panel.add(txDataCadastro);
		

		JLabel label_10 = new JLabel("Senha:");
		label_10.setForeground(new Color(255, 255, 255));
		label_10.setBounds(233, 183, 42, 14);
		panel.add(label_10);
		
		txId.setText(funcionario.getIdFuncionario()+"");
		txNome.setText(funcionario.getNome());
		txEndereco.setText(funcionario.getEndereço());
		txBairro.setText(funcionario.getBairro());
		txCidade.setText(funcionario.getCidade());
		txCpf.setText(funcionario.getCpf());
		txRg.setText(funcionario.getRg());
		txEmail.setText(funcionario.getEmail());
		txTelefone.setText(funcionario.getTelefone());
		txCelular.setText(funcionario.getCelular());
		txUsuario.setText(funcionario.getUsuario());
		txSenha.setText(funcionario.getSenha());
		//txDataCadastro.setText(funcionario.getDataCadastro());
		
		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.addActionListener(new ActionListener() {
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
				funcionario.setIdFuncionario(Long.parseLong(txId.getText()));
				
				DAOFuncionario dao = new DAOFuncionario();
				dao.update(funcionario);
					JOptionPane.showMessageDialog(null, "Atualizado com sucesso");
					
				}catch(Exception e1){
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null, "Erro ao atualizar");
				}	
				
				
			}
		});
		btnAtualizar.setFont(new Font("Consolas", Font.BOLD, 16));
		btnAtualizar.setBounds(461, 287, 140, 30);
		panel.add(btnAtualizar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Consolas", Font.BOLD, 16));
		btnCancelar.setBounds(607, 286, 141, 31);
		panel.add(btnCancelar);
		
		
		JLabel lblAtualizaoDeFuncionrios = new JLabel("Atualiza\u00E7\u00E3o de Funcion\u00E1rios");
		lblAtualizaoDeFuncionrios.setFont(new Font("Consolas", Font.PLAIN, 27));
		lblAtualizaoDeFuncionrios.setBounds(166, 11, 410, 33);
		add(lblAtualizaoDeFuncionrios);

	}
	
	
	
	

}
