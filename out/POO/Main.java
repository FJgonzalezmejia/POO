package out.POO;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante(1, "Juan", "Perez", LocalDate.of(2000, 5, 15), EstadoEstudiante.MATRICULADO);
        Estudiante estudiante2 = new Estudiante(2, "María", "García", LocalDate.of(1998, 9, 23), EstadoEstudiante.GRADUADO);

        Curso curso1 = new Curso(1, "Programación Avanzada", "Curso de programación en Java avanzado", 4, "1.2");

        GestorAcademico gestor = new GestorAcademico();

        // Matricular estudiantes
        gestor.matricularEstudiante(estudiante1);
        gestor.matricularEstudiante(estudiante2);

        // Agregar curso
        gestor.agregarCurso(curso1);

        // Inscribir estudiantes en curso
        try {
            gestor.inscribirEstudianteCurso(estudiante1, curso1.getId());
            gestor.inscribirEstudianteCurso(estudiante2, curso1.getId());
        } catch (EstudianteYaInscritoException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Desinscribir estudiante del curso
        try {
            gestor.desinscribirEstudianteCurso(estudiante1.getId(), curso1.getId());
        } catch (EstudianteNoInscritoEnCursoException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

