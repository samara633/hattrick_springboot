package com.hattrick.hatTrick.Service;

import com.hattrick.hatTrick.Entity.Pagos;

import java.util.List;

public interface pagosService {
    public List<Pagos> ConsultarPagos();
    public Pagos CrearPagos(Pagos metodos_pagos);
    public Pagos ModificarPagos(Pagos metodos_pagos);
    public Pagos BuscarPagos(int id);
    public void EliminarPagos(int id);
}
