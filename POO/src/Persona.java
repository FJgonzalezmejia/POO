public class Persona {
    private String nombre;
    private String apellido;
    private String fechaDeNacimiento;

    public Persona(String nombre, String apellido, String fechaDeNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    // Getters y setters
}

// Estudiante ahora hereda de Persona
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
