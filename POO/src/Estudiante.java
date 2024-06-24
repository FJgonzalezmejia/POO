// Clase Estudiante
public class Estudiante extends Persona {
    private int id;
    private String estado; // matriculado, inactivo, graduado

    public Estudiante(int id, String nombre, String apellido, String fechaDeNacimiento, String estado) {
        super(nombre, apellido, fechaDeNacimiento);
        this.id = id;
        this.estado = estado;
    }

    // Getters y setters
}

// Clase Curso
public class Curso {
    private int id;
    private String nombre;
    private String descripcion;
    private int numeroCreditos;
    private int version;

    public Curso(int id, String nombre, String descripcion, int numeroCreditos, int version) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.numeroCreditos = numeroCreditos;
        this.version = version;
    }

    // Getters y setters
}

// Clase GestorAcademico
public class GestorAcademico implements ServiciosAcademicosI {
    private List<Estudiante> estudiantes;
    private List<Curso> cursos;
    private Map<Estudiante, List<Curso>> inscripciones;

    public GestorAcademico() {
        this.estudiantes = new ArrayList<>();
        this.cursos = new ArrayList<>();
        this.inscripciones = new HashMap<>();
    }

    // Implementación de los métodos de la interfaz ServiciosAcademicosI
}

