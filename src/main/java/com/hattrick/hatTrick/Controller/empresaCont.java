package com.hattrick.hatTrick.Controller;

import com.hattrick.hatTrick.Entity.Empresa;
import com.hattrick.hatTrick.Service.serviceEmpresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("CRUDRepo")
public class empresaCont {
    @Autowired
    private serviceEmpresa sEmpresa;
    @GetMapping
    @RequestMapping(value = "consultarempresa", method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarEmpresa(){
        List<Empresa> empresaList = this.sEmpresa.ConsultarEmpresa();
        return ResponseEntity.ok(empresaList);
    }
  @PostMapping
  @RequestMapping(value = "crearempresa", method = RequestMethod.POST)
  public ResponseEntity<?> CrearEmpresa(@RequestBody Empresa empresa){
        Empresa empresaCreada = this.sEmpresa.CrearEmpresa(empresa);
        return ResponseEntity.status(HttpStatus.CREATED).body(empresaCreada);
  }
    @PutMapping
    @RequestMapping(value = "modificarempresa", method = RequestMethod.PUT)
    public ResponseEntity<?> ModificarEmpresa(@RequestBody Empresa empresa){
        Empresa  empresaModificada = this.sEmpresa.ModificarEmpresa(empresa);
        return ResponseEntity.status(HttpStatus.CREATED).body(empresaModificada);
    }
    @GetMapping
    @RequestMapping(value = "buscarempresa/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> BuscarEmpresa(@PathVariable int id){
        Empresa empresa = this.sEmpresa.BuscarEmpresa(id);
        return  ResponseEntity.ok(empresa);
    }
    @DeleteMapping
    @RequestMapping(value = "eliminarempresa/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> EliminarEmpresa(@PathVariable int  id){
        this.sEmpresa.EliminarEmpresa(id);
        return  ResponseEntity.ok().build();
    }


}
