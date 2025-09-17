package modelo;

import java.time.LocalDate;

public class Entrenador extends Persona{

    private Integer id;
    private String estrategiaFavorita;

    public Entrenador(Integer id, String nombre, String apellido,
                      LocalDate fechaNacimiento, String dni,
                      String estrategiaFavorita){
        super(nombre, apellido, fechaNacimiento, dni);
        this.id = id;
        this.estrategiaFavorita = estrategiaFavorita;
    }

    public Entrenador(){}

    public String getEstrategiaFavorita() {
        return estrategiaFavorita;
    }

    public void setEstrategiaFavorita(String estrategiaFavorita) {
        this.estrategiaFavorita = estrategiaFavorita;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Entrenador{" +
                "id=" + id +
                ", estrategiaFavorita='" + estrategiaFavorita + '\'' +
                '}';
    }

}