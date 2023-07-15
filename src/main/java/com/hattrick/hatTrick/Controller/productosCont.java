package com.hattrick.hatTrick.Controller;

import com.hattrick.hatTrick.Entity.Productos;
import com.hattrick.hatTrick.Entity.Usuarios;
import com.hattrick.hatTrick.Service.serviceProductos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("CRUDRepo")
public class productosCont {
    @Autowired
    private serviceProductos productSer;

    @GetMapping
    @RequestMapping(value = "consultarproductos", method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarProductos(){
        List<Productos> productoList=this.productSer.ConsultarProductos();
        return ResponseEntity.ok(productoList);
    }
    @PostMapping
    @RequestMapping(value = "crearproductos", method = RequestMethod.POST)
    public ResponseEntity<?> CrearProductos(@RequestBody Productos productos){
        Productos productoCrear=this.productSer.CrearProductos(productos);
        return ResponseEntity.status(HttpStatus.CREATED).body(productoCrear);
    }
    @PutMapping
    @RequestMapping(value = "modificarproductos", method = RequestMethod.PUT)
    public ResponseEntity<?> ModificarProductos(@RequestBody Productos productos){
        Productos productosModificada=this.productSer.ModificarProductos(productos);
        return ResponseEntity.status(HttpStatus.CREATED).body(productosModificada);
    }
    @GetMapping
    @RequestMapping(value = "buscarproductos/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> BuscarProductos(@PathVariable int id) {
        Productos productos=this.productSer.BuscarProductos(id);
        return  ResponseEntity.ok(productos);
    }
    @DeleteMapping
    @RequestMapping(value = "EliminarProductos/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> EliminarProductos(@PathVariable int id){
        this.productSer.EliminarProductos(id);
        return ResponseEntity.ok().build();
    }

}
