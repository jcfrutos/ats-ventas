# ats-ventas

Este proyecto es una aplicación Spring Boot que permite cargar archivos en formato Excel de varios anexos transaccionales en ventas y almacenar la información en una base de datos PostgreSQL.

## Estructura del Proyecto

El proyecto está organizado de la siguiente manera:

```
ats-ventas
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── ats_ventas
│   │   │           ├── AtsVentasApplication.java
│   │   │           ├── controller
│   │   │           │   └── FileUploadController.java
│   │   │           ├── service
│   │   │           │   └── ExcelService.java
│   │   │           ├── model
│   │   │           │   └── Venta.java
│   │   │           ├── repository
│   │   │           │   └── VentaRepository.java
│   │   │           └── dto
│   │   │               └── DashboardDTO.java
│   │   └── resources
│   │       ├── application.properties
│   │       └── schema.sql
│   └── test
│       └── java
│           └── com
│               └── ats_ventas
│                   └── AtsVentasApplicationTests.java
├── pom.xml
└── README.md
```

## Requisitos

- Java 11 o superior
- Maven
- PostgreSQL

## Configuración

1. Clona el repositorio:
   ```
   git clone <URL_DEL_REPOSITORIO>
   ```

2. Navega al directorio del proyecto:
   ```
   cd ats-ventas
   ```

3. Configura la base de datos PostgreSQL en el archivo `src/main/resources/application.properties` con tus credenciales.

4. Ejecuta el siguiente comando para construir el proyecto:
   ```
   mvn clean install
   ```

## Ejecución

Para ejecutar la aplicación, utiliza el siguiente comando:
```
mvn spring-boot:run
```

## Funcionalidades

- Carga de archivos Excel a través de la clase `FileUploadController`.
- Procesamiento de datos y almacenamiento en la base de datos mediante `ExcelService`.
- Visualización de datos en un Dashboard utilizando `DashboardDTO`.
- Consulta SQL para sumar datos de pagos mensuales.

## Contribuciones

Las contribuciones son bienvenidas. Si deseas contribuir, por favor abre un issue o envía un pull request.