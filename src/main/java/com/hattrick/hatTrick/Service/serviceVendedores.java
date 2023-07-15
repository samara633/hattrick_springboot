package com.hattrick.hatTrick.Service;
import com.hattrick.hatTrick.Entity.Vendedores;
import com.hattrick.hatTrick.Repository.vendedoresRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class serviceVendedores implements vendedoresService{
    @Autowired
    private vendedoresRepo repo;
    @Override
    public List<Vendedores> ConsultarVendedores(){
        return (List<Vendedores>) this.repo.findAll();
    }
    @Override
    public Vendedores CrearVendedores(Vendedores vendedores){
        vendedores.setId_vendedor(vendedores.getId_vendedor());
        return this.repo.save(vendedores);
    }
    @Override
    public Vendedores ModificarVendedores(Vendedores vendedores){
        return this.repo.save(vendedores);
    }
    @Override
    public Vendedores BuscarVendedores(int id){
        return  this.repo.findById(id).get();
    }
    @Override
    public void EliminarVendedores(int id){
        this.repo.deleteById(id);
    }

}
