package br.com.lucasfelixsantos.projetotransito.domain.model;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Proprietario {
    private Long id;
    private String nome;
    private String email;
    private String telefone;
}