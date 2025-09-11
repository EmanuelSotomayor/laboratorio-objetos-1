package modelo;

public class EstadisticaPartido {

    private Jugador jugador;
    private Partido partido;
    private Integer cantidadGoles;
    private Integer cantidadAsistencias;
    private Integer cantidadMinutosJugados;

    public EstadisticaPartido() {}

    public EstadisticaPartido(Jugador jugador, Partido partido,
                              Integer cantidadGoles, Integer cantidadAsistencias,
                              Integer cantidadMinutosJugados) {
        this.jugador = jugador;
        this.partido = partido;
        this.cantidadGoles = cantidadGoles;
        this.cantidadAsistencias = cantidadAsistencias;
        this.cantidadMinutosJugados = cantidadMinutosJugados;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public Partido getPartido() {
        return partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }

    public Integer getCantidadGoles() {
        return cantidadGoles;
    }

    public void setCantidadGoles(Integer cantidadGoles) {
        this.cantidadGoles = cantidadGoles;
    }

    public Integer getCantidadAsistencias() {
        return cantidadAsistencias;
    }

    public void setCantidadAsistencias(Integer cantidadAsistencias) {
        this.cantidadAsistencias = cantidadAsistencias;
    }

    public Integer getCantidadMinutosJugados() {
        return cantidadMinutosJugados;
    }

    public void setCantidadMinutosJugados(Integer cantidadMinutosJugados) {
        this.cantidadMinutosJugados = cantidadMinutosJugados;
    }

    @Override
    public String toString() {
        return "EstadisticaPartido{" +
                "jugador=" + jugador +
                ", partido=" + partido +
                ", cantidadGoles=" + cantidadGoles +
                ", cantidadAsistencias=" + cantidadAsistencias +
                ", cantidadMinutosJugados=" + cantidadMinutosJugados +
                '}';
    }

}