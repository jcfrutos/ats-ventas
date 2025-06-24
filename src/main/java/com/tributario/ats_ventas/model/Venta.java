package com.tributario.ats_ventas.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "ventas")
@AllArgsConstructor
@Getter @Setter
@NoArgsConstructor
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

}