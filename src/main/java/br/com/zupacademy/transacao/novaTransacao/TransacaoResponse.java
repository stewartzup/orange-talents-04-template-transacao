package br.com.zupacademy.transacao.novaTransacao;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.data.domain.Page;
import br.com.zupacademy.transacao.cartao.Cartao;
import br.com.zupacademy.transacao.estabelecimento.Estabelecimento;

public class TransacaoResponse {

	private String id;
	private BigDecimal valor;
	private Estabelecimento estabelecimento;
	private LocalDateTime efetivadaEm;

	public TransacaoResponse(Transacao transacao) {
		super();
		this.id = transacao.getNumTransacao();
		this.valor = transacao.getValor();
		this.estabelecimento = transacao.getEstabelecimento();
		this.efetivadaEm = transacao.getEfetivadaEm();
	}

	@Deprecated
	public TransacaoResponse() {

	}
	
	public static Page<TransacaoResponse> converter(Page<Transacao> transacao) {
		return transacao.map(TransacaoResponse::new);
			
	}

	public String getId() {
		return id;
	}




	
	

}
