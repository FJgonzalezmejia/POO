package out.POO;

public class Persona {
    protected String nombre;
    protected String apellido;
    protected LocalDate fechaDeNacimiento;

    public Persona() {}

    public Persona(String nombre, String apellido, LocalDate fechaDeNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    // Getters y Setters
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

} 



