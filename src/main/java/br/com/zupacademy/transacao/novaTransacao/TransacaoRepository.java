package br.com.zupacademy.transacao.novaTransacao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.zupacademy.transacao.cartao.Cartao;

@Repository
public interface TransacaoRepository extends JpaRepository<Transacao, Long> {

	Page<Transacao> findByCartaoNumeroCartao(String numeroCartao, Pageable paginacao);

}
