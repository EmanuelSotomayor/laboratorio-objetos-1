package modelo;

import java.time.LocalDate;

public class Entrenador extends Persona{

    private String estrategiaFavorita;

    public Entrenador(String nombre, String apellido,
                      LocalDate fechaNacimiento, String dni,
                      String estrategiaFavorita){
        super(nombre, apellido, fechaNacimiento, dni);
        this.estrategiaFavorita = estrategiaFavorita;
    }

    public Entrenador(){}

    public String getEstrategiaFavorita() {
        return estrategiaFavorita;
    }

    public void setEstrategiaFavorita(String estrategiaFavorita) {
        this.estrategiaFavorita = estrategiaFavorita;
    }

    @Override
    public String toString() {
        return "Entrenador{" +
                "estrategiaFavorita='" + estrategiaFavorita + '\'' +
                '}';
    }

}