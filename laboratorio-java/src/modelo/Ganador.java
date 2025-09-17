package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Ganador {

    private int id;
    private LocalDate fechaPartido;
    private Equipo equipoGanador;
    private Integer cantidadGoles;

    public Ganador(){}

    public Ganador(LocalDate fechaPartido, Equipo equipoGanador, Integer cantidadGoles) {
        this.id++;
        this.fechaPartido = fechaPartido;
        this.equipoGanador = equipoGanador;
        this.cantidadGoles = cantidadGoles;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getFechaPartido() {
        return fechaPartido;
    }

    public void setFechaPartido(LocalDate fechaPartido) {
        this.fechaPartido = fechaPartido;
    }

    public Equipo getEquipoGanador() {
        return equipoGanador;
    }

    public void setEquipoGanador(Equipo equipoGanador) {
        this.equipoGanador = equipoGanador;
    }

    public Integer getCantidadGoles() {
        return cantidadGoles;
    }

    public void setCantidadGoles(Integer cantidadGoles) {
        this.cantidadGoles = cantidadGoles;
    }

    public List<Ganador> obtenerEquiposGanadoresPorTorneoYFecha(Torneo torneo, LocalDate fechaPartido) throws Exception{

        List<Ganador> ganadores = new ArrayList<>();
        List<Partido> partidosPorFecha = torneo.obtenerPartidosPorFecha(fechaPartido);

        if(partidosPorFecha.isEmpty()){
            throw new Exception("No hubieron partidos en esta fecha");
        }

        for(Partido partido : partidosPorFecha){
            ganadores.add(partido.obtenerEquipoGanador());
        }

        return ganadores;

    }

    @Override
    public String toString() {
        return "Ganador{" +
                "id=" + id +
                ", fechaPartido=" + fechaPartido +
                ", equipoGanador=" + equipoGanador +
                ", cantidadGoles=" + cantidadGoles +
                '}';
    }

}
