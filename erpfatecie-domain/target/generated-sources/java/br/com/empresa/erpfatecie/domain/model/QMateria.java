package br.com.empresa.erpfatecie.domain.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QMateria is a Querydsl query type for Materia
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QMateria extends EntityPathBase<Materia> {

    private static final long serialVersionUID = -273969660L;

    public static final QMateria materia = new QMateria("materia");

    public final gumga.framework.domain.QGumgaModel _super = new gumga.framework.domain.QGumgaModel(this);

    public final NumberPath<java.math.BigDecimal> carga_horaria = createNumber("carga_horaria", java.math.BigDecimal.class);

    public final StringPath curso = createString("curso");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath nome = createString("nome");

    //inherited
    public final ComparablePath<gumga.framework.domain.domains.GumgaOi> oi = _super.oi;

    public final StringPath professor = createString("professor");

    public QMateria(String variable) {
        super(Materia.class, forVariable(variable));
    }

    public QMateria(Path<? extends Materia> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMateria(PathMetadata<?> metadata) {
        super(Materia.class, metadata);
    }

}

