package br.com.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.model.Produto;

/**
 * @author fsdney
 */



public interface ProdutoRepository extends MongoRepository<Produto, String> {
}
