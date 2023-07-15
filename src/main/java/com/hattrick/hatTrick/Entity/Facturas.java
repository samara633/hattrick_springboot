package com.hattrick.hatTrick.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "facturas")
public class Facturas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_factura")
    private int id_factura;
    @Column(name = "empresa_idempresa")
    private int empresa_idempresa;
    @Column(name = "carrito_compras_idcarrito_compras")
    private int carrito_compras_idcarrito_compras;
    @Column(name = "carrito_compras_metodos_pagos_id_metodo_pago")
    private int carrito_compras_metodos_pagos_id_metodo_pago;

    public int getId_factura() {
        return id_factura;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }

    public int getEmpresa_idempresa() {
        return empresa_idempresa;
    }

    public void setEmpresa_idempresa(int empresa_idempresa) {
        this.empresa_idempresa = empresa_idempresa;
    }

    public int getCarrito_compras_idcarrito_compras() {
        return carrito_compras_idcarrito_compras;
    }

    public void setCarrito_compras_idcarrito_compras(int carrito_compras_idcarrito_compras) {
        this.carrito_compras_idcarrito_compras = carrito_compras_idcarrito_compras;
    }

    public int getCarrito_compras_metodos_pagos_id_metodo_pago() {
        return carrito_compras_metodos_pagos_id_metodo_pago;
    }

    public void setCarrito_compras_metodos_pagos_id_metodo_pago(int carrito_compras_metodos_pagos_id_metodo_pago) {
        this.carrito_compras_metodos_pagos_id_metodo_pago = carrito_compras_metodos_pagos_id_metodo_pago;
    }
}
