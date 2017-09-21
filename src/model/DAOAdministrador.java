package model;

import java.util.List;

import javax.persistence.Query;
import javax.swing.table.DefaultTableModel;

public class DAOAdministrador extends DAO{

	public DAOAdministrador(){
			
		}
	
	public void cadastrar(Administrador administrador){
		entityManager.getTransaction().begin();
		entityManager.persist(administrador);
		entityManager.getTransaction().commit();
	}
	
	public List<Administrador> getLista(){
		Query query = entityManager.createQuery("FROM Administrador A");
		List lista = query.getResultList();
		return (List<Administrador>) lista;
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
		
		DAOAdministrador dao = new DAOAdministrador();
		List<Administrador> administradores = dao.getLista();
		
		for (Administrador administrador : administradores){
			model.addRow(new Object[]{
				//administrador.getImagem(),
				administrador.getIdAdministrador(),
				administrador.getNome(),
				administrador.getEndereco(),
				administrador.getBairro(),
				administrador.getCidade(),
				administrador.getCpf(),
				administrador.getRg(),
				administrador.getEmail(),
				administrador.getTelefone(),
				administrador.getCelular(),
				administrador.getUsuario(),
				administrador.getSenha()
				//administrador.getDataCadastro()
			});
		}
		return model;
	}
		public void remove(Administrador administrador){
			entityManager.getTransaction().begin();
			administrador = entityManager.find(Administrador.class, administrador.getIdAdministrador());
			entityManager.remove(administrador);
			entityManager.getTransaction().commit();
		}
		
		public void update(Administrador administrador){
			entityManager.getTransaction().begin();
			entityManager.merge(administrador);
			entityManager.getTransaction().commit();
		}
		
		public Administrador getBuscaId(long id){
			return entityManager.find(Administrador.class, id);
		}
	
}