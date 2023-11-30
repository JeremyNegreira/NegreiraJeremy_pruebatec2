package com.bootcampjava.negreirajeremy_pruebatec2.logica;

import com.bootcampjava.negreirajeremy_pruebatec2.persistencia.ControladoraPersistencia;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class ControladoraTurno {

    // Instancia de la controladora de persistencia utilizada para interactuar con la capa de persistencia.
    ControladoraPersistencia controladoraPersistencia = new ControladoraPersistencia();

    /**
     * Crea un nuevo turno.
     *
     * @param turno El turno que se va a crear.
     */
    public void crearTurno(Turno turno) {
        controladoraPersistencia.crearTurno(turno);
    }

    /**
     * Obtiene todos los turnos almacenados.
     *
     * @return Lista de todos los turnos almacenados.
     */
    public List<Turno> traerTurnos() {
        return controladoraPersistencia.traerTurnos();
    }

    /**
     * Obtiene los turnos filtrados a partir de la fecha y con el estado indicado.
     *
     * @param fechaFiltrado La fecha a partir de la cual se filtran los turnos.
     * @param estado        El estado de los turnos que se desean obtener.
     * @return Lista de turnos filtrados.
     */
    public List<Turno> traerTurnosFiltrado(LocalDate fechaFiltrado, String estado) {
        return controladoraPersistencia.traerTurnosFiltrado(fechaFiltrado, estado);
    }

    /**
     * Obtiene un ciudadano a partir de su número de DNI.
     *
     * @param dni El número de DNI del ciudadano que se desea obtener.
     * @return El ciudadano correspondiente al DNI proporcionado, o null si no se encuentra.
     */
    public Ciudadano traerCiudadanoPorDNI(String dni) {
        Optional<Ciudadano> resultadoBusquedaDni = controladoraPersistencia.traerCiudadanoPorDNI(dni);
        return resultadoBusquedaDni.orElse(null);
    }
}
