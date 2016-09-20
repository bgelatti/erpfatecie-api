package br.com.empresa.erpfatecie.domain.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPessoa is a Querydsl query type for Pessoa
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QPessoa extends EntityPathBase<Pessoa> {

    private static final long serialVersionUID = -889103960L;

    public static final QPessoa pessoa = new QPessoa("pessoa");

    public final gumga.framework.domain.QGumgaModel _super = new gumga.framework.domain.QGumgaModel(this);

    public final StringPath apelido = createString("apelido");

    public final StringPath cpf_cnpj = createString("cpf_cnpj");

    public final DateTimePath<java.util.Date> dt_nascimento = createDateTime("dt_nascimento", java.util.Date.class);

    public final StringPath genero = createString("genero");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath nome = createString("nome");

    //inherited
    public final ComparablePath<gumga.framework.domain.domains.GumgaOi> oi = _super.oi;

    public final StringPath rg_ie = createString("rg_ie");

    public final StringPath telefone = createString("telefone");

    public QPessoa(String variable) {
        super(Pessoa.class, forVariable(variable));
    }

    public QPessoa(Path<? extends Pessoa> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPessoa(PathMetadata<?> metadata) {
        super(Pessoa.class, metadata);
    }

}

