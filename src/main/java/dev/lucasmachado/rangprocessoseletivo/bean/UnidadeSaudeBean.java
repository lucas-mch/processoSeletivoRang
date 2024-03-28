package dev.lucasmachado.rangprocessoseletivo.bean;

import dev.lucasmachado.rangprocessoseletivo.model.UnidadeSaude;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

import java.util.ArrayList;
import java.util.List;

@Named
@RequestScoped
public class UnidadeSaudeBean {

    private List<UnidadeSaude> unidades;

    public List<UnidadeSaude> getUnidades() {
        if (unidades == null) {
            unidades = new ArrayList<>();
            unidades.add(new UnidadeSaude(1L, "1", "Primeiro", 10000, 20000));
            unidades.add(new UnidadeSaude(2L, "2", "Segundo", 30000, 40000));
            unidades.add(new UnidadeSaude(3L, "3", "Terceiro", 40000, 50000));
            unidades.add(new UnidadeSaude(4L, "4", "Quarto", 50000, 60000));
            unidades.add(new UnidadeSaude(5L, "5", "Quinto", 60000, 70000));
            unidades.add(new UnidadeSaude(6L, "6", "Sexto", 70000, 80000));
            unidades.add(new UnidadeSaude(7L, "7", "Sétimo", 80000, 90000));
            unidades.add(new UnidadeSaude(8L, "8", "Oitavo", 90000, 100000));
            unidades.add(new UnidadeSaude(9L, "9", "Nono", 100000, 110000));
            unidades.add(new UnidadeSaude(10L, "10", "Décimo", 110000, 120000));
        }
        return unidades;
    }

    public void setUnidades(List<UnidadeSaude> unidades) {
        this.unidades = unidades;
    }

}
