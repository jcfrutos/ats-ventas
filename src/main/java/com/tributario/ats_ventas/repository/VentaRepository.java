package com.tributario.ats_ventas.repository;

import com.tributario.ats_ventas.model.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VentaRepository extends JpaRepository<Venta, Long> {
    // Aquí se pueden agregar métodos personalizados para consultas específicas si es necesario
}