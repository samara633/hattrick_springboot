package com.hattrick.hatTrick.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "carrito_compras")
public class Carrito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcarrito_compras")
    private int idcarrito_compras;
    @Column(name = "total_pagar")
    private String total_pagar;
    @Column(name = "cantidad")
    private int cantidad;
    @Column(name = "metodos_pagos_id_metodo_pago")
    private int metodos_pagos_id_metodo_pago;

    public int getIdcarrito_compras() {
        return idcarrito_compras;
    }

    public void setIdcarrito_compras(int idcarrito_compras) {
        this.idcarrito_compras = idcarrito_compras;
    }

    public String getTotal_pagar() {
        return total_pagar;
    }

    public void setTotal_pagar(String total_pagar) {
        this.total_pagar = total_pagar;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getMetodos_pagos_id_metodo_pago() {
        return metodos_pagos_id_metodo_pago;
    }

    public void setMetodos_pagos_id_metodo_pago(int metodos_pagos_id_metodo_pago) {
        this.metodos_pagos_id_metodo_pago = metodos_pagos_id_metodo_pago;
    }
}
