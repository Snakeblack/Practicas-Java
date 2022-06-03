public class Main {
    public static void main(String[] args) {
        Clientes cliente1 = new Clientes(
                "Juan",
                "Perez Sanchez",
                "12345678A",
                "C/Falsa 54",
                "1234567890"
        );

        Clientes cliente2 = new Clientes(
                "Maria",
                "Nuñez Sanchez",
                "25445678A",
                "Pso.Falso 13",
                "670381475"
        );

        Dependientes dependiente1 = new Dependientes(
                "Raul",
                "Rodriguez García",
                "45345678A",
                "C/Falsa 123",
                "1234567890",
                "555501234",
                1000,
                "Mañana",
                "Carniceria"
        );

        Reponedores reponedor1 = new Reponedores(
                "Pedro",
                "Jimenez Gonzalez",
                "45316789G",
                "Avd. Falsa 15",
                "627643189",
                "666601234",
                1500,
                "NOCHE",
                "cef"
        );
        Empleados[] personas = new Empleados[] { dependiente1, reponedor1 };

        for (int compra = 0; compra < 200; compra++)
            cliente1.compra();

        for (int compra = 0; compra < 120; compra++)
            cliente2.compra();

        // Print de clientes y metodo empleadosMercado
        System.out.println(cliente1);
        System.out.println(cliente2);
        Mercado.empleadoMercado(personas);
    }
}
