package br.com.empresa.service;

import br.com.empresa.erpfatecie.domain.model.Pessoa;
import br.com.empresa.repository.PessoaRepository;
import gumga.framework.application.GumgaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by gella on 19/09/16.
 */
@Service
public class PessoaService extends GumgaService<Pessoa, Long> {

    private PessoaRepository repository;

    @Autowired
    public PessoaService(PessoaRepository repository) {
        super(repository);
        this.repository = repository;
    }
}
