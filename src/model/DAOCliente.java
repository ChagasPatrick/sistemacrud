package model;

import java.util.List;

import javax.persistence.Query;
import javax.swing.table.DefaultTableModel;

public class DAOCliente extends DAO{

	public DAOCliente(){
		
	}
		
	public void cadastrar(Cliente cliente){
		entityManager.getTransaction().begin();
		entityManager.persist(cliente);
		entityManager.getTransaction().commit();
	}
	
	public List<Cliente> getLista(){
		Query query = entityManager.createQuery("FROM Cliente c");
		List lista = query.getResultList();
		return (List<Cliente>) lista;
	}
	
	public DefaultTableModel modelLista(){
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("ID");
		//model.addColumn("IMAGEM");
		model.addColumn("NOME");
		model.addColumn("ENDEREÇO");
		model.addColumn("BAIRRO");
		model.addColumn("CIDADE");
		model.addColumn("CPF"); 
		model.addColumn("RG"); 
		model.addColumn("EMAIL");
		model.addColumn("TELEFONE");
		model.addColumn("CELULAR");
		model.addColumn("USUÁRIO");
		model.addColumn("SENHA");
		model.addColumn("DATA DO CADASTRO");
		
		DAOCliente dao = new DAOCliente();
		List<Cliente> clientes = dao.getLista();
		
		for (Cliente cliente : clientes){
			model.addRow(new Object[]{
				//funcionario.getImagem(),
				cliente.getIdCliente(),
				cliente.getNome(),
				cliente.getEndereço(),
				cliente.getBairro(),
				cliente.getCidade(),
				cliente.getCpf(),
				cliente.getRg(),
				cliente.getEmail(),
				cliente.getTelefone(),
				cliente.getCelular(),
				cliente.getUsuario(),
				cliente.getSenha(),
				cliente.getDataCadastro()
			});
		}
		return model;
	}
	
	public void remove(Cliente cliente){
		entityManager.getTransaction().begin();
		cliente = entityManager.find(Cliente.class, cliente.getIdCliente());
		entityManager.remove(cliente);
		entityManager.getTransaction().commit();	
	}
	
	
	public void update(Cliente cliente){
		entityManager.getTransaction().begin();
		entityManager.merge(cliente);
		entityManager.getTransaction().commit();
	}
	
	public Cliente getBuscaId(long id){
		return entityManager.find(Cliente.class, id);
	}
}


