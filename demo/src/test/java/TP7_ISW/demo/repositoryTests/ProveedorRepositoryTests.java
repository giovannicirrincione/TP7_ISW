package TP7_ISW.demo.repositoryTests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import TP7_ISW.demo.entities.Proveedor;
import TP7_ISW.demo.repositories.ProveedorRepository;
import jakarta.persistence.EntityManager;

// Tercer Test Emi
@DataJpaTest
public class ProveedorRepositoryTests {
    @Autowired
    private EntityManager entityManager;
    @Autowired
    private ProveedorRepository proveedorRepository;
    
    @Test
    void searchByName() throws Exception {
        Proveedor proveedor = new Proveedor();
        proveedor.setName("Vanpass");

        List<Proveedor> listaEnviada = new ArrayList<>();
        listaEnviada.add(proveedor);

        entityManager.persist(proveedor);
        entityManager.flush();

        assertEquals(listaEnviada, proveedorRepository.searchByName("Vanpass"));
    }
}
