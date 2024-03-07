package com.tiago;

import com.tiago.GeradorDeSenha;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
public class SenhaController {

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/gerar-senha")
    public String gerarSenha(){
        int comprimento = 12;
        return GeradorDeSenha.gerarSenha(comprimento);
    }
}
