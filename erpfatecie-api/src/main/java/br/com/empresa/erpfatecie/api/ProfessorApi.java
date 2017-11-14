package br.com.empresa.erpfatecie.api;

import br.com.empresa.erpfatecie.domain.model.Professor;
import gumga.framework.application.GumgaService;
import gumga.framework.presentation.GumgaAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gelatti on 13/11/17.
 */
@RestController
@RequestMapping("/api/professor")
public class ProfessorApi extends GumgaAPI<Professor, Long> {

    @Autowired
    public ProfessorApi(GumgaService<Professor, Long> service) {
        super(service);
    }
}
