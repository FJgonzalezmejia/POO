public class GestorAcademico implements ServiciosAcademicosI {
    // ...

    @Override
    public void matricularEstudiante(Estudiante estudiante) throws EstudianteYaMatriculadoException {
        if (estudiantes.contains(estudiante)) {
            throw new EstudianteYaMatriculadoException("El estudiante ya está matriculado");
        }
        estudiantes.add(estudiante);
    }

    @Override
    public void agregarCurso(Curso curso) throws CursoYaExisteException {
        if (cursos.contains(curso)) {
            throw new CursoYaExisteException("El curso ya existe");
        }
        cursos.add(curso);
    }

    @Override
    public void inscribirEstudianteCurso(Estudiante estudiante, Curso curso) throws EstudianteYaInscritoException {
        if (inscripciones.containsKey(estudiante) && inscripciones.get(estudiante).contains(curso)) {
            throw new EstudianteYaInscritoException("El estudiante ya está inscrito en este curso");
        }
        if (!inscripciones.containsKey(estudiante)) {
            inscripciones.put(estudiante, new ArrayList<>());
        }
        inscripciones.get(estudiante).add(curso);
    }

    @Override
    public void desinscribirEstudianteCurso(Estudiante estudiante, Curso curso) throws EstudianteNoInscritoEnCursoException {
        if (!inscripciones.containsKey(estudiante) || !inscripciones.get(estudiante).contains(curso)) {
            throw new EstudianteNoInscritoEnCursoException("El estudiante no está inscrito en este curso");
        }
        inscripciones.get(estudiante).remove(curso);
    }
}

