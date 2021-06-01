package br.com.zupacademy.transacao.novaTransacao;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import br.com.zupacademy.transacao.cartao.Cartao;
import br.com.zupacademy.transacao.estabelecimento.Estabelecimento;

@Entity
public class Transacao {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String numTransacao;
	private BigDecimal valor;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Cartao cartao;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Estabelecimento estabelecimento;
	
	private LocalDateTime efetivadaEm;

	public Transacao(String numTransacao, BigDecimal valor, Cartao cartao, Estabelecimento estabelecimento,
			LocalDateTime efetivadaEm) {
		super();
		this.numTransacao = numTransacao;
		this.valor = valor;
		this.cartao = cartao;
		this.estabelecimento = estabelecimento;
		this.efetivadaEm = efetivadaEm;
	}
	
	@Deprecated
	public Transacao() {
		
	}

	public Long getId() {
		return id;
	}

	public String getNumTransacao() {
		return numTransacao;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public Cartao getCartao() {
		return cartao;
	}

	public Estabelecimento getEstabelecimento() {
		return estabelecimento;
	}

	public LocalDateTime getEfetivadaEm() {
		return efetivadaEm;
	}
	

	
	
}

