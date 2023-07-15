package com.hattrick.hatTrick.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "productos")
public class Productos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private int id_producto;
    @Column(name = "talla")
    private String talla;
    @Column(name = "precio")
    private int precio;
    @Column(name = "nombre_producto")
    private String nombre_producto;
    @Column(name = "carrito_compras_idcarrito_compras")
    private int carrito_compras_idcarrito_compras;
    @Column(name = "producto_disponible")
    private int producto_disponible;
    @Column(name = "imagen")
    private String imagen;
    @Column(name = "usuarios_id_usuario")
    private int usuarios_id_usuario;
    @Column(name = "usuarios_vendedor_idvendedor")
    private int usuarios_vendedor_idvendedor;
    @Column(name = "vendedores_id_vendedor")
    private int vendedores_id_vendedor;
    @Column(name = "vendedores_empresa_idempresa")
    private int vendedores_empresa_idempresa;
    @Column(name = "descripcion_producto")
    private String descripcion_producto;

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public int getCarrito_compras_idcarrito_compras() {
        return carrito_compras_idcarrito_compras;
    }

    public void setCarrito_compras_idcarrito_compras(int carrito_compras_idcarrito_compras) {
        this.carrito_compras_idcarrito_compras = carrito_compras_idcarrito_compras;
    }

    public int getProducto_disponible() {
        return producto_disponible;
    }

    public void setProducto_disponible(int producto_disponible) {
        this.producto_disponible = producto_disponible;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public int getUsuarios_id_usuario() {
        return usuarios_id_usuario;
    }

    public void setUsuarios_id_usuario(int usuarios_id_usuario) {
        this.usuarios_id_usuario = usuarios_id_usuario;
    }

    public int getUsuarios_vendedor_idvendedor() {
        return usuarios_vendedor_idvendedor;
    }

    public void setUsuarios_vendedor_idvendedor(int usuarios_vendedor_idvendedor) {
        this.usuarios_vendedor_idvendedor = usuarios_vendedor_idvendedor;
    }

    public int getVendedores_id_vendedor() {
        return vendedores_id_vendedor;
    }

    public void setVendedores_id_vendedor(int vendedores_id_vendedor) {
        this.vendedores_id_vendedor = vendedores_id_vendedor;
    }

    public int getVendedores_empresa_idempresa() {
        return vendedores_empresa_idempresa;
    }

    public void setVendedores_empresa_idempresa(int vendedores_empresa_idempresa) {
        this.vendedores_empresa_idempresa = vendedores_empresa_idempresa;
    }

    public String getDescripcion_producto() {
        return descripcion_producto;
    }

    public void setDescripcion_producto(String descripcion_producto) {
        this.descripcion_producto = descripcion_producto;
    }
}
