package exm3414a;

/**
 *
 * @author yelko
 */
public class Empleado {

    @Override
    public String toString() {
        return "Empleado " + empleadoId + ": Nombre=" + empleadoNombre + ", Edad=" + empleadoEdad + ", Especialidad=" + empleadoEspecialidad;
    }
 // Variables para los miembros de la clase empleado
    private final int empleadoId;
    private final String empleadoNombre;
    private final int empleadoEdad;
    private final String empleadoEspecialidad;

    // Constructor para los argumentos
    public Empleado(int empId, String empNombre, int empEdad,
            String empDep) {
        super();
        this.empleadoId = empId;
        this.empleadoNombre = empNombre;
        this.empleadoEdad = empEdad;
        this.empleadoEspecialidad = empDep;
    }
}
