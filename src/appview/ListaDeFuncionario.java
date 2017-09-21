package appview;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import model.DAOFuncionario;
import model.Funcionario;

import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class ListaDeFuncionario extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public ListaDeFuncionario(JPanel contentPane) {
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblListaDeFuncionrios = new JLabel("Lista de Funcion\u00E1rios");
		lblListaDeFuncionrios.setFont(new Font("Consolas", Font.PLAIN, 27));
		lblListaDeFuncionrios.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblListaDeFuncionrios, BorderLayout.NORTH);
		
		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		table.setFont(new Font("Consolas", Font.PLAIN, 15));
		table.setForeground(new Color(255, 255, 255));
		table.setBackground(new Color(102, 153, 153));
		DAOFuncionario dao = new DAOFuncionario();
		table.setModel(dao.modelLista());
		scrollPane.setViewportView(table);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 153, 153));
		add(panel, BorderLayout.SOUTH);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setFont(new Font("Consolas", Font.BOLD, 16));
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				long id = Long.parseLong(table.getValueAt(table.getSelectedRow(),0).toString());
				
				contentPane.removeAll();
				contentPane.add(new AtualizaFuncionario(id));
				contentPane.updateUI();
				
			}
		});
		btnEditar.setIcon(new ImageIcon("E:\\Codes\\images icons\\icons 1\\group_edit.png"));
		panel.add(btnEditar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setFont(new Font("Consolas", Font.BOLD, 16));
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int sel = JOptionPane.showConfirmDialog(null, "Deseja excluir?" + table.getValueAt(table.getSelectedRow(),1).toString());
				
				if(sel == 0){
					
					long id = Long.parseLong(table.getValueAt(table.getSelectedRow(),0).toString());
					
					Funcionario funcionario = new Funcionario();
					funcionario.setIdFuncionario(id);
					dao.remove(funcionario);
					table.setModel(dao.modelLista());
					
				JOptionPane.showMessageDialog(null, "Excluído com sucesso");
					
					
				}
				
			}
		});
		btnExcluir.setIcon(new ImageIcon("E:\\Codes\\images icons\\icons 1\\group_delete.png"));
		panel.add(btnExcluir);

	}

}
