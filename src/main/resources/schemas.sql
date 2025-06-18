CREATE TABLE venta (
    id SERIAL PRIMARY KEY,
    tipo_identificacion_cliente VARCHAR(20) NOT NULL,
    no_identificacion_cliente VARCHAR(20) NOT NULL,
    razon_social_cliente VARCHAR(100) NOT NULL,
    fecha_venta DATE NOT NULL,
    total_venta DECIMAL(10, 2) NOT NULL
);

CREATE INDEX idx_fecha_venta ON venta(fecha_venta);