package com.unisul.imc.controller;

import com.unisul.imc.dto.ImcDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/imc")
public class ImcController {
    @GetMapping("/calcular/{altura}/{peso}")
    public String calcular (@PathVariable("altura") float altura, @PathVariable("peso") float peso){
        ImcDTO imc = new ImcDTO();
        String resposta = "";
        try {
            float valorImc = imc.calcular(altura, peso);
            resposta = imc.resultado(valorImc);
        } catch(Exception e) {
            resposta = "Erro ao calcular o IMC. Por favor, repita a operação.";
        }
        return resposta;
    }
}
