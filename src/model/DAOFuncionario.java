package model;

import java.util.List;

import javax.persistence.Query;
import javax.swing.table.DefaultTableModel;

public class DAOFuncionario extends DAO{
	
	public DAOFuncionario(){
		
	}
	
	public void cadastrar(Funcionario funcionario){
		entityManager.getTransaction().begin();
		entityManager.persist(funcionario);
		entityManager.getTransaction().commit();
	}
	
	public List<Funcionario> getLista(){
		Query query = entityManager.createQuery("FROM Funcionario F");
		List lista = query.getResultList();
		return (List<Funcionario>) lista;
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
		
		DAOFuncionario dao = new DAOFuncionario();
		List<Funcionario> funcionarios = dao.getLista();
		
		for (Funcionario funcionario : funcionarios){
			model.addRow(new Object[]{
				//funcionario.getImagem(),
				funcionario.getIdFuncionario(),
				funcionario.getNome(),
				funcionario.getEndereço(),
				funcionario.getBairro(),
				funcionario.getCidade(),
				funcionario.getCpf(),
				funcionario.getRg(),
				funcionario.getEmail(),
				funcionario.getTelefone(),
				funcionario.getCelular(),
				funcionario.getUsuario(),
				funcionario.getSenha(),
				funcionario.getDataCadastro()
			});
		}
		return model;
	}
		public void remove(Funcionario funcionario){
			entityManager.getTransaction().begin();
			funcionario = entityManager.find(Funcionario.class, funcionario.getIdFuncionario());
			entityManager.remove(funcionario);
			entityManager.getTransaction().commit();
		}
		
		public void update(Funcionario funcionario){
			entityManager.getTransaction().begin();
			entityManager.merge(funcionario);
			entityManager.getTransaction().commit();
		}
		
		public Funcionario getBuscaId(long id){
			return entityManager.find(Funcionario.class, id);
		}
	
}