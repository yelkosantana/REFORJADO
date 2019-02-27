
package exm3414a;

/**
 *
 * @author yelko
 */
import java.util.ArrayList;

public class RegistroEmpleados {
       public static void main(String[] args) {
                  // Creamos una lista para almacenar los empleados
        ArrayList<Empleado> empRegistro = new ArrayList<Empleado>();

        // AÃ±adimos empleados para fundamentar el objeto creado
        empRegistro.add(new Empleado(101, "SJ", 19, "Programador"));
        empRegistro.add(new Empleado(102, "RS", 17, "Desarrollador"));
        empRegistro.add(new Empleado(103, "ZR", 25, "Soporte y mantenimiento"));
        empRegistro.add(new Empleado(104, "IL", 35, "Jefazo"));
        empRegistro.add(new Empleado(105, "SR", 21, "DiseÃ±ador y maquetador"));

        // Pasamos los empleados por pantalla con un bucle forEach
        for(Empleado emp : empRegistro) {
            System.out.println(emp);
        }
    }

}
