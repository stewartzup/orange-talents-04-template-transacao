package br.com.zupacademy.transacao.novaTransacao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import br.com.zupacademy.transacao.cartao.Cartao;
import br.com.zupacademy.transacao.estabelecimento.Estabelecimento;

@Component
public class ListenerDeTransacao {

	@Autowired
	private TransacaoRepository transacaoRepository;

	@KafkaListener(topics = "${spring.kafka.topic.transactions}")
	public void ouvir(EventoDeTransacao eventoDeTransacao) {
		Transacao transacao = new Transacao(eventoDeTransacao.getId(), eventoDeTransacao.getValor(),
				new Cartao(eventoDeTransacao.getCartao()), new Estabelecimento(eventoDeTransacao.getEstabelecimento()),
				eventoDeTransacao.getEfetivadaEm());
			System.out.print(eventoDeTransacao.toString());
		transacaoRepository.save(transacao);
	}
}