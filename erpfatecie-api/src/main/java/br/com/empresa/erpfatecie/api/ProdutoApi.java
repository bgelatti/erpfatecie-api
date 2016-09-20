package br.com.empresa.erpfatecie.api;

import br.com.empresa.erpfatecie.domain.model.Produto;
import gumga.framework.application.GumgaService;
import gumga.framework.presentation.GumgaAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gella on 11/09/16.
 */
@RestController
@RequestMapping("/api/produto")
public class ProdutoApi extends GumgaAPI<Produto, Long> {

    @Autowired
    public ProdutoApi(GumgaService<Produto, Long> service) {
        super(service);
    }
}
