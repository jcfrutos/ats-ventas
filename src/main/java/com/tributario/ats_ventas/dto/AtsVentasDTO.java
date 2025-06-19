package com.tributario.ats_ventas.dto;

import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class AtsVentasDTO {
    private String tipoIdentificacionCliente;
    private String noIdentificacionCliente;
    private String parteRelacionada;
    private String tipoCliente;
    private String razonSocialCliente;
    private String codigoTipoComprobante;
    private String tipoEmision;
    private String noSerieComprobanteVentaEstablecimiento;
    private String noSerieComprobanteVentaPuntoEmision;
    private String noSecuencialComprobanteVenta;
    private BigDecimal baseImponibleNoObjetoIva;
    private BigDecimal baseImponibleTarifa0;
    private BigDecimal baseImponibleTarifaIvaDiferente0;
    private BigDecimal montoIva;
    private String tipoCompensaciones;
    private BigDecimal montoCompensaciones;
    private BigDecimal montoIce;
    private BigDecimal valorIvaRetenido;
    private BigDecimal valorRentaRetenido;
    private String formaCobro;
    private String codigoEstablecimiento;
    private BigDecimal ventasGeneradasEstablecimiento;
    private BigDecimal ivaCompensadoEstablecimientoVentasLeySolidaridad;
    private String usuario;
    private LocalDate fecha;
    private String descripcion;
    private String detalle;
    private String ccostos;
    private String ibeneficiario;
    private String cuentaIvaBase;
    private String cuentaIngresoBase;
    private String formularioBaseImponible15;
    private String cuentaIva;
    private String cuentaIngreso;
    private String sistema;
    private String sistemaTipoDocumento;
}

