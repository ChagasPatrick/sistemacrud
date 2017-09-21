package appview;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;

import model.Administrador;
import model.DAOAdministrador;
import model.DAOFuncionario;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class ListaDeAdministrador extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public ListaDeAdministrador(JPanel contentPane) {
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblListaDeAdministradores = new JLabel("Lista de Administradores");
		lblListaDeAdministradores.setHorizontalAlignment(SwingConstants.CENTER);
		lblListaDeAdministradores.setFont(new Font("Consolas", Font.PLAIN, 27));
		add(lblListaDeAdministradores, BorderLayout.NORTH);
		
		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		table.setForeground(new Color(255, 255, 255));
		table.setBackground(new Color(102, 153, 153));
		DAOAdministrador dao = new DAOAdministrador();
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
				contentPane.add(new AtualizaAdministrador(id));
				contentPane.updateUI();
				
				
			}
		});
		btnEditar.setIcon(new ImageIcon("E:\\Codes\\images icons\\icons 1\\user_edit.png"));
		panel.add(btnEditar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setFont(new Font("Consolas", Font.BOLD, 16));
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int sel = JOptionPane.showConfirmDialog(null, "Deseja Excluir? " + table.getValueAt(table.getSelectedRow(),1).toString());
			
			if(sel == 0){	
				
				long id = Long.parseLong(table.getValueAt(table.getSelectedRow(),0).toString());
				
				Administrador administrador = new Administrador();
				
				contentPane.removeAll();
				administrador.setIdAdministrador(id);
				dao.remove(administrador);
				table.setModel(dao.modelLista());
				
				JOptionPane.showMessageDialog(null, "Excluído com sucesso");
				}
			}
		});
		btnExcluir.setIcon(new ImageIcon("E:\\Codes\\images icons\\icons 1\\user_delete.png"));
		panel.add(btnExcluir);

	}

}
