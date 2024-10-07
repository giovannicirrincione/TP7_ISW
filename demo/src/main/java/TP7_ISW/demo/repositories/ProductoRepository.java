package TP7_ISW.demo.repositories;

import TP7_ISW.demo.entities.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductoRepository extends JpaRepository<Producto,Long> {
    @Query(
            value = "SELECT * FROM producto WHERE nombre LIKE %:nombre%",
            nativeQuery = true
    )
    List<Producto> busquedaPorNombre(@Param("nombre") String nombre);
}