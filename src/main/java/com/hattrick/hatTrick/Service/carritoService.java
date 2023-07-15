package com.hattrick.hatTrick.Service;

import com.hattrick.hatTrick.Entity.Carrito;

import java.util.List;


public interface carritoService {
    public List<Carrito> ConsultarCarrito();
    public Carrito CrearCarrito(Carrito carrito_compras);
    public Carrito ModificarCarrito(Carrito carrito_compras);
    public Carrito BuscarCarrito(int id);
    public void EliminarCarrito(int id);
}
