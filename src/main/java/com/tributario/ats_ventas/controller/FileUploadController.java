package com.tributario.ats_ventas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import com.ats_ventas.service.ExcelService;
import com.ats_ventas.service.DashboardService;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/upload")
@CrossOrigin(origins = "*")
public class FileUploadController {

    @Autowired
    private ExcelService excelService;
    private DashboardService dashboardService;

    @PostMapping
    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {
        try {
            excelService.processExcelFile(file);
            return new ResponseEntity<>("File uploaded successfully", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Failed to upload file: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PostMapping("/upload")
    public ResponseEntity<?> uploadFile(
            @RequestParam("file") MultipartFile file,
            @RequestParam("anexo") String anexo,
            @RequestParam("mes") int mes,
            @RequestParam("anio") int anio,
            @RequestParam("tipoCarga") String tipoCarga // nueva, adicion, correccion, reemplazo, borrar
    ) {
        // Validar anexo permitido
        String[] anexosPermitidos = {
            "COMEX", "CICLO_1_1", "CICLO_1_2", "CICLO_1_3", "CICLO_1_4", "CICLO_1_5", "CICLO_1_6",
            "CICLO_5", "CICLO_6", "INTERDIN", "PAGUE_YA", "EBS_GAF", "WEBTELLER"
        };
        boolean anexoValido = java.util.Arrays.asList(anexosPermitidos).contains(anexo);
        if (!anexoValido) {
            return ResponseEntity.badRequest().body("Anexo no permitido");
        }

        // Validar tipo de carga permitido
        String[] tiposCarga = {"nueva", "adicion", "correccion", "reemplazo", "borrar"};
        boolean tipoValido = java.util.Arrays.asList(tiposCarga).contains(tipoCarga.toLowerCase());
        if (!tipoValido) {
            return ResponseEntity.badRequest().body("Tipo de carga no permitido");
        }

        // Aquí iría la lógica para procesar el archivo según el tipo de carga

        return ResponseEntity.ok("Archivo recibido correctamente");
    }    



    @GetMapping("/consulta/resumen-bases")
    public List<Map<String, Object>> obtenerResumenBases(
        @RequestParam(required = false) Integer anio,
        @RequestParam(required = false) Integer mes
    ) {
        return dashboardService.obtenerResumenBases(anio, mes);
    }

    // Endpoint para dashboard de pagos mensuales diferenciados
    @GetMapping("/dashboard/pagos-mensuales")
    public List<Map<String, Object>> obtenerPagosMensuales(
            @RequestParam(required = false) Integer anio
    ) {
        return dashboardService.obtenerPagosMensuales(anio);
    } 
}