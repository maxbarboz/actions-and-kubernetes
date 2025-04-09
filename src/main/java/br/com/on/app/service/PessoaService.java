package br.com.on.app.service;

import br.com.on.app.component.PessoaComponent;
import br.com.on.app.entity.dto.PessoaInsertDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {

    private PessoaComponent component;

    @Autowired
    public PessoaService(PessoaComponent pessoaComponent) {
        this.component = pessoaComponent;
    }

    public PessoaInsertDTO incluirPessoa(PessoaInsertDTO pessoa) {
        return new PessoaInsertDTO();
    }
}
