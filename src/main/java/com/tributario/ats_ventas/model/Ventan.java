package com.tributario.ats_ventas.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity
public class Venta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tipo_identificacion_cliente")
    private String tipoIdentificacionCliente;

    @Column(name = "no_identificacion_cliente")
    private String noIdentificacionCliente;

    @Column(name = "razon_social_cliente")
    private String razonSocialCliente;

    @Column(name = "monto_pago")
    private Double montoPago;

    @Column(name = "fecha_pago")
    private String fechaPago;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipoIdentificacionCliente() {
        return tipoIdentificacionCliente;
    }

    public void setTipoIdentificacionCliente(String tipoIdentificacionCliente) {
        this.tipoIdentificacionCliente = tipoIdentificacionCliente;
    }

    public String getNoIdentificacionCliente() {
        return noIdentificacionCliente;
    }

    public void setNoIdentificacionCliente(String noIdentificacionCliente) {
        this.noIdentificacionCliente = noIdentificacionCliente;
    }

    public String getRazonSocialCliente() {
        return razonSocialCliente;
    }

    public void setRazonSocialCliente(String razonSocialCliente) {
        this.razonSocialCliente = razonSocialCliente;
    }

    public Double getMontoPago() {
        return montoPago;
    }

    public void setMontoPago(Double montoPago) {
        this.montoPago = montoPago;
    }

    public String getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
    }
}