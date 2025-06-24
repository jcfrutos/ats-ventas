package com.tributario.ats_ventas.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "anexo_venta")
@Getter
@Setter
public class AtsVentas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tipo_identificacion_cliente", length = 2)
    private String tipoIdentificacionCliente;

    @Column(name = "no_identificacion_cliente", length = 13)
    private String noIdentificacionCliente;

    @Column(name = "parte_relacionada", length = 2)
    private String parteRelacionada;

    @Column(name = "tipo_cliente", length = 2)
    private String tipoCliente;

    @Column(name = "razon_social_cliente", length = 500)
    private String razonSocialCliente;

    @Column(name = "codigo_tipo_comprobante", length = 3)
    private String codigoTipoComprobante;

    @Column(name = "tipo_emision", length = 1)
    private String tipoEmision;

    @Column(name = "no_serie_comprobante_venta_establecimiento", length = 3)
    private String noSerieComprobanteVentaEstablecimiento;

    @Column(name = "no_serie_comprobante_venta_punto_emision", length = 3)
    private String noSerieComprobanteVentaPuntoEmision;

    @Column(name = "no_secuencial_comprobante_venta", length = 9)
    private String noSecuencialComprobanteVenta;

    @Column(name = "base_imponible_no_objeto_iva", precision = 14, scale = 2)
    private BigDecimal baseImponibleNoObjetoIva;

    @Column(name = "base_imponible_tarifa_0", precision = 14, scale = 2)
    private BigDecimal baseImponibleTarifa0;

    @Column(name = "base_imponible_tarifa_iva_diferente_0", precision = 14, scale = 2)
    private BigDecimal baseImponibleTarifaIvaDiferente0;

    @Column(name = "monto_iva", precision = 14, scale = 2)
    private BigDecimal montoIva;

    @Column(name = "tipo_compensaciones", length = 2)
    private String tipoCompensaciones;

    @Column(name = "monto_compensaciones", precision = 14, scale = 2)
    private BigDecimal montoCompensaciones;

    @Column(name = "monto_ice", precision = 14, scale = 2)
    private BigDecimal montoIce;

    @Column(name = "valor_iva_retenido", precision = 14, scale = 2)
    private BigDecimal valorIvaRetenido;

    @Column(name = "valor_renta_retenido", precision = 14, scale = 2)
    private BigDecimal valorRentaRetenido;

    @Column(name = "forma_cobro", length = 2)
    private String formaCobro;

    @Column(name = "codigo_establecimiento", length = 3)
    private String codigoEstablecimiento;

    @Column(name = "ventas_generadas_establecimiento", precision = 14, scale = 2)
    private BigDecimal ventasGeneradasEstablecimiento;

    @Column(name = "iva_compensado_establecimiento_ventas_ley_solidaridad", precision = 14, scale = 2)
    private BigDecimal ivaCompensadoEstablecimientoVentasLeySolidaridad;

    @Column(name = "usuario", length = 50)
    private String usuario;

    @Column(name = "fecha")
    private LocalDate fecha;

    @Column(name = "descripcion", length = 50)
    private String descripcion;

    @Column(name = "detalle", length = 50)
    private String detalle;

    @Column(name = "ccostos", length = 50)
    private String ccostos;

    @Column(name = "ibeneficiario", length = 50)
    private String ibeneficiario;

    @Column(name = "cuenta_iva_base", length = 50)
    private String cuentaIvaBase;

    @Column(name = "cuenta_ingreso_base", length = 50)
    private String cuentaIngresoBase;

    @Column(name = "formulario_base_imponible_15", length = 50)
    private String formularioBaseImponible15;

    @Column(name = "cuenta_iva", length = 50)
    private String cuentaIva;

    @Column(name = "cuenta_ingreso", length = 50)
    private String cuentaIngreso;

    @Column(name = "sistema", length = 1)
    private String sistema;

    @Column(name = "sistema_tipo_documento", length = 3)
    private String sistemaTipoDocumento;
}