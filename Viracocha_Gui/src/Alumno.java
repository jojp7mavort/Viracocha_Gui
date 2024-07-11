// Archivo: Alumno.java
public class Alumno {
    private String nombre;
    private String matricula;
    private int edad;
    private String direccion;
    private String telefono;

    public Alumno(String nombre, String matricula, int edad, String direccion, String telefono) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getEdad() {
        return edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }
}
