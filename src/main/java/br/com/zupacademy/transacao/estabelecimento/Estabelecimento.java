package br.com.zupacademy.transacao.estabelecimento;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Estabelecimento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	private String cidade;
	private String endereco;
	
	public Estabelecimento(EstabelecimentoResponse estabelecimentoResponse) {
		super();
		this.nome = estabelecimentoResponse.getNome();
		this.cidade = estabelecimentoResponse.getCidade();
		this.endereco = estabelecimentoResponse.getEndereco();
	}
	
	@Deprecated
	public Estabelecimento() {
		
	}
	

}
