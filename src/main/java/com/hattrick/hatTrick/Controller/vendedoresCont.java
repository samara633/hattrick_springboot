package com.hattrick.hatTrick.Controller;
import com.hattrick.hatTrick.Entity.Vendedores;
import com.hattrick.hatTrick.Service.serviceVendedores;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("CRUDRepo")
public class vendedoresCont {
    @Autowired
    private serviceVendedores sVendedores;
    @GetMapping
    @RequestMapping(value = "consultarvendedores", method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarVendedores(){
        List<Vendedores> vendedores = this.sVendedores.ConsultarVendedores();
        return ResponseEntity.ok(vendedores);
    }
    @PostMapping
    @RequestMapping(value = "crearvendedores", method = RequestMethod.POST)
    public ResponseEntity<?> CrearVendedores(@RequestBody Vendedores vendedores){
        Vendedores vendedoresCreada = this.sVendedores.CrearVendedores(vendedores);
        return ResponseEntity.status(HttpStatus.CREATED).body( vendedoresCreada);
    }
    @PutMapping
    @RequestMapping(value = "modificarvendedores", method = RequestMethod.PUT)
    public ResponseEntity<?> ModificarVendedores(@RequestBody Vendedores vendedores){
        Vendedores  vendedoresModificada = this.sVendedores.ModificarVendedores(vendedores);
        return ResponseEntity.status(HttpStatus.CREATED).body(vendedoresModificada);
    }
    @GetMapping
    @RequestMapping(value = "buscarvendedores/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> BuscarVendedores(@PathVariable int id){
        Vendedores vendedores = this.sVendedores.BuscarVendedores(id);
        return  ResponseEntity.ok(vendedores);
    }
    @DeleteMapping
    @RequestMapping(value = "eliminarvendedores/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> EliminarVendedores(@PathVariable int  id){
        this.sVendedores.EliminarVendedores(id);
        return  ResponseEntity.ok().build();
    }
}
