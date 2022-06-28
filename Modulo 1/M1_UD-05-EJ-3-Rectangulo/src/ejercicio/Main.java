package ejercicio;
/*
* Author: Manuel Michael Retamozo Garcia.
 */
public class Main {
    public static void main(String[] args) {
        int base;
        int altura;

        base = 4;
        altura = 2;
        Rectangulo rectangulo = new Rectangulo(base, altura);
        Rectangulo rectangulo2 = new Rectangulo();

        System.out.println("¿Es cuadrado?: " + rectangulo.esCuadrado());
        System.out.println("El area es: " + rectangulo.area());
        System.out.println("El perimetro es: " + rectangulo.perimetro());
        System.out.println("El area del rectangulo sin parametros es: " + rectangulo2.area());

        rectangulo.gira();
        System.out.println("--Intercambio de base y altura--");
        System.out.println("Base: " + rectangulo.getBase());
        System.out.println("Altura: " + rectangulo.getAltura());
    }
}
