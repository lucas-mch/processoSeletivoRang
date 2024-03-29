package dev.lucasmachado.rangprocessoseletivo.service;


import dev.lucasmachado.rangprocessoseletivo.model.UnidadeSaude;
import dev.lucasmachado.rangprocessoseletivo.repository.UnidadeSaudeRepository;
import jakarta.enterprise.context.SessionScoped;

import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
@SessionScoped
public class UnidadeSaudeService implements Serializable {
    @Inject
    private UnidadeSaudeRepository unidadeSaudeRepository;

    public UnidadeSaude salvar(UnidadeSaude unidadeSaude) {
        return unidadeSaudeRepository.create(unidadeSaude);
    }

    public List<UnidadeSaude> findAll() {
        return new ArrayList<UnidadeSaude>();
    }
}
