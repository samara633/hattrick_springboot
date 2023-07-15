package com.hattrick.hatTrick.Service;

import com.hattrick.hatTrick.Entity.Usuarios;
import com.hattrick.hatTrick.Repository.usuariosRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class serviceUsuarios implements usuariosService{
    @Autowired
    private usuariosRepo repo;

    @Override
    public List<Usuarios> ConsultarUsuarios(){
        return (List<Usuarios>) this.repo.findAll();
    }

    @Override
    public Usuarios CrearUsuarios(Usuarios usuarios){
        usuarios.setId_usuario(usuarios.getId_usuario());
        return this.repo.save(usuarios);
    }
    @Override
    public Usuarios ModificarUsuarios(Usuarios usuario) {
        return this.repo.save(usuario);
    }
    @Override
    public Usuarios BuscarUsuarios(int id){
        return this.repo.findById(id).get();
    }
    @Override
    public void EliminarUsuarios(int id){
        this.repo.deleteById(id);
    }
}
