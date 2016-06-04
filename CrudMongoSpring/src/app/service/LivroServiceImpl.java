package app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.modelo.Livro;
import app.repositories.LivroRepositorio;


@Service
public class LivroServiceImpl implements LivroService {

	@Autowired
	private LivroRepositorio livroRepository;
	
	@Override
	public void adicionar(Livro livro) {
		livroRepository.save(livro);
	}

	@Override
	public void atualizar(Livro livro) {
		livroRepository.save(livro);
		
	}

	@Override
	public void remover(Object id) {
		livroRepository.delete(String.valueOf(id));
	}

	@Override
	public Livro carregar(Object id){
		return livroRepository.findOne(String.valueOf(id));
	}
	
	@Override
	public List<Livro> listar() {
		return (List<Livro>) livroRepository.findAll();
	}

	
}
