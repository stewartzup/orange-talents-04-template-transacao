package br.com.zupacademy.transacao.cartao;

public class CartaoResponse {

	private String id;
	private String email;

	public String getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public CartaoResponse(String id, String email) {
		super();
		this.id = id;
		this.email = email;
	}

	@Deprecated
	public CartaoResponse() {

	}

}
