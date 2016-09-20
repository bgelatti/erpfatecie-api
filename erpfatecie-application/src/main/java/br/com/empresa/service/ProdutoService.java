package br.com.empresa.service;

import br.com.empresa.erpfatecie.domain.model.Produto;
import br.com.empresa.repository.ProdutoRepository;
import gumga.framework.application.GumgaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by gella on 11/09/16.
 */
@Service
public class ProdutoService extends GumgaService<Produto, Long> {

    private ProdutoRepository repository;

    @Autowired
    public ProdutoService(ProdutoRepository repository) {
        super(repository);
        this.repository = repository;
    }
}
