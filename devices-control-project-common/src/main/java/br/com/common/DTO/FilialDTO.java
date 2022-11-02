package br.com.common.DTO;

public class FilialDTO {

	private Long id;
	private String descricao;
	private String numFilial;
	private String cidade;

	public FilialDTO() {
	}

	public FilialDTO(String descricao, String numFilial, String cidade) {
		this.descricao = descricao;
		this.numFilial = numFilial;
		this.cidade = cidade;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getNumFilial() {
		return numFilial;
	}

	public void setNumFilial(String numFilial) {
		this.numFilial = numFilial;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	
	
}
