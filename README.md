# Prueba técnica Java Avanzado - Bootcamp Java - Jeremy Negreira

## Uso de la Aplicación

1. **Registro de Turnos:**
   - Accede al primer formulario para registrar un nuevo turno.
   - Completa los datos solicitados, con especial atención al campo DNI para la identificación del ciudadano.

2. **Visualización de Turnos:**
   - Utiliza el segundo botón para acceder a una lista de todos los turnos.
   - La información se presenta en forma de tabla, destacando datos básicos de cada turno.

3. **Búsqueda Filtrada:**
   - Accede al formulario de búsqueda filtrada para obtener una lista específica de turnos.
   - Ingresa la fecha a partir de la cual deseas buscar y especifica el estado que estás buscando.
   - La aplicación mostrará una lista de turnos que cumplen con los criterios establecidos.

## Consideraciones Adicionales

- **Base de Datos de Ciudadanos:**
  - Se asume que la base de datos del gobierno ya contiene los datos de los ciudadanos.
  - La aplicación se limita a la gestión de turnos y no realiza operaciones relacionadas con la creación o eliminación de ciudadanos.

- **Filtrados Obligatorios:**
  - En la búsqueda filtrada, tanto la fecha como el estado son campos obligatorios.
  - Estos filtros aseguran resultados más precisos y útiles.

- **Documentos de Identidad Únicos:**
  - Aunque puede haber excepciones, se considera que los documentos de identidad son únicos y no se repiten.
  - La aplicación trabaja implícitamente con esta premisa al identificar a los ciudadanos en la base de datos.

- **Estados de Turno:**
  - Los estados posibles de un turno son "Ya atendido" o "En espera".
  - No se proporciona otra opción de estado, según la asunción realizada.
