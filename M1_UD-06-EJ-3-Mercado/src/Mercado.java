public abstract class Mercado {
    protected String nombre;
    protected String apellidos;
    protected String dni;
    protected String direccion;
    protected String telefono;

    protected Mercado(String nombre, String apellidos, String dni, String direccion, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public static void empleadoMercado(Empleados[] listaEmpleados) {
        for (Empleados empleado : listaEmpleados) {
            System.out.println(empleado);
        }
    }
}
