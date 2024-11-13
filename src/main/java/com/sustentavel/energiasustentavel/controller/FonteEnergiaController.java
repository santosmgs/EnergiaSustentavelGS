package com.sustentavel.energiasustentavel.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sustentavel.energiasustentavel.model.FonteEnergia;
import com.sustentavel.energiasustentavel.service.FonteEnergiaService;

@RestController
@RequestMapping("/api/fontes")
public class FonteEnergiaController {
    private final FonteEnergiaService service;

    // Injeção de dependência do serviço
    public FonteEnergiaController(FonteEnergiaService service) {
        this.service = service;
    }

    // Endpoint para obter todas as fontes de energia
    @GetMapping
    public List<FonteEnergia> getAllFontes() {
        return service.getAll();
    }

    // Endpoint para criar uma nova fonte de energia
    @PostMapping
    public FonteEnergia createFonteEnergia(@RequestBody FonteEnergia fonteEnergia) {
        return service.save(fonteEnergia);
    }
}
