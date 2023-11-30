package com.bootcampjava.negreirajeremy_pruebatec2.persistencia;

import com.bootcampjava.negreirajeremy_pruebatec2.logica.Ciudadano;
import com.bootcampjava.negreirajeremy_pruebatec2.logica.Turno;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ControladoraPersistencia {

    // Fábrica de gestores de entidad para crear el EntityManager.
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAPU");

    // Controlador JPA para la entidad Ciudadano.
    CiudadanoJpaController ciudadanoJPAC = new CiudadanoJpaController(emf);

    // Controlador JPA para la entidad Turno.
    TurnoJpaController turnoJPAC = new TurnoJpaController(emf);

    /**
     * Crea un nuevo turno en la base de datos.
     *
     * @param turno El turno que se va a crear.
     */
    public void crearTurno(Turno turno) {
        turnoJPAC.create(turno);
    }

    /**
     * Obtiene todos los turnos almacenados en la base de datos.
     *
     * @return Lista de todos los turnos almacenados.
     */
    public List<Turno> traerTurnos() {
        return turnoJPAC.findTurnoEntities();
    }

    /**
     * Obtiene los turnos filtrados a partir de la fecha y con el estado indicado.
     *
     * @param fechaFiltrado La fecha a partir de la cual se filtran los turnos.
     * @param estado        El estado de los turnos que se desean obtener.
     * @return Lista de turnos filtrados.
     */
    public List<Turno> traerTurnosFiltrado(LocalDate fechaFiltrado, String estado) {
        return traerTurnos()
                .stream()
                .filter(turno -> turno.getFecha().isAfter(fechaFiltrado) || turno.getFecha().isEqual(fechaFiltrado))
                .filter(turno -> turno.getEstado().equals(estado))
                .toList();
    }

    /**
     * Obtiene un ciudadano a partir de su número de DNI.
     *
     * @param dni El número de DNI del ciudadano que se desea obtener.
     * @return El ciudadano correspondiente al DNI proporcionado, o un Optional vacío si no se encuentra.
     */
    public Optional<Ciudadano> traerCiudadanoPorDNI(String dni) {
        List<Ciudadano> ciudadanos = ciudadanoJPAC.findCiudadanoEntities();

        return ciudadanos.stream()
                .filter(ciudadano -> ciudadano.getDni().equals(dni))
                .findFirst();
    }
}