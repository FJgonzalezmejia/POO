public interface ServiciosAcademicosI {
    void matricularEstudiante(Estudiante estudiante) throws EstudianteYaMatriculadoException;
    void agregarCurso(Curso curso) throws CursoYaExisteException;
    void inscribirEstudianteCurso(Estudiante estudiante, Curso curso) throws EstudianteYaInscritoException;
    void desinscribirEstudianteCurso(Estudiante estudiante, Curso curso) throws EstudianteNoInscritoEnCursoException;
}

public class EstudianteYaMatriculadoException extends Exception {
    // ...
}

public class CursoYaExisteException extends Exception {
    // ...
}

public class EstudianteYaInscritoException extends Exception {
    // ...
}

public class EstudianteNoInscritoEnCursoException extends Exception {
    // ...
}

