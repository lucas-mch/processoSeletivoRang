package dev.lucasmachado.rangprocessoseletivo.service;


import dev.lucasmachado.rangprocessoseletivo.bean.NotificationBean;
import dev.lucasmachado.rangprocessoseletivo.exceptions.ConflictFaixaCepException;
import dev.lucasmachado.rangprocessoseletivo.model.UnidadeSaude;
import dev.lucasmachado.rangprocessoseletivo.repository.UnidadeSaudeRepository;
import jakarta.enterprise.context.SessionScoped;

import jakarta.faces.application.FacesMessage;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static dev.lucasmachado.rangprocessoseletivo.utils.Converter.stringToInt;

@Named
@SessionScoped
public class UnidadeSaudeService implements Serializable {
    @Inject
    private UnidadeSaudeRepository unidadeSaudeRepository;

    @Inject
    private NotificationBean notificationBean;

    public UnidadeSaude salvar(UnidadeSaude novaUnidadeSaude) {
        if (this.hasConflictFaixaCep(novaUnidadeSaude)) {
            String error = "Já existe uma unidade de saúde cadastrada para o mesmo intervalo de ceps.";
            notificationBean.addMessage(FacesMessage.SEVERITY_ERROR, error, "");
            return null;
        }
        UnidadeSaude newUnidade = unidadeSaudeRepository.create(novaUnidadeSaude);
        if (Objects.nonNull(newUnidade)) {
            String sucess = "Unidade de saúde cadastrada com sucesso!";
            notificationBean.addMessage(FacesMessage.SEVERITY_INFO, sucess, "");
        }
        return newUnidade;
    }

    public List<UnidadeSaude> findAll() {
        return new ArrayList<UnidadeSaude>();
    }

    private boolean hasConflictFaixaCep(UnidadeSaude novaUnidadeSaude) {
        return unidadeSaudeRepository.existsConflictFaixaCep(novaUnidadeSaude);
    }

    public UnidadeSaude findByCep(String cep) {
        UnidadeSaude foundedUnidadeSaude = unidadeSaudeRepository.findByCEP(stringToInt(cep));
        if (Objects.isNull(foundedUnidadeSaude)) {
            String notFounded = "Nenhuma unidade de saúde encontrada nessa faixa de CEP";
            notificationBean.addMessage(FacesMessage.SEVERITY_WARN, notFounded, "");
        }
        return unidadeSaudeRepository.findByCEP(stringToInt(cep));
    }

}
