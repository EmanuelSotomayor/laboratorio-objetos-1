package modelo;

import java.util.List;

public class Equipo {

    private String nombre;
    private String codigo;
    private List<Jugador> jugadores;
    private Entrenador entrenador;

    public Equipo(){}

    public Equipo(String nombre, String codigo,
                  List<Jugador> jugadores, Entrenador entrenador) {
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

    @Override
    public String toString() {
        return "Equipo{" +
                "nombre='" + nombre + '\'' +
                ", codigo='" + codigo + '\'' +
                ", jugadores=" + jugadores +
                ", entrenador=" + entrenador +
                '}';
    }

}