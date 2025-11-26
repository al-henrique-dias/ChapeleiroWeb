package br.ufms.facom.progweb.chapeleiroweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BuscaController {
    @GetMapping("/busca")
    public String index(){
        return "search.html";
    }
}