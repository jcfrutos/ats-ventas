package com.tributario.ats_ventas.service;

import com.ats_ventas.service.DashboardService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.beans.factory.annotation.Autowired;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;
import java.util.Map;

@Service
public class DashboardServiceImpl implements DashboardService {

    @Autowired
    private EntityManager entityManager;

    @Override
    public void cargarArchivo(MultipartFile archivo, String anexo, int mes, int anio, String tipoCarga) {
        // Aquí debes implementar la lógica para procesar el archivo Excel y guardar los datos en la base de datos.
        // Puedes usar Apache POI para leer el Excel y mapearlo a tu entidad TransaccionVenta.
    }

    @Override
    public List<Map<String, Object>> obtenerResumenBases(Integer anio, Integer mes) {
        String sql = "SELECT sistema_tipo_documento AS ats, codigo_tipo_comprobante AS tipo_documento, " +
                "SUM(base_imponible_no_objeto_iva) AS base_no_objeto_iva, " +
                "SUM(base_imponible_tarifa_0) AS base_tarifa_0, " +
                "SUM(base_imponible_tarifa_iva_diferente_0) AS base_tarifa_diferente_0 " +
                "FROM transaccion_venta " +
                "WHERE (:anio IS NULL OR EXTRACT(YEAR FROM fecha) = :anio) " +
                "AND (:mes IS NULL OR EXTRACT(MONTH FROM fecha) = :mes) " +
                "GROUP BY sistema_tipo_documento, codigo_tipo_comprobante";
        Query query = entityManager.createNativeQuery(sql, "ResumenBasesMapping")
                .setParameter("anio", anio)
                .setParameter("mes", mes);
        return query.getResultList();
    }

    @Override
    public List<Map<String, Object>> obtenerPagosMensuales(Integer anio) {
        String sql = "SELECT EXTRACT(MONTH FROM fecha) AS mes, tipo_cliente, codigo_tipo_comprobante AS tipo_documento, " +
                "SUM(base_imponible_no_objeto_iva) AS base_no_objeto_iva, " +
                "SUM(base_imponible_tarifa_0) AS base_tarifa_0, " +
                "SUM(base_imponible_tarifa_iva_diferente_0) AS base_tarifa_diferente_0 " +
                "FROM transaccion_venta " +
                "WHERE (:anio IS NULL OR EXTRACT(YEAR FROM fecha) = :anio) " +
                "GROUP BY mes, tipo_cliente, codigo_tipo_comprobante " +
                "ORDER BY mes";
        Query query = entityManager.createNativeQuery(sql, "PagosMensualesMapping")
                .setParameter("anio", anio);
        return query.getResultList();
    }
}