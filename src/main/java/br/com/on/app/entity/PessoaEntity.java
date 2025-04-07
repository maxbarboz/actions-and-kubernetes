package br.com.on.app.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.*;

@Entity
@Table(
        name = "pessoa",
        schema = "public",
        uniqueConstraints = {@UniqueConstraint(columnNames = "email"), @UniqueConstraint(columnNames = "cpf")})
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class PessoaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "nome", nullable = false, length = 255)
    private String nome;

    @Column(name = "email", nullable = false, length = 255, unique = true)
    private String email;

    @Column(name = "data_nascimento")
    private LocalDate dataNascimento;

    @Column(name = "cpf", length = 14, unique = true)
    private String cpf;

    @Column(name = "telefone", length = 20)
    private String telefone;

    @Column(name = "endereco", columnDefinition = "TEXT")
    private String endereco;

    @Column(name = "criado_em", nullable = false, updatable = false)
    private LocalDateTime criadoEm;

    @Column(name = "atualizado_em", nullable = false)
    private LocalDateTime atualizadoEm;
}
