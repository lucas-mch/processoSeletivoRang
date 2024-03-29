package dev.lucasmachado.rangprocessoseletivo.repository;

import dev.lucasmachado.rangprocessoseletivo.model.UnidadeSaude;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

import javax.persistence.PersistenceContext;
import java.io.Serializable;
import java.lang.invoke.MethodHandles;
import java.util.logging.Logger;

@Stateless
public class UnidadeSaudeRepository implements Serializable {

    private static final Logger logger = Logger.getLogger(MethodHandles.lookup().lookupClass().getName());

    @PersistenceContext
    private EntityManager entityManager;

    public UnidadeSaude create(UnidadeSaude unidadeSaude) {
        logger.info("Creating unidadeSaude " + unidadeSaude.getNome());
        entityManager.persist(unidadeSaude);
        return unidadeSaude;
    }
    @Transactional
    public UnidadeSaude buscarPorId(Long id) {
        return entityManager.find(UnidadeSaude.class, id);
    }

    @Transactional
    public void atualizar(UnidadeSaude unidade) {
        entityManager.merge(unidade);
    }

    public void deletar(UnidadeSaude unidade) {
        entityManager.remove(unidade);
    }

}
