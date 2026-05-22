# Log Microservice

Un microservicio backend robusto diseñado para la ingesta, validación y almacenamiento centralizado de registros (logs) provenientes de múltiples sistemas. Este servicio garantiza la persistencia de datos críticos de forma estructurada en PostgreSQL.

## Tecnologías y Herramientas

* **Lenguaje:** Java 17+
* **Framework:** Spring Boot 3.x
* **Persistencia:** Spring Data JPA / Hibernate
* **Base de Datos:** PostgreSQL 15
* **Validación:** Jakarta Bean Validation

## Requisitos Previos

* [Java Development Kit (JDK) 17](https://adoptium.net/) o superior.
* [Maven](https://maven.apache.org/) (o usar el wrapper incluido `./mvnw`).
* [Docker](https://www.docker.com/) y Docker Compose.
