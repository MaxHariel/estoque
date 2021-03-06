package br.edu.fjn.estoque.estoque.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class SaidaMaterial {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long codigosaida;
	
	@NotBlank
	@NotNull
	private String funcionario_solicitante;
	
	@NotBlank
	@NotNull
	private String setor;
	
	@NotNull
	private int qtde;
	
	
	@ManyToOne
	private Produto produto;
	
	
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public long getCodigosaida() {
		return codigosaida;
	}
	public void setCodigosaida(long codigosaida) {
		this.codigosaida = codigosaida;
	}
	public String getFuncionario_solicitante() {
		return funcionario_solicitante;
	}
	public void setFuncionario_solicitante(String funcionario_solicitante) {
		this.funcionario_solicitante = funcionario_solicitante;
	}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public int getQtde() {
		return qtde;
	}
	public void setQtde(int qtde) {
		this.qtde = qtde;
	}
	
	
	

	
}
