package com.hattrick.hatTrick.Service;

import com.hattrick.hatTrick.Entity.Facturas;

import java.util.List;

public interface facturasService {
    public List<Facturas> ConsultarFacturas();
    public Facturas CrearFacturas(Facturas facturas);
    public Facturas ModificarFacturas(Facturas facturas);
    public Facturas BuscarFacturas(int id);
    public void EliminarFacturas(int id);
}
