import java.util.HashMap;
import java.util.Map;

public class Estudiante {

    private String nombre;
    private String id;
    private Map<Materia, String> materiasInscritas;

    public Estudiante(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        this.materiasInscritas = new HashMap<>();
    }

    public void inscribirMateria(Materia materia, String horario) throws Exception {
        // Verificar si el horario ya está ocupado
        for (String horarioOcupado : materiasInscritas.values()) {
            if (horarioOcupado.equals(horario)) {
                throw new Exception("Conflicto de horarios: el horario " + horario + " ya está ocupado.");
            }
        }

        // Verificar si el horario está en la lista de horarios disponibles de la materia
        if (!materia.getHorariosDisponibles().contains(horario)) {
            throw new Exception("El horario seleccionado no está disponible para esta materia.");
        }

        materiasInscritas.put(materia, horario);
        System.out.println("Materia " + materia.getNombre() + " inscrita exitosamente en el horario " + horario);
    }

    public void mostrarHorarioCompleto() {
        System.out.println("Horario completo de " + nombre + ":");
        for (Map.Entry<Materia, String> entry : materiasInscritas.entrySet()) {
            System.out.println(entry.getKey().getNombre() + " - " + entry.getValue());
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Map<Materia, String> getMateriasInscritas() {
        return materiasInscritas;
    }

    public void setMateriasInscritas(Map<Materia, String> materiasInscritas) {
        this.materiasInscritas = materiasInscritas;
    }

}

