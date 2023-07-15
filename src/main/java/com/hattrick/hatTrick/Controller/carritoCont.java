package com.hattrick.hatTrick.Controller;

import com.hattrick.hatTrick.Entity.Carrito;
import com.hattrick.hatTrick.Service.serviceCarrito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("CRUDRepo")
public class carritoCont {

    @Autowired
    private serviceCarrito carSer;

    @GetMapping
    @RequestMapping(value = "consultarcarrito", method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarCarrito(){
        List<Carrito> carritoList=this.carSer.ConsultarCarrito();
        return ResponseEntity.ok(carritoList);
    }
    @PostMapping
    @RequestMapping(value = "crearcarrito", method = RequestMethod.POST)
    public ResponseEntity<?> CrearCarrito(@RequestBody Carrito carrito_compras){
        Carrito carritoCrear=this.carSer.CrearCarrito(carrito_compras);
        return ResponseEntity.status(HttpStatus.CREATED).body(carritoCrear);
    }

    @PutMapping
    @RequestMapping(value = "modificarcarrito", method = RequestMethod.PUT)
    public ResponseEntity<?> ModificarCarrito(@RequestBody Carrito carrito_compras){
        Carrito carritoModificada=this.carSer.ModificarCarrito(carrito_compras);
        return ResponseEntity.status(HttpStatus.CREATED).body(carritoModificada);
    }

    @GetMapping
    @RequestMapping(value = "buscarcarrito/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> BuscarCarrito(@PathVariable int id) {
        Carrito carrito=this.carSer.BuscarCarrito(id);
        return ResponseEntity.ok(carrito);
    }

    @DeleteMapping
    @RequestMapping(value = "eliminarcarrito/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> EliminarCarrito(@PathVariable int id){
        this.carSer.EliminarCarrito(id);
        return ResponseEntity.ok().build();
    }
}
