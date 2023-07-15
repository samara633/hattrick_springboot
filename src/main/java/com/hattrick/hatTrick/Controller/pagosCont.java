package com.hattrick.hatTrick.Controller;
import com.hattrick.hatTrick.Entity.Pagos;
import com.hattrick.hatTrick.Service.servicePagos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("CRUDRepo")
public class pagosCont {
    @Autowired
    private servicePagos pagSer;

    @GetMapping
    @RequestMapping(value = "consultarpagos", method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarPagos(){
        List<Pagos> pagosList=this.pagSer.ConsultarPagos();
        return ResponseEntity.ok(pagosList);
    }
    @PostMapping
    @RequestMapping(value = "crearpagos", method = RequestMethod.POST)
    public ResponseEntity<?> CrearPagos(@RequestBody Pagos metodos_pagos){
        Pagos carritoCrear=this.pagSer.CrearPagos(metodos_pagos);
        return ResponseEntity.status(HttpStatus.CREATED).body(carritoCrear);
    }

    @PutMapping
    @RequestMapping(value = "modificarpagos", method = RequestMethod.PUT)
    public ResponseEntity<?> ModificarPagos(@RequestBody Pagos metodos_pagos){
        Pagos pagosModificada=this.pagSer.ModificarPagos(metodos_pagos);
        return ResponseEntity.status(HttpStatus.CREATED).body(pagosModificada);
    }

    @GetMapping
    @RequestMapping(value = "buscarpagos/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> BuscarPagos(@PathVariable int id) {
        Pagos carrito=this.pagSer.BuscarPagos(id);
        return ResponseEntity.ok(carrito);
    }
    @DeleteMapping
    @RequestMapping(value = "eliminarpagos/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> EliminarPagos(@PathVariable int id){
        this.pagSer.EliminarPagos(id);
        return ResponseEntity.ok().build();
    }
}
