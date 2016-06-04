package app.service;

import java.util.List;

import app.modelo.Livro;

public interface LivroService {
	
	
	public void adicionar(Livro livro);
	public void atualizar(Livro livro);
	public void remover(Object id);
	public Livro carregar(Object id);
	public List<Livro> listar();
	
	

}
