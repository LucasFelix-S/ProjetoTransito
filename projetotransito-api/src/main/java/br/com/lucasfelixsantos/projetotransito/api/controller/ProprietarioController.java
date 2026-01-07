package br.com.lucasfelixsantos.projetotransito.api.controller;
import br.com.lucasfelixsantos.projetotransito.domain.model.Proprietario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;

@RestController
public class ProprietarioController {

    @GetMapping("/proprietarios")
    public List<Proprietario> listar() {
        var proprietario1 = new Proprietario();
        proprietario1.setId(1L);
        proprietario1.setNome("Lucas Felix Santos");
        proprietario1.setEmail("lucasfelixsantos2002@gmail.com");
        proprietario1.setTelefone("(35) 98825-5359");

        var proprietario2 = new Proprietario();
        proprietario2.setId(2L);
        proprietario2.setNome("Bruna Daniely de Souza");
        proprietario2.setEmail("brunameuamor@gmail.com");
        proprietario2.setTelefone("(35) 99999-9999");

        return Arrays.asList(proprietario1, proprietario2);
    }
}