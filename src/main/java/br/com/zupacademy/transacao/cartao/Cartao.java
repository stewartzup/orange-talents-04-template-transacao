package br.com.zupacademy.transacao.cartao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cartao {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String numeroCartao;
	private String email;
	
	
	
	public Cartao(CartaoResponse cartaoResponse) {
		super();
		this.numeroCartao = cartaoResponse.getId();
		this.email = cartaoResponse.getEmail();
	}



	@Deprecated
	public Cartao() {
		
	}
	
	
}
