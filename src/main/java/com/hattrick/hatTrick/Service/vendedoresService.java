package com.hattrick.hatTrick.Service;
import com.hattrick.hatTrick.Entity.Vendedores;
import java.util.List;

public interface vendedoresService {
    public List<Vendedores> ConsultarVendedores();
    public Vendedores CrearVendedores(Vendedores vendedores);
    public Vendedores ModificarVendedores(Vendedores vendedores);
    public Vendedores BuscarVendedores(int id);
    public void EliminarVendedores(int id);
}
