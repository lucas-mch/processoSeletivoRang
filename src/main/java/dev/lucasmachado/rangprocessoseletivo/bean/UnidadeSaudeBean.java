package dev.lucasmachado.rangprocessoseletivo.bean;

import dev.lucasmachado.rangprocessoseletivo.model.UnidadeSaude;
import dev.lucasmachado.rangprocessoseletivo.service.UnidadeSaudeService;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.util.ArrayList;
import java.util.List;

@Named
@RequestScoped
public class UnidadeSaudeBean {

    @Inject
    private UnidadeSaudeService unidadeSaudeService;

    private List<UnidadeSaude> unidades;
    private UnidadeSaude unidadeSaude = new UnidadeSaude();
    private UnidadeSaude selectedUnidade;
    public UnidadeSaude getSelectedUnidade() {
        return selectedUnidade;
    }
    public void setSelectedUnidade(UnidadeSaude selectedUnidade) {
        this.selectedUnidade = selectedUnidade;
    }

    public void setUnidades(List<UnidadeSaude> unidades) {
        this.unidades = unidades;
    }

    public void deleteUnidade() {
        unidades.remove(selectedUnidade);
        selectedUnidade = null;
    }

    public void viewUnidade() {
    }

    public UnidadeSaude getUnidadeSaude() {
        return unidadeSaude;
    }

    public void setUnidadeSaude(UnidadeSaude unidadeSaude) {
        this.unidadeSaude = unidadeSaude;
    }
    public void salvarUnidadeSaude() {
        unidadeSaudeService.salvar(this.unidadeSaude);
    }

    public void findAll() {
        unidadeSaudeService.findAll();
    }
}
