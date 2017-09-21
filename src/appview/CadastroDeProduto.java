package appview;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;

import model.DAOProduto;
import model.Produto;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroDeProduto extends JPanel {
	private JTextField txId;
	private JTextField txNome;
	private JTextField txQtde;
	private JTextField txDescricao;
	private JTextField txValor;
	private JTextField txDataCadastro;
	private JTextField txCategoria;

	/**
	 * Create the panel.
	 */
	public CadastroDeProduto() {
		setBackground(new Color(102, 153, 153));
		setLayout(null);
		
		JLabel lblCadastroDeProdutos = new JLabel("Cadastro de Produtos");
		lblCadastroDeProdutos.setFont(new Font("Consolas", Font.PLAIN, 30));
		lblCadastroDeProdutos.setBounds(248, 11, 400, 51);
		add(lblCadastroDeProdutos);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 153, 153));
		panel.setBounds(10, 73, 790, 405);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblCod = new JLabel("Cod:");
		lblCod.setForeground(Color.BLACK);
		lblCod.setFont(new Font("Consolas", Font.PLAIN, 14));
		lblCod.setBounds(10, 21, 46, 14);
		panel.add(lblCod);
		
		txId = new JTextField();
		txId.setBounds(47, 18, 70, 20);
		panel.add(txId);
		txId.setColumns(10);
		
		txNome = new JTextField();
		txNome.setBounds(202, 18, 345, 20);
		panel.add(txNome);
		txNome.setColumns(10);
		
		JLabel lblProduto = new JLabel("Produto");
		lblProduto.setForeground(Color.BLACK);
		lblProduto.setFont(new Font("Consolas", Font.PLAIN, 14));
		lblProduto.setBounds(142, 21, 62, 14);
		panel.add(lblProduto);
		
		JLabel lblQuantidade = new JLabel("Quantidade");
		lblQuantidade.setForeground(Color.BLACK);
		lblQuantidade.setFont(new Font("Consolas", Font.PLAIN, 14));
		lblQuantidade.setBounds(578, 21, 85, 14);
		panel.add(lblQuantidade);
		
		txQtde = new JTextField();
		txQtde.setBounds(670, 18, 103, 20);
		panel.add(txQtde);
		txQtde.setColumns(10);
		
		JLabel lblDescrio = new JLabel("Descri\u00E7\u00E3o");
		lblDescrio.setForeground(Color.BLACK);
		lblDescrio.setFont(new Font("Consolas", Font.PLAIN, 14));
		lblDescrio.setBounds(10, 69, 85, 18);
		panel.add(lblDescrio);
		
		txDescricao = new JTextField();
		txDescricao.setColumns(10);
		txDescricao.setBounds(94, 66, 322, 20);
		panel.add(txDescricao);
		
		JLabel lblValor = new JLabel("Valor");
		lblValor.setForeground(Color.BLACK);
		lblValor.setFont(new Font("Consolas", Font.PLAIN, 14));
		lblValor.setBounds(298, 115, 40, 14);
		panel.add(lblValor);
		
		txValor = new JTextField();
		txValor.setColumns(10);
		txValor.setBounds(347, 112, 103, 20);
		panel.add(txValor);
		
		JLabel lblDataDoCadastro = new JLabel("Data do Cadastro");
		lblDataDoCadastro.setForeground(Color.BLACK);
		lblDataDoCadastro.setFont(new Font("Consolas", Font.PLAIN, 14));
		lblDataDoCadastro.setBounds(457, 69, 153, 18);
		panel.add(lblDataDoCadastro);
		
		txDataCadastro = new JTextField();
		txDataCadastro.setColumns(10);
		txDataCadastro.setBounds(596, 67, 103, 20);
		panel.add(txDataCadastro);
		
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Consolas", Font.BOLD, 16));
		btnCancelar.setBounds(649, 153, 115, 23);
		panel.add(btnCancelar);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setFont(new Font("Consolas", Font.BOLD, 16));
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try{
					Produto produto = new Produto();
					produto.setNome(txNome.getText());
					produto.setDescricao(txDescricao.getText());
					produto.setCategoria(txCategoria.getText());
					produto.setQtde(txQtde.getText());
					produto.setValor(txValor.getText());
					//produto.setDataCadastro(txDataCadastro.getText());
					DAOProduto dao = new DAOProduto();
					dao.cadastrar(produto);
					JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
					
					}catch(Exception e){
						e.printStackTrace();
						JOptionPane.showMessageDialog(null, "Erro ao cadastrar");
					}		
				}
		});
		btnCadastrar.setBounds(524, 153, 115, 23);
		panel.add(btnCadastrar);
		
		JLabel lblCategoria = new JLabel("Categoria");
		lblCategoria.setForeground(Color.BLACK);
		lblCategoria.setFont(new Font("Consolas", Font.PLAIN, 14));
		lblCategoria.setBounds(16, 116, 75, 17);
		panel.add(lblCategoria);
		
		txCategoria = new JTextField();
		txCategoria.setColumns(10);
		txCategoria.setBounds(103, 112, 163, 20);
		panel.add(txCategoria);

	}
}
