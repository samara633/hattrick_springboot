package com.hattrick.hatTrick.Service;

import com.hattrick.hatTrick.Entity.Productos;

import java.util.List;

public interface productosService {
    public List<Productos  > ConsultarProductos();
    public Productos CrearProductos(Productos productos);
    public Productos ModificarProductos(Productos productos);
    public Productos BuscarProductos(int id);
    public void EliminarProductos(int id);
}
