package dev.lucasmachado.rangprocessoseletivo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "unidades")
public class UnidadeSaude {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cnes;

    private String nome;

    private Integer faixaCepInicio;

    private Integer faixaCepFinal;

    private Integer rowKey;

    public UnidadeSaude() {
    }

    public UnidadeSaude(Long id, String cnes, String nome, Integer faixaCepInicio, Integer faixaCepFinal, Integer rowKey) {
        this.id = id;
        this.cnes = cnes;
        this.nome = nome;
        this.faixaCepInicio = faixaCepInicio;
        this.faixaCepFinal = faixaCepFinal;
        this.rowKey = rowKey;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCnes() {
        return cnes;
    }

    public void setCnes(String cnes) {
        this.cnes = cnes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getFaixaCepInicio() {
        return faixaCepInicio;
    }

    public void setFaixaCepInicio(Integer faixaCepInicio) {
        this.faixaCepInicio = faixaCepInicio;
    }

    public Integer getFaixaCepFinal() {
        return faixaCepFinal;
    }

    public void setFaixaCepFinal(Integer faixaCepFinal) {
        this.faixaCepFinal = faixaCepFinal;
    }

    public Integer getRowKey() {
        return rowKey;
    }

    public void setRowKey(Integer rowKey) {
        this.rowKey = rowKey;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("UnidadeSaude{");
        sb.append("id=").append(id);
        sb.append(", cnes='").append(cnes).append('\'');
        sb.append(", nome='").append(nome).append('\'');
        sb.append(", faixaCepInicio=").append(faixaCepInicio);
        sb.append(", faixaCepFinal=").append(faixaCepFinal);
        sb.append('}');
        return sb.toString();
    }
}