package com.bootcampjava.negreirajeremy_pruebatec2.logica;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Turnero {

    private static List<Turno> listaTurnos = new ArrayList<>();

    public static List<Turno> listarTurnos() {
        return listaTurnos;
    }

    public static List<Turno> filtrarTurnos(LocalDateTime hora, String estado) {
        List<Turno> turnosFiltrados = new ArrayList<>();
        for (Turno turno : listaTurnos) {
            if (turno.getHora().equals(hora) && turno.getEstado().equals(estado)) {
                turnosFiltrados.add(turno);
            }
        }
        return turnosFiltrados;
    }

    public static void agregarTurno(Turno turno) {
        listaTurnos.add(turno);
    }
}
