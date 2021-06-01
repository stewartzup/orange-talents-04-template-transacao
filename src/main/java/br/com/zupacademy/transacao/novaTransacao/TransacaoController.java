package br.com.zupacademy.transacao.novaTransacao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.zupacademy.transacao.cartao.Cartao;

import org.springframework.data.domain.Sort;


@RestController
@RequestMapping("/transacao")
public class TransacaoController {

	@Autowired
	public TransacaoRepository transacaoRepository;

	@GetMapping("/{numeroCartao}")
	public ResponseEntity<?> buscaTransacaoNoCartao(@PathVariable ("numeroCartao") String numeroCartao) {
		
		Pageable paginacao = PageRequest.of(0, 10, Sort.by("EfetivadaEm").descending());
		Page<Transacao> procuraCartaoIdPag = transacaoRepository.findByCartaoNumeroCartao(numeroCartao, paginacao);
		
		if (procuraCartaoIdPag.isEmpty()) {
			
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(TransacaoResponse.converter(procuraCartaoIdPag));

	}

}
