package com.hattrick.hatTrick.Controller;
import com.hattrick.hatTrick.Entity.Usuarios;
import com.hattrick.hatTrick.Service.serviceUsuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("CRUDRepo")
public class usuariosCont {
    @Autowired
    private serviceUsuarios usuCtrl;

    @GetMapping
    @RequestMapping(value = "consultarusuarios", method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarUsuarios(){
        List<Usuarios> usuariosList = this.usuCtrl.ConsultarUsuarios();
        return  ResponseEntity.ok(usuariosList);
    }

    @PostMapping
    @RequestMapping(value = "crearusuarios", method = RequestMethod.POST)
    public ResponseEntity<?> CrearUsuarios(@RequestBody Usuarios usuarios){
        Usuarios usuariosCrear=this.usuCtrl.CrearUsuarios(usuarios);
        return ResponseEntity.status(HttpStatus.CREATED).body(usuariosCrear);
    }

    @PutMapping
    @RequestMapping(value = "modificarusuarios", method = RequestMethod.PUT)
    public ResponseEntity<?> ModificarUsuarios(@RequestBody Usuarios usuarios){
        Usuarios usuariosModificada=this.usuCtrl.ModificarUsuarios(usuarios);
        return ResponseEntity.status(HttpStatus.CREATED).body(usuariosModificada);
    }

    @GetMapping
    @RequestMapping(value = "BuscarUsuarios/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> BuscarUsuarios(@PathVariable int id) {
        Usuarios usuarios = this.usuCtrl.BuscarUsuarios(id);
        return  ResponseEntity.ok(usuarios);
    }

    @DeleteMapping
    @RequestMapping(value = "EliminarUsuarios/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> EliminarUsuarios(@PathVariable int id){
        this.usuCtrl.EliminarUsuarios(id);
        return ResponseEntity.ok().build();
    }

}
