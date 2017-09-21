package model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="produto")

public class Produto implements Serializable {

	private static final long serialVersionUID = 1020950800821773964L;
	
	private long idProduto;
	private String nome;
	private String descricao;
	private String categoria;
	private String qtde;
	private String valor;
	private String imagem;
	private Date dataCadastro;
	
	@Id
	@GeneratedValue
	@Column(name="id_produto")
	public long getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(long idProduto) {
		this.idProduto = idProduto;
	}
	@Column(name="nome")
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Column(name="descricao")
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	@Column(name="qtde")
	public String getQtde() {
		return qtde;
	}
	public void setQtde(String qtde) {
		this.qtde = qtde;
	}
	@Column(name="valor")
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	@Column(name="categoria")
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	//@Column(name="dataCadastro")
	//public Date getDataCadastro() {
		//return dataCadastro;
	//}
	//	public void setDataCadastro(Date dataCadastro) {
	//	this.dataCadastro = dataCadastro;
	//}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
