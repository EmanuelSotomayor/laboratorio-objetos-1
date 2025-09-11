package modelo;

import java.time.LocalDate;
import java.util.List;

public class Torneo {

    private String nombre;
    private String temporada;
    private List<Partido> partidos;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    public Torneo(){}

    public Torneo(String nombre, String temporada,
                  List<Partido> partidos,
                  LocalDate fechaInicio, LocalDate fechaFin) {
        this.nombre = nombre;
        this.temporada = temporada;
        this.partidos = partidos;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }

    public List<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(List<Partido> partidos) {
        this.partidos = partidos;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    @Override
    public String toString() {
        return "Torneo{" +
                "nombre='" + nombre + '\'' +
                ", temporada='" + temporada + '\'' +
                ", partidos=" + partidos +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                '}';
    }

}