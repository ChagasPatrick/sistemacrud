package model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Administrador")
public class Administrador implements Serializable{

	
	private static final long serialVersionUID = -6329360584594975015L;
	
	private long idAdministrador;
	private String nome;
	//private String imagem;
	private String endereco;
	private String bairro;
	private String cidade;
	private String cpf;
	private String rg;
	private String email;
	private String telefone;
	private String celular;
	private String usuario;
	private String senha;
	private Date dataCadastro;
	
	@Id
	@GeneratedValue
	@Column(name="id_administrador")
	public long getIdAdministrador() {
		return idAdministrador;
	}
	public void setIdAdministrador(long idAdministrador) {
		this.idAdministrador = idAdministrador;
	}
	@Column(name="nome")
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	//@Column(name="imagem")
	//public String getImagem() {
		//return imagem;
	//}
	//public void setImagem(String imagem) {
		//this.imagem = imagem;
	//}
	@Column(name="endereco")
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	@Column(name="bairro")
	public String getBairro() {
		return bairro;
	}
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	@Column(name="cidade")
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	@Column(name="cpf")
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	@Column(name="rg")
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	@Column(name="email")
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Column(name="telefone")
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	@Column(name="celular")
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	@Column(name="usuario")
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	@Column(name="senha")
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	@Column(name="dataCadastro")
	public Date getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
