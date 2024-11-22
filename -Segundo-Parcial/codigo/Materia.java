import java.util.ArrayList;
import java.util.List;

public class Materia {

    private String nombre;
    private String codigo;
    private int creditos;
    private List<String> horariosDisponibles;

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public void setHorariosDisponibles(List<String> horariosDisponibles) {
        this.horariosDisponibles = horariosDisponibles;
    }

    public Materia(String nombre, String codigo, int creditos) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.creditos = creditos;
        this.horariosDisponibles = new ArrayList<>();
    }

    public void agregarHorario(String horario) {
        horariosDisponibles.add(horario);
    }

    public List<String> getHorariosDisponibles() {
        return horariosDisponibles;
    }

    public void mostrarHorariosDisponibles() {
        System.out.println("Horarios disponibles para " + nombre + ":");
        for (String horario : horariosDisponibles) {
            System.out.println(horario);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}