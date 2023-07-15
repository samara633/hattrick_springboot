package com.hattrick.hatTrick.Service;
import com.hattrick.hatTrick.Entity.Empresa;
import com.hattrick.hatTrick.Repository.empresaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class serviceEmpresa implements empresaService{
    @Autowired
    private empresaRepo repo;
    @Override
    public List<Empresa> ConsultarEmpresa(){
        return (List<Empresa>) this.repo.findAll();
    }
    @Override
    public Empresa CrearEmpresa(Empresa empresa){
       empresa.setId_empresa(empresa.getId_empresa());
       return this.repo.save(empresa);
    }
    @Override
    public Empresa ModificarEmpresa(Empresa empresa){
        return this.repo.save(empresa);
    }
    @Override
    public Empresa BuscarEmpresa(int id){
        return  this.repo.findById(id).get();
    }
    @Override
    public void EliminarEmpresa(int id){
        this.repo.deleteById(id);
    }


}
