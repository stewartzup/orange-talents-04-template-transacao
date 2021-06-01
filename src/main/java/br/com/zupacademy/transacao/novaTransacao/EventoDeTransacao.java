package br.com.zupacademy.transacao.novaTransacao;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import br.com.zupacademy.transacao.cartao.CartaoResponse;
import br.com.zupacademy.transacao.estabelecimento.EstabelecimentoResponse;



public class EventoDeTransacao {
	private String id;
	private BigDecimal valor;
	private CartaoResponse cartao;
	private EstabelecimentoResponse estabelecimento;
	private LocalDateTime efetivadaEm;
	

	public EventoDeTransacao(String id, BigDecimal valor, CartaoResponse cartao,
			EstabelecimentoResponse estabelecimento, LocalDateTime efetivadaEm) {
		super();
		this.id = id;
		this.valor = valor;
		this.cartao = cartao;
		this.estabelecimento = estabelecimento;
		this.efetivadaEm = efetivadaEm;
	}
	@Deprecated
	public EventoDeTransacao() {
		
	}
	

	@Override
	public String toString() {
		return "EventoDeTransacao [id=" + id + ", valor=" + valor + ", cartao=" + cartao + ", estabelecimento="
				+ estabelecimento + ", efetivadaEm=" + efetivadaEm + "]";
	}
	public String getId() {
		return id;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public CartaoResponse getCartao() {
		return cartao;
	}

	public EstabelecimentoResponse getEstabelecimento() {
		return estabelecimento;
	}

	public LocalDateTime getEfetivadaEm() {
		return efetivadaEm;
	}

	

}
