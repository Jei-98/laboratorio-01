# Laboratorio 9 - Persistencia con MariaDB, JPA y Spring Data JPA

Proyecto: `petmatch-lab` (PetMatch Mini). Las mascotas se guardan en MariaDB.

## Preparar la base (una sola vez, como administrador de MariaDB)

```sql
CREATE DATABASE IF NOT EXISTS petmatch_lab
    CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

CREATE USER IF NOT EXISTS 'petmatch_user'@'127.0.0.1'
    IDENTIFIED BY 'TU_CONTRASENA_LOCAL';

GRANT ALL PRIVILEGES ON petmatch_lab.* TO 'petmatch_user'@'127.0.0.1';
```

## Variables de entorno (PowerShell, en la terminal que ejecuta la app)

```powershell
$env:DB_URL = 'jdbc:mariadb://127.0.0.1:3306/petmatch_lab'
$env:DB_USERNAME = 'petmatch_user'
$env:DB_PASSWORD = 'TU_CONTRASENA_LOCAL'
```

La contraseña NO se guarda en el repositorio.

## Ejecutar

```powershell
.\mvnw.cmd spring-boot:run     # aplicación (MariaDB)
.\mvnw.cmd test                # pruebas (H2 en memoria + mocks)
```
