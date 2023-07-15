package com.hattrick.hatTrick.Service;

import com.hattrick.hatTrick.Entity.Carrito;
import com.hattrick.hatTrick.Repository.carritoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class serviceCarrito implements carritoService{
    @Autowired
    private carritoRepo car;

    @Override
    public List<Carrito> ConsultarCarrito(){
        return (List<Carrito>) this.car.findAll();
    }

    @Override
    public Carrito CrearCarrito(Carrito carrito_compras){
        carrito_compras.setIdcarrito_compras(carrito_compras.getIdcarrito_compras());
        return this.car.save(carrito_compras);
    }
    @Override
    public Carrito ModificarCarrito(Carrito carrito_compras) {
        return this.car.save(carrito_compras);
    }
    @Override
    public Carrito BuscarCarrito(int id){
        return this.car.findById(id).get();
    }
    @Override
    public void EliminarCarrito(int id){
        this.car.deleteById(id);
    }
}
