package br.com.empresa.erpfatecie.api;

import br.com.empresa.erpfatecie.domain.model.Pessoa;
import gumga.framework.application.GumgaService;
import gumga.framework.presentation.GumgaAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gella on 19/09/16.
 */
@RestController
@RequestMapping("/api/pessoa")
public class PessoaApi extends GumgaAPI<Pessoa, Long> {

    @Autowired
    public PessoaApi(GumgaService<Pessoa, Long> service) {
        super(service);
    }
}
