package com.tributario.ats_ventas.service;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.tributario.ats_ventas.model.Venta;
import com.tributario.ats_ventas.repository.VentaRepository;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class ExcelService {

    @Autowired
    private VentaRepository ventaRepository;

    public void saveExcelData(MultipartFile file) throws IOException {
        List<Venta> ventas = parseExcelFile(file);
        ventaRepository.saveAll(ventas);
    }

    private List<Venta> parseExcelFile(MultipartFile file) throws IOException {
        List<Venta> ventas = new ArrayList<>();
        try (Workbook workbook = new XSSFWorkbook(file.getInputStream())) {
            Sheet sheet = workbook.getSheetAt(0);
            for (Row row : sheet) {
                Venta venta = new Venta();
                venta.setTipoIdentificacionCliente(row.getCell(0).getStringCellValue());
                venta.setNoIdentificacionCliente(row.getCell(1).getStringCellValue());
                venta.setRazonSocialCliente(row.getCell(2).getStringCellValue());
                // Add other fields as necessary
                ventas.add(venta);
            }
        }
        return ventas;
    }

    public void processExcelFile(MultipartFile file) {
        // This method can be used to process the file further if needed
        throw new UnsupportedOperationException("Method not implemented yet");
    }
}
