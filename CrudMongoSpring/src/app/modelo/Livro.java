package app.modelo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class Livro {

	private String id;
	@NotNull(message="Titulo deve ser preenchido")
	@Size(min=5,max=50)
	private String titulo;
	private String ator;
	private Integer ano;
	
	public Livro() {
		super();
	}
	public Livro(String titulo, String ator, Integer ano) {
		super();
		this.titulo = titulo;
		this.ator = ator;
		this.ano = ano;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAtor() {
		return ator;
	}
	public void setAtor(String ator) {
		this.ator = ator;
	}
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	

	
	
	

}
