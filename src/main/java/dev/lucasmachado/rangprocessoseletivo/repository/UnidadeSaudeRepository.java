package dev.lucasmachado.rangprocessoseletivo.repository;

import dev.lucasmachado.rangprocessoseletivo.model.UnidadeSaude;
import jakarta.ejb.Stateless;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.Dependent;
import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

import javax.persistence.PersistenceContext;
import java.io.Serializable;
import java.lang.invoke.MethodHandles;
import java.util.Objects;
import java.util.logging.Logger;

@Stateless
@Dependent
public class UnidadeSaudeRepository implements Serializable {

    private static final Logger logger = Logger.getLogger(MethodHandles.lookup().lookupClass().getName());

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public UnidadeSaude create(UnidadeSaude unidadeSaude) {
        //logger.info("Creating unidadeSaude " + unidadeSaude.getNome());
        entityManager.persist(unidadeSaude);
        return unidadeSaude;
    }
    @Transactional
    public UnidadeSaude findById(Long id) {
        return entityManager.find(UnidadeSaude.class, id);
    }

    @Transactional
    public void update(UnidadeSaude unidade) {
        entityManager.merge(unidade);
    }

    public void delete(UnidadeSaude unidade) {
        entityManager.remove(unidade);
    }

    public boolean existsConflictFaixaCep(UnidadeSaude novaUnidade) {
        Query query = entityManager.createQuery("SELECT COUNT(u) FROM UnidadeSaude u " +
                "WHERE (:faixaInicio BETWEEN u.faixaCepInicio AND u.faixaCepFinal) OR " +
                "(:faixaFinal BETWEEN u.faixaCepInicio AND u.faixaCepFinal) OR " +
                "(:faixaInicio <= u.faixaCepInicio AND :faixaFinal >= u.faixaCepFinal)");
        query.setParameter("faixaInicio", novaUnidade.getFaixaCepInicio());
        query.setParameter("faixaFinal", novaUnidade.getFaixaCepFinal());
        Long count = (Long) query.getSingleResult();
        return count > 0;
    }

    @Transactional
    public UnidadeSaude findByCEP(Integer cep) {
        Query query = entityManager.createQuery("SELECT u.cnes,u.nome,u.faixaCepInicio,u.faixaCepFinal FROM UnidadeSaude u " +
                "WHERE (:faixaInicio BETWEEN u.faixaCepInicio AND u.faixaCepFinal) OR " +
                "(:faixaFinal BETWEEN u.faixaCepInicio AND u.faixaCepFinal) OR " +
                "(:faixaInicio <= u.faixaCepInicio AND :faixaFinal >= u.faixaCepFinal)");
        query.setParameter("faixaInicio", cep);
        query.setParameter("faixaFinal", cep);

        return unidadeSaudeQueryConverter(query.getResultList().stream().findFirst().orElse(null));
    }

    private UnidadeSaude unidadeSaudeQueryConverter(Object toConvert) {
        if(Objects.isNull(toConvert)) { return null; }
        Object[] resultado = (Object[]) toConvert;
        return new UnidadeSaude(null, resultado[0].toString(), resultado[1].toString(),(Integer) resultado[2], (Integer) resultado[3]);
    }

}
