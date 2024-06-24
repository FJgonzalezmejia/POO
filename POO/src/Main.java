public class Main {
    public static void main(String[] args) {
        // Crear instancias de Estudiante y Curso
        Estudiante estudiante1 = new Estudiante(1, "Juan", "Pérez", "1990-05-15", "matriculado");
        Estudiante estudiante2 = new Estudiante(2, "María", "Gómez", "1992-09-20", "matriculado");
        Curso curso1 = new Curso(1, "Programación Orientada a Objetos", "Introducción a la POO en Java", 4, 1);
        Curso curso2 = new Curso(2, "Bases de Datos", "Diseño y manipulación de bases de datos", 3, 2);

        // Instanciar GestorAcademico y probar sus métodos
        GestorAcademico gestorAcademico = new GestorAcademico();

        try {
            gestorAcademico.matricularEstudiante(estudiante1);
            gestorAcademico.matricularEstudiante(estudiante2);
            gestorAcademico.agregarCurso(curso1);
            gestorAcademico.agregarCurso(curso2);
            gestorAcademico.inscribirEstudianteCurso(estudiante1, curso1);
            gestorAcademico.inscribirEstudianteCurso(estudiante2, curso1);
            gestorAcademico.inscribirEstudianteCurso(estudiante2, curso2);
            gestorAcademico.desinscribirEst
