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
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }
    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    public EstadoEstudiante getEstado() {
        return estado;
    }
    public void setEstado(EstadoEstudiante estado) {
        this.estado = estado;
    }
    
}
