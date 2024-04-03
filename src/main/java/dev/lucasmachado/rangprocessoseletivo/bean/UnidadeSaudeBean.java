package dev.lucasmachado.rangprocessoseletivo.bean;

import dev.lucasmachado.rangprocessoseletivo.model.UnidadeSaude;
import dev.lucasmachado.rangprocessoseletivo.service.UnidadeSaudeService;
import jakarta.enterprise.context.RequestScoped;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.component.UIInput;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static dev.lucasmachado.rangprocessoseletivo.utils.Converter.stringToInt;

@Named
@RequestScoped
public class UnidadeSaudeBean {

    @Inject
    private UnidadeSaudeService unidadeSaudeService;
    private String cep;
    private UnidadeSaude unidadeSaude = new UnidadeSaude();
    private UnidadeSaude foundedUnidadeSaudeByCep;
    private boolean isSearched = false;

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public UnidadeSaude getUnidadeSaude() {
        return unidadeSaude;
    }

    public void setUnidadeSaude(UnidadeSaude unidadeSaude) {
        this.unidadeSaude = unidadeSaude;
    }

    public UnidadeSaude getFoundedUnidadeSaudeByCep() {
        return foundedUnidadeSaudeByCep;
    }

    public void setFoundedUnidadeSaudeByCep(UnidadeSaude foundedUnidadeSaudeByCep) {
        this.foundedUnidadeSaudeByCep = foundedUnidadeSaudeByCep;
    }

    public UnidadeSaudeService getUnidadeSaudeService() {
        return unidadeSaudeService;
    }

    public void setUnidadeSaudeService(UnidadeSaudeService unidadeSaudeService) {
        this.unidadeSaudeService = unidadeSaudeService;
    }

    public boolean getIsSearched() {
        return isSearched;
    }

    public void setSearched(boolean searched) {
        isSearched = searched;
    }

    public void salvarUnidadeSaude() {
        unidadeSaudeService.salvar(this.unidadeSaude);
    }

    public void findByCep() {
        foundedUnidadeSaudeByCep = unidadeSaudeService.findByCep(this.cep);
        this.isSearched = true;
    }

}
