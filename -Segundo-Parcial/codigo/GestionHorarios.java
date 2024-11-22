import java.util.ArrayList;
import java.util.List;

public class GestionHorarios {

    private List<Materia> materias;

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    private List<Estudiante> estudiantes;

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public GestionHorarios() {
        this.materias = new ArrayList<>();
        this.estudiantes = new ArrayList<>();
    }

    public void registrarMateria(Materia materia) {
        materias.add(materia);
        System.out.println("Materia " + materia.getNombre() + " registrada exitosamente.");
    }

    public void inscribirEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
        System.out.println("El estudiante" + estudiante.getNombre() + " se registro exitosamente");
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }
}