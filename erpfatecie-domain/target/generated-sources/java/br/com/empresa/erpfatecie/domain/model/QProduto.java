package br.com.empresa.erpfatecie.domain.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QProduto is a Querydsl query type for Produto
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QProduto extends EntityPathBase<Produto> {

    private static final long serialVersionUID = -1424374504L;

    public static final QProduto produto = new QProduto("produto");

    public final gumga.framework.domain.QGumgaModel _super = new gumga.framework.domain.QGumgaModel(this);

    public final StringPath codigoBarra = createString("codigoBarra");

    public final StringPath descricao = createString("descricao");

    public final DateTimePath<java.util.Date> dt_cadastro = createDateTime("dt_cadastro", java.util.Date.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath nome = createString("nome");

    //inherited
    public final ComparablePath<gumga.framework.domain.domains.GumgaOi> oi = _super.oi;

    public final NumberPath<Double> preco = createNumber("preco", Double.class);

    public QProduto(String variable) {
        super(Produto.class, forVariable(variable));
    }

    public QProduto(Path<? extends Produto> path) {
        super(path.getType(), path.getMetadata());
    }

    public QProduto(PathMetadata<?> metadata) {
        super(Produto.class, metadata);
    }

}

