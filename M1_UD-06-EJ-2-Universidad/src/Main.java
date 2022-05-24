public class Main {
    public static void main(String[] args) {
        // Crear personal
        Personal p1 = new Investigador("Juan", "12345678A");
        Personal p2 = new Investigador("Pedro", "87654321B");
        Personal p3 = new Profesor("Antonio", "55002227R", 1);
        Personal p4 = new Profesor("Pablo", "48002375M", 2);
        Personal p5 = new Administrativo("Raul", "52043298I", 6);
        Personal p6 = new Administrativo("Maria", "14035798P", 8);
        Personal p7 = new Informatico("Manuel", "55002229Y", 12);
        Personal p8 = new Informatico("Kelvin", "37102147H", 5);
        Personal[] listaPersonal = new Personal[] {p1, p2, p3, p4, p5, p6, p7, p8};
        // Imprimir las nónimas
        System.out.println("Nóminas de los personal");
        System.out.println("======================");
        Universidad.imprimirNominas(listaPersonal);

        // Ver el presupuesto total
        System.out.println("Presupuesto total: " + Universidad.obtenerPresupuestoTotal(listaPersonal));
    }
}
