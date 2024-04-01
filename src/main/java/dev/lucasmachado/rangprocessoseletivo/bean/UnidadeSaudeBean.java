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

    public void viewUnidade() {
    }

    private List<UnidadeSaude> unidades;
    private UnidadeSaude unidadeSaude = new UnidadeSaude();
    private UnidadeSaude selectedUnidade;
    private String foundedUnidadeSaudeByCep;

    public UnidadeSaude getSelectedUnidade() {
        return selectedUnidade;
    }

    public void setSelectedUnidade(UnidadeSaude selectedUnidade) {
        this.selectedUnidade = selectedUnidade;
    }

    public void setUnidades(List<UnidadeSaude> unidades) {
        this.unidades = unidades;
    }

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

    public String getFoundedUnidadeSaudeByCep() {
        return foundedUnidadeSaudeByCep;
    }

    public void setFoundedUnidadeSaudeByCep(String foundedUnidadeSaudeByCep) {
        this.foundedUnidadeSaudeByCep = foundedUnidadeSaudeByCep;
    }

    public void salvarUnidadeSaude() {
        unidadeSaudeService.salvar(this.unidadeSaude);
    }

    public void findByCep() {
        UnidadeSaude foundedByCep = unidadeSaudeService.findByCep(this.cep);
        foundedUnidadeSaudeByCep = Objects.nonNull(foundedByCep) ? foundedByCep.toString() : null;
    }

}
