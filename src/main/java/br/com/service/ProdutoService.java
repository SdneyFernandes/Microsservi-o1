package br.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.model.Produto;
import br.com.repository.ProdutoRepository;

import java.util.List;
import java.util.Optional;

/**
 * @author fsdney
 */


@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository ProdutoRepository;

    public Produto cadastrarProduto(Produto produto) {
        return ProdutoRepository.save(produto);
    }

    public List<Produto> listarProduto() {
        return ProdutoRepository.findAll();
    }

    public Optional<Produto> buscarProdutoPorId(String id) {
        return ProdutoRepository.findById(id);
    }

    public Produto atualizarProduto(Produto produto) {
        return ProdutoRepository.save(produto);
    }
}

