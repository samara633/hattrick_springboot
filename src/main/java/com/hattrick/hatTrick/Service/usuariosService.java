package com.hattrick.hatTrick.Service;

import com.hattrick.hatTrick.Entity.Usuarios;

import java.util.List;

public interface usuariosService {
    public List<Usuarios> ConsultarUsuarios();
    public Usuarios CrearUsuarios(Usuarios usuarios);
    public Usuarios ModificarUsuarios(Usuarios usuarios);
    public Usuarios BuscarUsuarios(int id);
    public void EliminarUsuarios(int id);
}
