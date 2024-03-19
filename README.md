# GENERATE-JWT-QUARKUS
## Levantar el proyecto
El orden en que se levanten los servicios no tiene impacto en la funcionalidad sin embargo, es importante que ambos esten levantados para el correcto funcionamiento. El comando que debe ser usado es
```
./mvnw quarkus:dev
```

## 1. Proyecto jwt
El primer proyecto es responsable de la generación y manejo de JWTs. Las características clave incluyen:

- **Generación de JWT**: Utiliza claves privadas ubicadas en `src/resources/META-INF/resources` para generar JWTs. Las claves se generan mediante la herramienta OpenSSL, asegurando la adhesión a los estándares de seguridad actuales.

- **Comunicación con Endpoint Protegido**: Una vez que el JWT ha sido generado, este proyecto realiza una llamada a un endpoint protegido perteneciente al proyecto `with-security`. Esto demuestra la capacidad del token para autenticar de forma segura las solicitudes entre servicios.

## 2. Proyecto with-security
Este segundo proyecto presenta dos endpoints diferenciados en su nivel de seguridad:

- **Endpoint Protegido**: Requiere un JWT válido para el acceso. Este endpoint está diseñado para ser consumido por el proyecto `jwt`, probando así la efectividad de la autenticación y transmisión segura del token.

- **Endpoint Público**: No requiere autenticación previa para su acceso, lo que permite una conexión libre y directa sin la necesidad de un token JWT.


