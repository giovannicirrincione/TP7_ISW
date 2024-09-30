package TP7_ISW.demo.services;

import TP7_ISW.demo.entities.Producto;

import java.util.List;

public interface ProductoService {
    List<Producto> busquedaPorNombre(String nombre) throws Exception;
}
