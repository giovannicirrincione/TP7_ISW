package TP7_ISW.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import TP7_ISW.demo.entities.Proveedor;

@Repository
public interface ProveedorRepository extends JpaRepository<Proveedor, Long> {
    @Query(
        value = "SELECT * FROM proveedor WHERE name LIKE %:name%",
        nativeQuery = true
    )
    List<Proveedor> searchByName(@Param("name") String name);
}
