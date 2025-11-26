package br.ufms.facom.progweb.chapeleiroweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SobreNosController {
    @GetMapping("/sobre-nos")
    public String index(){
        return "sobre-nos.html";
    }
}