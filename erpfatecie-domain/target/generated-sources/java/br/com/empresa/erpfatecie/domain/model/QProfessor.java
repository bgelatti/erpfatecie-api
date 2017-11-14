package br.com.empresa.erpfatecie.domain.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QProfessor is a Querydsl query type for Professor
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QProfessor extends EntityPathBase<Professor> {

    private static final long serialVersionUID = 1313128654L;

    public static final QProfessor professor = new QProfessor("professor");

    public final gumga.framework.domain.QGumgaModel _super = new gumga.framework.domain.QGumgaModel(this);

    public final StringPath cidade = createString("cidade");

    public final StringPath cpf = createString("cpf");

    public final StringPath endereco = createString("endereco");

    public final StringPath estado = createString("estado");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath nome = createString("nome");

    //inherited
    public final ComparablePath<gumga.framework.domain.domains.GumgaOi> oi = _super.oi;

    public QProfessor(String variable) {
        super(Professor.class, forVariable(variable));
    }

    public QProfessor(Path<? extends Professor> path) {
        super(path.getType(), path.getMetadata());
    }

    public QProfessor(PathMetadata<?> metadata) {
        super(Professor.class, metadata);
    }

}

