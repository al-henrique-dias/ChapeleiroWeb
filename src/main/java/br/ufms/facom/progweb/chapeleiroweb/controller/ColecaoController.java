package br.ufms.facom.progweb.chapeleiroweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ColecaoController {
    @GetMapping("/colecao")
    public String index(){
        return "colecao.html";
    }
}