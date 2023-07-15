package com.hattrick.hatTrick.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "vendedores")
public class Vendedores {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_vendedor")
    private int id_vendedor;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;

    @Column(name = "empresa_idempresa")
    private String empresa_idempresa;

    public int getId_vendedor() {
        return id_vendedor;
    }

    public void setId_vendedor(int id_vendedor) {
        this.id_vendedor = id_vendedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmpresa_idempresa() {
        return empresa_idempresa;
    }

    public void setEmpresa_idempresa(String empresa_idempresa) {
        this.empresa_idempresa = empresa_idempresa;
    }
}
