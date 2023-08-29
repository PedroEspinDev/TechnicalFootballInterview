# TechnicalFootballInterview
Springboot exercise based on a technical interview.
Lenguage: English and Spanish

Escribir un servicio RESTFUL.

# Crear un CRUD para equipos de fútbol.

Tech Stack
Kotlin o Java 8 (o superior)
Springboot
Maven
#Requisitos OBLIGATORIOS
 Poder crear un equipo con las siguientes propiedades

 Nombre
 Ciudad
 Propietario
 Capacidad del estadio
 División
 Competición
 Número de jugadores
 Fecha de creación
 Y validar que:

 Nombre (Obligatorio)
 Capacidad del estadio (Positivo)
 División (1, 2, 3)
 Número de jugadores (Positivo)
 Fecha de creación (Anterior a hoy)
 si Division es 1 => Capacidad del estadio debe ser mayor de 50000
 si Division es 2 => Capacidad del estadio debe ser mayor de 10000
 si Division es 3 => Capacidad del estadio debe ser mayor de 3000
 Obtener una lista de todos los equipos

 Obtener los detalles de un equipo específico

 Generar la respuesta http de éxito o fracaso como mejor consideres en todos los end-points

Requisitos DESEABLES
 Obtener una lista de equipos ordenados por su capacidad de estadio
 Poder actualizar los datos de un equipo, excepto la "Fecha de creación"
 Poder borrar un equipo específico
 Trazas de log
 Pruebas unitarias y de integración
 Documentar API
Requisitos OPCIONALES
 Incluir Jenkinsfile de ejemplo build/deploy para el proyecto
 Incluir Dockerfile en el proyecto que cree un contenedor Docker que aloje el servicio web.
 Añadir alguna forma de autenticación.
 Cualquier otra funcionalidad/cosa que consideres que aporta valor.
#El objetivo no es completar al 100% el servicio para ponerlo directamente en producción, es plantear una posible solución y ser capaz de defenderlo.
