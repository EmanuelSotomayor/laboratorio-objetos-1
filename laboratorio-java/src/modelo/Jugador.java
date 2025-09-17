package modelo;

import java.time.LocalDate;

public class Jugador extends Persona{

    private Integer id;
    private Float estatura;
    private Float peso;
    private String posicion;
    private Integer numero;

    public Jugador(Integer id, String nombre, String apellido,
                   LocalDate fechaNacimiento, String dni,
                   Float estatura, Float peso,
                   String posicion, Integer numero){
        super(nombre, apellido, fechaNacimiento, dni);
        this.id = id;
        this.estatura = estatura;
        this.peso = peso;
        this.posicion = posicion;
        this.numero = numero;
    }

    public Jugador(){}

    public Float getEstatura() {
        return estatura;
    }

    public void setEstatura(Float estatura) {
        this.estatura = estatura;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "id=" + id +
                ", estatura=" + estatura +
                ", peso=" + peso +
                ", posicion='" + posicion + '\'' +
                ", numero=" + numero +
                '}';
    }

}