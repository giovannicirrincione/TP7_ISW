package TP7_ISW.demo.servicesTests;

import TP7_ISW.demo.entities.Producto;
import TP7_ISW.demo.repositories.ProductoRepository;
import TP7_ISW.demo.services.ProductoServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class ProductoServiceTests {
    @MockBean
    private ProductoRepository productoRepository;
    @Autowired
    private ProductoServiceImpl productoService;

    @Test
    void testBusquedaPorNombre() throws Exception {
        Producto producto = new Producto();
        producto.setNombre("camiseta");


        List<Producto> listaEnviada = new ArrayList<>();
        listaEnviada.add(producto);


        //Simula el metodo del repository devolviendo "camiseta"
        when(productoRepository.busquedaPorNombre("camiseta")).thenReturn(listaEnviada);

        assertEquals(listaEnviada,productoService.busquedaPorNombre("camiseta"));

    }
}
