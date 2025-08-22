package io.github.estudojava.estudoapi.controller;

import io.github.estudojava.estudoapi.model.Produto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("produtos")
public class ProdutoController {

    @PostMapping
    public Produto salvar (@RequestBody Produto produto) {
        System.out.println("PRODUTO RECEBIDO" + produto);
        return produto;
    }
}
