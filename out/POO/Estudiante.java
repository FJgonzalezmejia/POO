public class Estudiante extends Persona {
    private int id;
    private String nombre;
    private String apellido;
    private LocalDate fechaDeNacimiento;
    private EstadoEstudiante estado;

    public Estudiante(int id, String nombre, String apellido, LocalDate fechaDeNacimiento, EstadoEstudiante estado) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.estado = estado;
    }

    // Getters y Setters
}
