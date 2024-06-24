package out.POO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GestorAcademico implements ServiciosAcademicosI {
    private List<Estudiante> estudiantes;
    private List<Curso> cursos;
    private Map<Integer, List<Integer>> inscripciones; // Map<idCurso, List<idEstudiante>>

    public GestorAcademico() {
        this.estudiantes = new ArrayList<>();
        this.cursos = new ArrayList<>();
        this.inscripciones = new HashMap<>();
    }

    @Override
    public void matricularEstudiante(Estudiante estudiante) {
        if (!estudiantes.contains(estudiante)) {
            estudiantes.add(estudiante);
        }
    }

    @Override
    public void agregarCurso(Curso curso) {
        if (!cursos.contains(curso)) {
            cursos.add(curso);
            inscripciones.put(curso.getId(), new ArrayList<>());
        }
    }

    @Override
    public void inscribirEstudianteCurso(Estudiante estudiante, int idCurso) throws EstudianteYaInscritoException {
        if (inscripciones.containsKey(idCurso)) {
            List<Integer> estudiantesInscritos = inscripciones.get(idCurso);
            if (estudiantesInscritos.contains(estudiante.getId())) {
                throw new EstudianteYaInscritoException("El estudiante ya está inscrito en este curso.");
            } else {
                estudiantesInscritos.add(estudiante.getId());
            }
        } else {
            throw new IllegalArgumentException("El curso especificado no existe.");
        }
    }

    @Override
    public void desinscribirEstudianteCurso(int idEstudiante, int idCurso) throws EstudianteNoInscritoEnCursoException {
        if (inscripciones.containsKey(idCurso)) {
            List<Integer> estudiantesInscritos = inscripciones.get(idCurso);
            if (estudiantesInscritos.contains(idEstudiante)) {
                estudiantesInscritos.remove(Integer.valueOf(idEstudiante));
            } else {
                throw new EstudianteNoInscritoEnCursoException("El estudiante no está inscrito en este curso.");
            }
        } else {
            throw new IllegalArgumentException("El curso especificado no existe.");
        }
    }
}
