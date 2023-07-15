package com.hattrick.hatTrick.Controller;

import com.hattrick.hatTrick.Entity.Facturas;
import com.hattrick.hatTrick.Service.serviceFacturas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("CRUDRepo")
public class facturasCont {
    @Autowired
    private serviceFacturas factSer;

    @GetMapping
    @RequestMapping(value = "consultarfacturas", method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarFacturas(){
        List<Facturas> facturasList=this.factSer.ConsultarFacturas();
        return ResponseEntity.ok(facturasList);
    }
    @PostMapping
    @RequestMapping(value = "crearfacturas", method = RequestMethod.POST)
    public ResponseEntity<?> CrearFacturas(@RequestBody Facturas facturas){
        Facturas facturasCrear=this.factSer.CrearFacturas(facturas);
        return ResponseEntity.status(HttpStatus.CREATED).body(facturasCrear);
    }

    @PutMapping
    @RequestMapping(value = "modificarfacturas", method = RequestMethod.PUT)
    public ResponseEntity<?> ModificarFacturas(@RequestBody Facturas facturas){
        Facturas facturasModificada=this.factSer.ModificarFacturas(facturas);
        return ResponseEntity.status(HttpStatus.CREATED).body(facturasModificada);
    }

    @GetMapping
    @RequestMapping(value = "buscarfacturas/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> BuscarFacturas(@PathVariable int id) {
        Facturas factura=this.factSer.BuscarFacturas(id);
        return ResponseEntity.ok(factura);
    }

    @DeleteMapping
    @RequestMapping(value = "eliminarfacturas/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> EliminarFacturas(@PathVariable int id){
        this.factSer.EliminarFacturas(id);
        return ResponseEntity.ok().build();
    }
}
