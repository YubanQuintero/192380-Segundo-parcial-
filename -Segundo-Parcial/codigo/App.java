public class App {

    public static void main(String[] args) {
        try {

            GestionHorarios gestion = new GestionHorarios();

            Materia mate1 = new Materia("Matemáticas", "MAT101", 4);
            mate1.agregarHorario("Lunes 8:00-10:00");
            mate1.agregarHorario("Miércoles 10:00-12:00");
            gestion.registrarMateria(mate1);

            Materia mate2 = new Materia("Física", "FIS101", 3);
            mate2.agregarHorario("Lunes 10:00-12:00");
            gestion.registrarMateria(mate2);

            Estudiante est1 = new Estudiante("Juan Pérez", "EST001");
            gestion.inscribirEstudiante(est1);

            est1.inscribirMateria(mate1, "Lunes 8:00-10:00");
            est1.inscribirMateria(mate2, "Lunes 10:00-12:00");

            est1.mostrarHorarioCompleto();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
