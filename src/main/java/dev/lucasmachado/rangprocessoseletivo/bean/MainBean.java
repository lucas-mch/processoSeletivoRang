package dev.lucasmachado.rangprocessoseletivo.bean;


import dev.lucasmachado.rangprocessoseletivo.model.UnidadeSaude;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

import java.io.Serializable;

@Named
@ViewScoped
public class MainBean implements Serializable {

    private String currentNav;

    @PostConstruct
    public void init() {
        currentNav = "/pages/formUnidadeSaude.xhtml";
    }
    public MainBean() {
    }
    public void updateNav(String currentNav) {
        this.currentNav = currentNav;
    }

    public String getCurrentNav() {
        return currentNav;
    }

    public void setCurrentNav(String currentNav) {
        this.currentNav = currentNav;
    }



}