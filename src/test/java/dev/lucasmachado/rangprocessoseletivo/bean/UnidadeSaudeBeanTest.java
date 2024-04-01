package dev.lucasmachado.rangprocessoseletivo.bean;

import dev.lucasmachado.rangprocessoseletivo.model.UnidadeSaude;
import dev.lucasmachado.rangprocessoseletivo.repository.UnidadeSaudeRepository;
import dev.lucasmachado.rangprocessoseletivo.service.UnidadeSaudeService;
import jakarta.inject.Inject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


public class UnidadeSaudeBeanTest {

    @InjectMocks
    private UnidadeSaudeBean unidadeSaudeBean;
    @Mock
    private UnidadeSaudeService unidadeSaudeService;
    @InjectMocks
    private List<UnidadeSaude> unidades = new ArrayList<>();
    @Mock
    private UnidadeSaudeRepository unidadeSaudeRepository;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }
    @Test
    public void testSalvarUnidadeSaude() {
        UnidadeSaude unidadeSaude = new UnidadeSaude();
        unidadeSaudeBean.setUnidadeSaude(unidadeSaude);
        when(unidadeSaudeRepository.create(any())).thenReturn(new UnidadeSaude());
    }

    @Test
    public void testFindByCep() {
        String cep = "12345678";
        UnidadeSaude foundedByCep = new UnidadeSaude();
        when(unidadeSaudeService.findByCep(cep)).thenReturn(foundedByCep);

        unidadeSaudeBean.setCep(cep);
        unidadeSaudeBean.findByCep();

        assertEquals(foundedByCep.toString(), unidadeSaudeBean.getFoundedUnidadeSaudeByCep());
    }

}