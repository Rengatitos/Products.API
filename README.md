# Products.API

Este proyecto fue desarrollado con Spring Boot desde Visual Studio Code en GitHub Codespaces, usando extensiones recomendadas para Java y Spring.

La conexión a la base de datos se realizó mediante PostgreSQL en una base creada en Supabase, lo que permitió probar la persistencia de datos de manera directa. El objetivo de este proyecto fue entender el comportamiento de las clases y la estructura de una API REST básica, con entidades Category y Product, así como sus relaciones.

Al ejecutar la aplicación, se utilizó la URL del puerto que ofrece Codespaces para acceder al API desde el navegador:
![Screenshot_20250926_002202_Chrome](https://github.com/user-attachments/assets/273ad115-7014-4d24-b1b8-bf304a3250cc)

Para poder testear correctamente la API desde Postman y otros clientes externos, se habilitó el puerto 8080 de forma pública:
![Screenshot_20250926_003516_Chrome](https://github.com/user-attachments/assets/0d4645de-3354-4255-918e-992c86b7be56)

Este es el resultado de test en postman, demostrando la correcta operación de los endpoints con el GET
![Screenshot_20250926_003529_Chrome](https://github.com/user-attachments/assets/aa45e4c0-a355-4d27-930c-cf91aea77642)
![Screenshot_20250926_003539_Chrome](https://github.com/user-attachments/assets/5d8d2b4b-d99f-486b-887d-36ee9dc5a635)


Continuación del proyecto

En esta fase se desarrollará el código de las clases y controladores para manejar las tablas Category y Product, implementando los endpoints completos de la API:

POST → Crear nuevos registros.

PUT → Actualizar registros existentes.

DELETE → Eliminar registros.

El objetivo es completar la logística de la API, permitiendo la manipulación total de los datos desde el backend y facilitando las pruebas en Postman o cualquier cliente REST.
