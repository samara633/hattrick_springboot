package com.hattrick.hatTrick.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "metodos_pagos")
public class Pagos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_metodo_pago")
    private int id_metodo_pago;
    @Column(name = "efectivo")
    private String efectivo;
    @Column(name = "pse")
    private String pse;

    public int getId_metodo_pago() {
        return id_metodo_pago;
    }

    public void setId_metodo_pago(int id_metodo_pago) {
        this.id_metodo_pago = id_metodo_pago;
    }

    public String getEfectivo() {
        return efectivo;
    }

    public void setEfectivo(String efectivo) {
        this.efectivo = efectivo;
    }

    public String getPse() {
        return pse;
    }

    public void setPse(String pse) {
        this.pse = pse;
    }
}
