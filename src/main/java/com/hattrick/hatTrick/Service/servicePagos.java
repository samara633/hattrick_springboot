package com.hattrick.hatTrick.Service;

import com.hattrick.hatTrick.Entity.Pagos;
import com.hattrick.hatTrick.Repository.pagosRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class servicePagos implements pagosService{
    @Autowired
    private pagosRepo pago;

    @Override
    public List<Pagos> ConsultarPagos(){
        return (List<Pagos>) this.pago.findAll();
    }

    @Override
    public Pagos CrearPagos(Pagos metodos_pagos){
        metodos_pagos.setId_metodo_pago(metodos_pagos.getId_metodo_pago());
        return this.pago.save(metodos_pagos);
    }
    @Override
    public Pagos ModificarPagos(Pagos metodos_pagos) {
        return this.pago.save(metodos_pagos);
    }
    @Override
    public Pagos BuscarPagos(int id){
        return this.pago.findById(id).get();
    }
    @Override
    public void EliminarPagos(int id){
        this.pago.deleteById(id);
    }

}
