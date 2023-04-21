package observer.live;

public class Tarea {
    private Integer porcentaje;
    private String estado;

    public Tarea(Integer porcentaje, String estado) {
        this.porcentaje = porcentaje;
        this.estado = estado;
    }

    public Integer getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(Integer porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "porcentaje=" + porcentaje +
                ", estado='" + estado + '\'' +
                '}';
    }
}
