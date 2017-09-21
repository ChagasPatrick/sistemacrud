package model;

import java.util.List;

import javax.persistence.Query;
import javax.swing.table.DefaultTableModel;

public class DAOProduto extends DAO{
	
	public DAOProduto(){
		
	}
	
	public void cadastrar(Produto produto){
		entityManager.getTransaction().begin();
		entityManager.persist(produto);
		entityManager.getTransaction().commit();
	}
	
	public List<Produto> getLista(){
		Query query = entityManager.createQuery("FROM Produto P");
		List lista = query.getResultList();
		return (List<Produto>) lista;
	}
	
	public DefaultTableModel modelLista(){
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("ID");
		//model.addColumn("IMAGEM");
		model.addColumn("NOME");
		model.addColumn("CATEGORIA");
		model.addColumn("DESCRIÇÃO"); 
		model.addColumn("QUANTIDADE"); // QUANTIDADE SERÁ O ESTOQUE ???
		model.addColumn("VALOR");
		model.addColumn("DATA DO CADASTRO");
		
		DAOProduto dao = new DAOProduto();
		List<Produto> produtos = dao.getLista();
		
		for (Produto produto : produtos){
			model.addRow(new Object[]{
				//produto.getImagem(),
				produto.getIdProduto(),
				produto.getNome(),
				produto.getDescricao(),
				produto.getCategoria(),
				produto.getQtde(),
				produto.getValor()
				//produto.getDataCadastro()
			});
		}
		return model;
	}
	
	public void remove(Produto produto){
		entityManager.getTransaction().begin();
		produto = entityManager.find(Produto.class, produto.getIdProduto());
		entityManager.remove(produto);
		entityManager.getTransaction().commit();
	}
	
	public void update(Produto produto){
		entityManager.getTransaction().begin();
		entityManager.merge(produto);
		entityManager.getTransaction().commit();
	}
	
	public Produto getBuscaId(long id){
		return entityManager.find(Produto.class, id);
	}
	
}
