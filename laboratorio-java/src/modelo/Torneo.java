package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Torneo {

    private Integer id;
    private String nombre;
    private String temporada;
    private List<Partido> partidos;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    public Torneo(){}

    public Torneo(Integer id, String nombre, String temporada,
                  List<Partido> partidos,
                  LocalDate fechaInicio, LocalDate fechaFin) {
        this.id = id;
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

    public void agregarPartido(Partido partido){
        this.partidos.add(partido);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public boolean eliminarPartido(Integer id){

        Partido partido = null;

        try{
            partido = this.obtenerPartido(id);
            this.partidos.remove(partido);
            System.out.println("Partido con el id: " + id + " eliminado");
        }catch(Exception e){
            System.out.println("Error al eliminar el partido: " + id);
        }

        return true;

    }

    public Partido obtenerPartido(Integer id) throws Exception{

        int i = 0;
        boolean encontrado = false;

        while(i < partidos.size() && !encontrado){

            if(partidos.get(i).getId().equals(id)){
                encontrado = true;
            }

            i++;

        }

        if(!encontrado){
            throw new Exception("Partido con el ID: " + id + ", no encontrado");
        }

        return this.partidos.get(i);

    }

    public List<Partido> obtenerPartidosPorFecha(LocalDate fechaPartido){

        List<Partido> partidos = new ArrayList<>();

        for(Partido partido : this.partidos){
            if(partido.getFechaPartido().isEqual(fechaPartido)){
                partidos.add(partido);
            }
        }

        return partidos;

    }

    public List<Entrenador> obtenerEntrenadoresPorEstrategia(List<Partido> partidos, String estrategia){

        List<Entrenador> entrenadores = new ArrayList<>();

        for(Partido partido : partidos){

            Entrenador entrenadorLocal = this.buscarEntrenadorPorEstrategia(partido.getEquipoLocal(), estrategia);

            if(entrenadorLocal != null && this.buscarEntrenadorExistente(entrenadores, entrenadorLocal.getDni())){
                entrenadores.add(entrenadorLocal);
            }

            Entrenador entrenadorVisitante = this.buscarEntrenadorPorEstrategia(partido.getEquipoVisitante(), estrategia);

            if(entrenadorVisitante != null && this.buscarEntrenadorExistente(entrenadores, entrenadorVisitante.getDni())){
                entrenadores.add(entrenadorVisitante);
            }
        }

        return entrenadores;

    }

    public boolean buscarEntrenadorExistente(List<Entrenador> entrenadores, String dni){
        int i = 0;
        boolean encontrado = false;
        while(i < entrenadores.size() && !encontrado){
            if(entrenadores.get(i).getDni().equals(dni)){
                encontrado = true;
            }
            i++;
        }
        return encontrado;
    }

    public Entrenador buscarEntrenadorPorEstrategia(Equipo equipo, String estrategia){

        Entrenador entrenador = null;

        if(equipo.getEntrenador().getEstrategiaFavorita().equals(estrategia)){
            entrenador = equipo.getEntrenador();

        }

        return entrenador;

    }

    @Override
    public String toString() {
        return "Torneo{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", temporada='" + temporada + '\'' +
                ", partidos=" + partidos +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                '}';
    }

}