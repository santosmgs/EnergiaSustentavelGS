package com.sustentavel.energiasustentavel.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sustentavel.energiasustentavel.model.FonteEnergia;
import com.sustentavel.energiasustentavel.repository.FonteEnergiaRepository;

@Service
public class FonteEnergiaService {
    private final FonteEnergiaRepository repository;

    public FonteEnergiaService(FonteEnergiaRepository repository) {
        this.repository = repository;
    }

    // Recupera todas as fontes de energia
    public List<FonteEnergia> getAll() {
        return repository.findAll();
    }

    // Salva uma nova fonte de energia
    public FonteEnergia save(FonteEnergia fonteEnergia) {
        return repository.save(fonteEnergia);
    }
}
