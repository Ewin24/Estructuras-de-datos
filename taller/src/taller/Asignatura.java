package taller;

public class Asignatura {

    public String codigo;
    public String nombre;
    public String carrera;
    public String nCreditos;

    public Asignatura(String codigo, String nombre, String carrera, String Ncreditos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.carrera = carrera;
        this.nCreditos = Ncreditos;
    }

    public Asignatura() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getNcreditos() {
        return nCreditos;
    }

    public void setNcreditos(String Ncreditos) {
        this.nCreditos = Ncreditos;
    }

    @Override
    public String toString() {
        return "Asignatura{" + "codigo=" + codigo + ", nombre=" + nombre + ", carrera=" + carrera + ", nCreditos=" + nCreditos + '}';
    }

}
