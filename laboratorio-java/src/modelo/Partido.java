package modelo;

import java.time.LocalDate;
import java.util.List;

public class Partido {

    private Equipo equipoLocal;
    private Equipo equipoVisitante;
    private Torneo torneo;
    private LocalDate fechaPartido;
    private String estadio;
    private List<EstadisticaPartido> estadisticas;

    public Partido() {}

    public Partido(Equipo equipoLocal, Equipo equipoVisitante,
                   Torneo torneo, LocalDate fechaPartido, String estadio) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.torneo = torneo;
        this.fechaPartido = fechaPartido;
        this.estadio = estadio;
    }

    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(Equipo equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(Equipo equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public Torneo getTorneo() {
        return torneo;
    }

    public void setTorneo(Torneo torneo) {
        this.torneo = torneo;
    }

    public LocalDate getFechaPartido() {
        return fechaPartido;
    }

    public void setFechaPartido(LocalDate fechaPartido) {
        this.fechaPartido = fechaPartido;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public List<EstadisticaPartido> getEstadisticas() {
        return estadisticas;
    }

    public void setEstadisticas(List<EstadisticaPartido> estadisticas) {
        this.estadisticas = estadisticas;
    }

    @Override
    public String toString() {
        return "Partido{" +
                "equipoLocal=" + equipoLocal +
                ", equipoVisitante=" + equipoVisitante +
                ", torneo=" + torneo +
                ", fechaPartido=" + fechaPartido +
                ", estadio='" + estadio + '\'' +
                ", estadisticas=" + estadisticas +
                '}';
    }

}