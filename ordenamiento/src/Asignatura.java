public class Asignatura {

    public int codigo;
    public String nombre;
    public String carrera;
    public String nCreditos;

    public Asignatura(int codigo, String nombre, String carrera, String Ncreditos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.carrera = carrera;
        this.nCreditos = Ncreditos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Asignatura() {
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
        return "Asignatura{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", carrera='" + carrera + '\'' +
                ", nCreditos='" + nCreditos + '\'' +
                '}';
    }
}