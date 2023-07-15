package com.hattrick.hatTrick.Service;

import com.hattrick.hatTrick.Entity.Facturas;
import com.hattrick.hatTrick.Repository.facturasRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class serviceFacturas implements facturasService{
    @Autowired
    private facturasRepo fact;

    @Override
    public List<Facturas> ConsultarFacturas(){
        return (List<Facturas>) this.fact.findAll();
    }

    @Override
    public Facturas CrearFacturas(Facturas facturas){
        facturas.setId_factura(facturas.getId_factura());
        return this.fact.save(facturas);
    }
    @Override
    public Facturas ModificarFacturas(Facturas facturas) {
        return this.fact.save(facturas);
    }
    @Override
    public Facturas BuscarFacturas(int id){
        return this.fact.findById(id).get();
    }
    @Override
    public void EliminarFacturas(int id){
        this.fact.deleteById(id);
    }
}
