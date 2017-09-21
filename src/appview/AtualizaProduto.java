package appview;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.border.TitledBorder;

import model.DAOProduto;
import model.Produto;

import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class AtualizaProduto extends JPanel {
	private JTextField txId;
	private JTextField txNome;
	private JTextField txQtde;
	private JTextField txDescricao;
	private JTextField txCategoria;
	private JTextField txValor;
	private JTextField txDataCadastro;
	private static Produto produto;

	/**
	 * Create the panel.
	 */
	public AtualizaProduto(long id) {
		DAOProduto dao = new DAOProduto();
		produto = dao.getBuscaId(id);
		setLayout(null);
		
		JLabel lblAtualizaoDeProdutos = new JLabel("Atualiza\u00E7\u00E3o de Produtos");
		lblAtualizaoDeProdutos.setHorizontalAlignment(SwingConstants.CENTER);
		lblAtualizaoDeProdutos.setFont(new Font("Consolas", Font.PLAIN, 27));
		lblAtualizaoDeProdutos.setBounds(165, 11, 413, 47);
		add(lblAtualizaoDeProdutos);
		
		JPanel panel = new JPanel();
		panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 69, 707, 276);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblId = new JLabel("ID: ");
		lblId.setBounds(10, 22, 46, 14);
		panel.add(lblId);
		
		txId = new JTextField();
		txId.setEditable(false);
		txId.setBounds(32, 19, 70, 20);
		panel.add(txId);
		txId.setColumns(10);
		
		JLabel lblNomeDoProduto = new JLabel("NOME DO PRODUTO:");
		lblNomeDoProduto.setBounds(112, 22, 121, 14);
		panel.add(lblNomeDoProduto);
		
		txNome = new JTextField();
		txNome.setColumns(10);
		txNome.setBounds(226, 19, 262, 20);
		panel.add(txNome);
		
		txQtde = new JTextField();
		txQtde.setColumns(10);
		txQtde.setBounds(617, 19, 80, 17);
		panel.add(txQtde);
		
		JLabel lblQuantidade = new JLabel("QUANTIDADE:");
		lblQuantidade.setBounds(511, 22, 97, 14);
		panel.add(lblQuantidade);
		
		txDescricao = new JTextField();
		txDescricao.setColumns(10);
		txDescricao.setBounds(91, 74, 262, 20);
		panel.add(txDescricao);
		
		JLabel lblDescrio = new JLabel("DESCRI\u00C7\u00C3O:");
		lblDescrio.setBounds(21, 77, 121, 14);
		panel.add(lblDescrio);
		
		JLabel lblCategoria = new JLabel("CATEGORIA:");
		lblCategoria.setBounds(21, 118, 121, 14);
		panel.add(lblCategoria);
		
		txCategoria = new JTextField();
		txCategoria.setColumns(10);
		txCategoria.setBounds(91, 115, 144, 20);
		panel.add(txCategoria);
		
		JLabel lblValor = new JLabel("VALOR:");
		lblValor.setBounds(363, 77, 70, 14);
		panel.add(lblValor);
		
		txValor = new JTextField();
		txValor.setColumns(10);
		txValor.setBounds(414, 74, 86, 20);
		panel.add(txValor);
		
		JLabel lblDataDoCadastro = new JLabel("DATA DO CADASTRO:");
		lblDataDoCadastro.setBounds(507, 77, 121, 14);
		panel.add(lblDataDoCadastro);
		
		txDataCadastro = new JTextField();
		txDataCadastro.setColumns(10);
		txDataCadastro.setBounds(617, 74, 80, 20);
		panel.add(txDataCadastro);
		
		txId.setText(produto.getIdProduto()+"");
		txNome.setText(produto.getNome());
		txDescricao.setText(produto.getDescricao());
		txCategoria.setText(produto.getCategoria());
		txQtde.setText(produto.getQtde());
		txValor.setText(produto.getValor());
		
		
		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try{
					
					Produto produto = new Produto();
					produto.setNome(txNome.getText());
					produto.setDescricao(txDescricao.getText());
					produto.setCategoria(txCategoria.getText());
					produto.setQtde(txQtde.getText());
					produto.setValor(txValor.getText());
					produto.setIdProduto(Long.parseLong(txId.getText()));
					
					DAOProduto dao = new DAOProduto();
					dao.update(produto);
						JOptionPane.showMessageDialog(null, "Atualizado com sucesso");
						
					}catch(Exception e1){
						JOptionPane.showMessageDialog(null, "Erro ao atualizar");
						e1.printStackTrace();
					}			
				}
			});
		btnAtualizar.setFont(new Font("Consolas", Font.BOLD, 17));
		btnAtualizar.setIcon(new ImageIcon("E:\\Codes\\images icons\\icons 1\\application_edit.png"));
		btnAtualizar.setBounds(346, 186, 152, 37);
		panel.add(btnAtualizar);
		
		JButton btnLista = new JButton("Lista");
		btnLista.setIcon(new ImageIcon("E:\\Codes\\images icons\\icons 1\\application_home.png"));
		btnLista.setFont(new Font("Consolas", Font.BOLD, 17));
		btnLista.setBounds(505, 186, 152, 37);
		panel.add(btnLista);

		
		
	}
}
