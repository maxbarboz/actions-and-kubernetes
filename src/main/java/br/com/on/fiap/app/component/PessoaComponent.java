package br.com.on.fiap.app.component;

import br.com.on.fiap.app.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PessoaComponent {

    private PessoaRepository repository;

    @Autowired
    public PessoaComponent(PessoaRepository pessoaRepository) {
        this.repository = pessoaRepository;
    }

    public void inserirPessoa() {}
}
