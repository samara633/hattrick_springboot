package com.hattrick.hatTrick.Service;

import com.hattrick.hatTrick.Entity.Productos;
import com.hattrick.hatTrick.Repository.productosRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class serviceProductos implements productosService{
    @Autowired
    private productosRepo repo;

    @Override
    public List<Productos> ConsultarProductos(){
        return (List<Productos>) this.repo.findAll();
    }

    @Override
    public Productos CrearProductos(Productos productos){
        productos.setId_producto(productos.getId_producto());
        return this.repo.save(productos);
    }
    @Override
    public Productos ModificarProductos(Productos productos) {
        return this.repo.save(productos);
    }
    @Override
    public Productos BuscarProductos(int id){
        return this.repo.findById(id).get();
    }
    @Override
    public void EliminarProductos(int id){
        this.repo.deleteById(id);
    }
}
