
package appview;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;

import model.Cliente;
import model.DAOCliente;
import model.DAOFuncionario;

import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class ListaDeCliente extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public ListaDeCliente(JPanel contentPane) {
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblListaDeClientes = new JLabel("Lista de Clientes");
		lblListaDeClientes.setBackground(new Color(102, 153, 153));
		lblListaDeClientes.setHorizontalAlignment(SwingConstants.CENTER);
		lblListaDeClientes.setFont(new Font("Consolas", Font.PLAIN, 27));
		add(lblListaDeClientes, BorderLayout.NORTH);
		
		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		table.setFont(new Font("Consolas", Font.PLAIN, 15));
		table.setForeground(new Color(255, 255, 255));
		table.setBackground(new Color(102, 153, 153));
		DAOCliente dao = new DAOCliente();
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
				contentPane.add(new AtualizaCliente(id));
				contentPane.updateUI();
				
			}
		});
		panel.add(btnEditar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setFont(new Font("Consolas", Font.BOLD, 16));
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int sel = JOptionPane.showConfirmDialog(null, "Deseja Excluir ? " + table.getValueAt(table.getSelectedRow(),0).toString());
				
				if(sel == 0){
					
					long id = Long.parseLong (table.getValueAt(table.getSelectedRow(),0).toString());
					
						Cliente cliente = new Cliente();
						cliente.setIdCliente(id);
						dao.remove(cliente);
						table.setModel(dao.modelLista());
					
						JOptionPane.showMessageDialog(null, "Excluído com sucesso");
					
				}
				
				
			}
		});
		panel.add(btnExcluir);
		

	}

}
