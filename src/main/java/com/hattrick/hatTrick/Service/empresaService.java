package com.hattrick.hatTrick.Service;

import com.hattrick.hatTrick.Entity.Empresa;

import java.util.List;

public interface empresaService {
    public List<Empresa> ConsultarEmpresa();
    public Empresa CrearEmpresa(Empresa empresa);
    public Empresa ModificarEmpresa(Empresa empresa);
    public Empresa BuscarEmpresa(int id);

    public void EliminarEmpresa(int id);
}
