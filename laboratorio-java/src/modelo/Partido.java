package modelo;

import java.time.LocalDate;
import java.util.List;

public class Partido {

    private Integer id;
    private Equipo equipoLocal;
    private Equipo equipoVisitante;
    private Torneo torneo;
    private LocalDate fechaPartido;
    private String estadio;
    private List<EstadisticaPartido> estadisticas;

    public Partido() {}

    public Partido(Integer id, Equipo equipoLocal, Equipo equipoVisitante,
                   Torneo torneo, LocalDate fechaPartido, String estadio) {
        this.id = id;
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

    public void agregarEstadistica(EstadisticaPartido estadisticaPartido){
        this.estadisticas.add(estadisticaPartido);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public boolean eliminarEstadisticaPorJugador(String dni){

        EstadisticaPartido estadisticaPartido = null;

        try{
            estadisticaPartido = this.obtenerEstadisticaPorJugador(dni);
            this.estadisticas.remove(estadisticaPartido);
            System.out.println("Estadistica del jugador con dni: " + dni + " eliminada");
        }catch(Exception e){
            System.out.println("Error al eliminar estadistica del jugador con dni: " + dni);
        }

        return true;

    }

    public EstadisticaPartido obtenerEstadisticaPorJugador(String dni) throws Exception{

        int i = 0;
        boolean encontrado = false;

        while(i < estadisticas.size() && !encontrado){

            if(estadisticas.get(i).getJugador().getDni().equals(dni)){
                encontrado = true;
            }

            i++;

        }

        if(!encontrado){
            throw new Exception("Estadistica del jugador con el dni: " + dni + ", no encontrada");
        }

        return this.estadisticas.get(i);

    }

    public Ganador obtenerEquipoGanador(){

        int equipoLocalCantidadGoles = this.calcularGolesEquipo(equipoLocal, estadisticas);
        int equipoVisitanteCantidadGoles = this.calcularGolesEquipo(equipoVisitante, estadisticas);
        Ganador equipoGanador = null;

        if(equipoLocalCantidadGoles > equipoVisitanteCantidadGoles){
            equipoGanador = new Ganador(fechaPartido, equipoLocal, equipoLocalCantidadGoles);
        }else if(equipoVisitanteCantidadGoles > equipoLocalCantidadGoles){
            equipoGanador = new Ganador(fechaPartido, equipoVisitante, equipoVisitanteCantidadGoles);
        }else{
            //Dejamos el equipo ganador para indicar que hubo un empate
            equipoGanador = new Ganador(fechaPartido, null, equipoLocalCantidadGoles);
        }

        return equipoGanador;

    }

    public int calcularGolesEquipo(Equipo equipo, List<EstadisticaPartido> estadisticas){
        int cantidadGoles = 0;
        for(Jugador jugador: equipo.getJugadores()){
            for(EstadisticaPartido estadistica: estadisticas){
                if(estadistica.getJugador().getDni().equals(jugador.getDni())){
                    cantidadGoles+=estadistica.getCantidadGoles();
                }
            }
        }
        return cantidadGoles;
    }

    @Override
    public String toString() {
        return "Partido{" +
                "id=" + id +
                ", equipoLocal=" + equipoLocal +
                ", equipoVisitante=" + equipoVisitante +
                ", torneo=" + torneo +
                ", fechaPartido=" + fechaPartido +
                ", estadio='" + estadio + '\'' +
                ", estadisticas=" + estadisticas +
                '}';
    }

}