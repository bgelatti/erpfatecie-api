package br.com.empresa.repository;

import br.com.empresa.erpfatecie.domain.model.Produto;
import gumga.framework.domain.repository.GumgaCrudRepository;

/**
 * Created by gella on 11/09/16.
 */
public interface ProdutoRepository extends GumgaCrudRepository<Produto, Long> {
}
