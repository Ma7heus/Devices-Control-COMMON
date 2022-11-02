package br.com.common.DTO;

public class UsuarioDTO {
	
	private Long id;
	private String nome;
	private String matricula;
	private String centroDeCusto;
	private FilialDTO filial;
	
	public UsuarioDTO() {
	}

	public UsuarioDTO(String nome, String matricula, String centroDeCusto, FilialDTO filial) {
		this.nome = nome;
		this.matricula = matricula;
		this.centroDeCusto = centroDeCusto;
		this.filial = filial;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCentroDeCusto() {
		return centroDeCusto;
	}

	public void setCentroDeCusto(String centroDeCusto) {
		this.centroDeCusto = centroDeCusto;
	}

	public FilialDTO getFilial() {
		return filial;
	}

	public void setFilial(FilialDTO filial) {
		this.filial = filial;
	}
	
	
	
}
