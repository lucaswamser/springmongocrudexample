package app.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import app.modelo.Livro;
public interface LivroRepositorio extends MongoRepository<Livro, String> {


}
