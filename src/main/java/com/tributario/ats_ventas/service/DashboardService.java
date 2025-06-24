package com.tributario.ats_ventas.service;

import org.springframework.web.multipart.MultipartFile;
import java.util.List;
import java.util.Map;

public abstract class DashboardService {
    abstract void cargarArchivo(MultipartFile archivo, String anexo, int mes, int anio, String tipoCarga);

    abstract List<Map<String, Object>> obtenerResumenBases(Integer anio, Integer mes);

    abstract List<Map<String, Object>> obtenerPagosMensuales(Integer anio);
    
}
