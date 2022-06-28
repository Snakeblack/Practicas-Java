public class Universidad {
    public static void imprimirNominas(Personal[] listaPersonal) {
        for (Personal p : listaPersonal) {
            System.out.println(p);
        }
    }

    public static long obtenerPresupuestoTotal(Personal[] listaPersonal) {
        long presupuestoTotal = 0;
        for (Personal p : listaPersonal) {
            presupuestoTotal += p.calcularSueldo();
        }
        return presupuestoTotal;
    }
}