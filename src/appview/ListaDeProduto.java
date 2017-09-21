package appview;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.SoftBevelBorder;

import model.DAOProduto;
import model.Produto;

import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class ListaDeProduto extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public ListaDeProduto(JPanel contentPane) {
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Lista de Produtos");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Consolas", Font.PLAIN, 27));
		add(lblNewLabel, BorderLayout.NORTH);
		
		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		table.setFont(new Font("Consolas", Font.PLAIN, 14));
		table.setBackground(new Color(102, 153, 153));
		DAOProduto dao = new DAOProduto();
		table.setModel(dao.modelLista());
		table.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		scrollPane.setViewportView(table);
		
		JPanel panel = new JPanel();
		scrollPane.setColumnHeaderView(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(102, 153, 153));
		add(panel_1, BorderLayout.SOUTH);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setFont(new Font("Consolas", Font.BOLD, 16));
		btnEditar.setIcon(new ImageIcon("E:\\Codes\\images icons\\icons 1\\package_go.png"));
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				long id = Long.parseLong(table.getValueAt(table.getSelectedRow(),0).toString());
		
				contentPane.removeAll();
				contentPane.add(new AtualizaProduto(id));
				contentPane.updateUI();
				
			}
		});
		panel_1.add(btnEditar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setFont(new Font("Consolas", Font.BOLD, 16));
		btnExcluir.setIcon(new ImageIcon("E:\\Codes\\images icons\\icons 1\\package_delete.png"));
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int sel = JOptionPane.showConfirmDialog(null, "Deseja excluir? " + table.getValueAt(table.getSelectedRow(),1).toString());
				
				if(sel == 0){
					
					long id = Long.parseLong(table.getValueAt(table.getSelectedRow(),0).toString());
					
					Produto produto = new Produto();
					produto.setIdProduto(id);
					dao.remove(produto);
					table.setModel(dao.modelLista());
					
				JOptionPane.showMessageDialog(null, "Excluído com sucesso");
					
				}
				
			}
		});
		panel_1.add(btnExcluir);

	}

}
