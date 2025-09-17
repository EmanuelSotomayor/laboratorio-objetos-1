package modelo;

import java.util.List;

public class Equipo {

    private Integer id;
    private String nombre;
    private String codigo;
    private List<Jugador> jugadores;
    private Entrenador entrenador;

    public Equipo(){}

    public Equipo(Integer id, String nombre, String codigo,
                  List<Jugador> jugadores, Entrenador entrenador) {
        this.id = id;
        this.nombre = nombre;
        this.codigo = codigo;
        this.jugadores = jugadores;
        this.entrenador = entrenador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void agregarJugador(Jugador jugador){
        System.out.println("Agregando jugador: " + jugador.getNombre() +
                " " + jugador.getApellido());
        this.jugadores.add(jugador);
    }

    public boolean eliminarJugador(String dni){

        Jugador jugador = null;

        try{
            jugador = this.obtenerJugador(dni);
            this.jugadores.remove(jugador);
            System.out.println("Jugador con el dni: " + dni + " eliminado");
        }catch(Exception e){
            System.out.println("Error al eliminar el jugador: " + dni);
        }

        return true;

    }

    public Jugador obtenerJugador(String dni) throws Exception{

        int i = 0;
        boolean encontrado = false;

        while(i < jugadores.size() && !encontrado){

            if(jugadores.get(i).getDni().equals(dni)){
                encontrado = true;
            }

            i++;

        }

        if(!encontrado){
            throw new Exception("Jugador con el dni: " + dni + ", no encontrado");
        }

        return this.jugadores.get(i);

    }

    @Override
    public String toString() {
        return "Equipo{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", codigo='" + codigo + '\'' +
                ", jugadores=" + jugadores +
                ", entrenador=" + entrenador +
                '}';
    }

}