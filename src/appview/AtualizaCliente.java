package appview;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;

import model.Cliente;
import model.DAOCliente;
import model.DAOFuncionario;
import model.Funcionario;

import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AtualizaCliente extends JPanel {
	private JTextField txId;
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
	private static Cliente cliente;

	/**
	 * Create the panel.
	 */
	public AtualizaCliente(long id) {
		DAOCliente dao = new DAOCliente();
		cliente = dao.getBuscaId(id);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setForeground(Color.WHITE);
		panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBackground(new Color(102, 153, 153));
		panel.setBounds(19, 67, 812, 381);
		add(panel);
		
		txId = new JTextField();
		txId.setText("0");
		txId.setEditable(false);
		txId.setColumns(10);
		txId.setBounds(406, 17, 76, 20);
		panel.add(txId);
		
		JLabel label = new JLabel("Id:");
		label.setForeground(Color.WHITE);
		label.setBounds(365, 20, 46, 14);
		panel.add(label);
		
		JLabel label_1 = new JLabel("Nome:");
		label_1.setForeground(Color.WHITE);
		label_1.setBounds(22, 23, 46, 14);
		panel.add(label_1);
		
		txNome = new JTextField();
		txNome.setText((String) null);
		txNome.setColumns(10);
		txNome.setBounds(69, 20, 258, 20);
		panel.add(txNome);
		
		txUsuario = new JTextField();
		txUsuario.setText((String) null);
		txUsuario.setColumns(10);
		txUsuario.setBounds(62, 180, 150, 20);
		panel.add(txUsuario);
		
		JLabel label_2 = new JLabel("Usu\u00E1rio:");
		label_2.setForeground(Color.WHITE);
		label_2.setBounds(10, 183, 60, 14);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("Email:");
		label_3.setForeground(Color.WHITE);
		label_3.setBounds(15, 130, 60, 14);
		panel.add(label_3);
		
		txEmail = new JTextField();
		txEmail.setText((String) null);
		txEmail.setColumns(10);
		txEmail.setBounds(55, 127, 334, 20);
		panel.add(txEmail);
		
		JLabel label_4 = new JLabel("Cidade:");
		label_4.setForeground(Color.WHITE);
		label_4.setBounds(15, 96, 46, 14);
		panel.add(label_4);
		
		txCidade = new JTextField();
		txCidade.setText((String) null);
		txCidade.setColumns(10);
		txCidade.setBounds(60, 91, 170, 20);
		panel.add(txCidade);
		
		JLabel label_5 = new JLabel("Endere\u00E7o:");
		label_5.setForeground(Color.WHITE);
		label_5.setBounds(15, 62, 60, 14);
		panel.add(label_5);
		
		txEndereco = new JTextField();
		txEndereco.setText((String) null);
		txEndereco.setColumns(10);
		txEndereco.setBounds(81, 59, 334, 20);
		panel.add(txEndereco);
		
		txBairro = new JTextField();
		txBairro.setText((String) null);
		txBairro.setColumns(10);
		txBairro.setBounds(472, 59, 234, 20);
		panel.add(txBairro);
		
		JLabel label_6 = new JLabel("Bairro:");
		label_6.setForeground(Color.WHITE);
		label_6.setBounds(431, 62, 46, 14);
		panel.add(label_6);
		
		txCpf = new JTextField();
		txCpf.setText((String) null);
		txCpf.setColumns(10);
		txCpf.setBounds(312, 90, 170, 20);
		panel.add(txCpf);
		
		JLabel label_7 = new JLabel("Cpf:");
		label_7.setForeground(Color.WHITE);
		label_7.setBounds(281, 93, 46, 14);
		panel.add(label_7);
		
		txRg = new JTextField();
		txRg.setText((String) null);
		txRg.setColumns(10);
		txRg.setBounds(555, 90, 150, 20);
		panel.add(txRg);
		
		JLabel label_8 = new JLabel("Rg:");
		label_8.setForeground(Color.WHITE);
		label_8.setBounds(532, 93, 46, 14);
		panel.add(label_8);
		
		txCelular = new JTextField();
		txCelular.setText((String) null);
		txCelular.setColumns(10);
		txCelular.setBounds(674, 127, 122, 20);
		panel.add(txCelular);
		
		JLabel label_9 = new JLabel("Celular:");
		label_9.setForeground(Color.WHITE);
		label_9.setBounds(622, 130, 174, 14);
		panel.add(label_9);
		
		txTelefone = new JTextField();
		txTelefone.setText((String) null);
		txTelefone.setColumns(10);
		txTelefone.setBounds(459, 127, 150, 20);
		panel.add(txTelefone);
		
		JLabel label_10 = new JLabel("Telefone:");
		label_10.setForeground(Color.WHITE);
		label_10.setBounds(399, 130, 60, 14);
		panel.add(label_10);
		
		txSenha = new JTextField();
		txSenha.setText((String) null);
		txSenha.setColumns(10);
		txSenha.setBounds(285, 180, 150, 20);
		panel.add(txSenha);
		
		JLabel label_11 = new JLabel("Data do Cadastro:");
		label_11.setForeground(Color.WHITE);
		label_11.setBounds(459, 183, 102, 14);
		panel.add(label_11);
		
		txDataCadastro = new JTextField();
		txDataCadastro.setColumns(10);
		txDataCadastro.setBounds(568, 180, 150, 20);
		panel.add(txDataCadastro);
		
		JLabel label_12 = new JLabel("Senha:");
		label_12.setForeground(Color.WHITE);
		label_12.setBounds(233, 183, 42, 14);
		panel.add(label_12);
		
		
		txId.setText(cliente.getIdCliente()+"");
		txNome.setText(cliente.getNome());
		txEndereco.setText(cliente.getEndereço());
		txBairro.setText(cliente.getBairro());
		txCidade.setText(cliente.getCidade());
		txCpf.setText(cliente.getCpf());
		txRg.setText(cliente.getRg());
		txEmail.setText(cliente.getEmail());
		txTelefone.setText(cliente.getTelefone());
		txCelular.setText(cliente.getCelular());
		txUsuario.setText(cliente.getUsuario());
		txSenha.setText(cliente.getSenha());
		//txDataCadastro.setText(funcionario.getDataCadastro());
		
		JButton button = new JButton("Atualizar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try{	
					Cliente cliente = new Cliente();
					cliente.setNome(txNome.getText());
					cliente.setEndereço(txEndereco.getText());
					cliente.setBairro(txBairro.getText());
					cliente.setCidade(txCidade.getText());
					cliente.setCpf(txCpf.getText());
					cliente.setRg(txRg.getText());
					cliente.setEmail(txEmail.getText());
					cliente.setTelefone(txTelefone.getText());
					cliente.setCelular(txCelular.getText());
					cliente.setUsuario(txUsuario.getText());
					cliente.setSenha(txSenha.getText());
					//funcionario.setDataCadastro(txDataCadastro.getText());
					cliente.setIdCliente(Long.parseLong(txId.getText()));
					
					DAOCliente dao = new DAOCliente();
					dao.update(cliente);
						JOptionPane.showMessageDialog(null, "Atualizado com sucesso");
						
					}catch(Exception e1){
						e1.printStackTrace();
						JOptionPane.showMessageDialog(null, "Erro ao atualizar");
					}	
					
				
			}
		});
		button.setFont(new Font("Consolas", Font.BOLD, 16));
		button.setBounds(461, 287, 140, 30);
		panel.add(button);
		
		JButton button_1 = new JButton("Cancelar");
		button_1.setFont(new Font("Consolas", Font.BOLD, 16));
		button_1.setBounds(607, 286, 141, 31);
		panel.add(button_1);
		
		JLabel lblAtualizaoDeClientes = new JLabel("Atualiza\u00E7\u00E3o de Clientes");
		lblAtualizaoDeClientes.setFont(new Font("Consolas", Font.PLAIN, 27));
		lblAtualizaoDeClientes.setBounds(229, 18, 385, 33);
		add(lblAtualizaoDeClientes);

	}

}
