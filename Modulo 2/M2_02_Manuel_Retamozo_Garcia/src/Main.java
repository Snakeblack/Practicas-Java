import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader ficheroEntrada = new BufferedReader( new FileReader( new File("M2_T02_Origen.txt")));
                BufferedWriter ficheroSalida = new BufferedWriter( new FileWriter( new File("M2_T02_Destino.txt")));
        ) {
            int c;
            while ((c = ficheroEntrada.read()) != -1) {
                ficheroSalida.write(c == ' ' ? '-' : (char) c);
            }
        } catch (IOException errorDeFichero) {
            System.out.println("Error de fichero: " + errorDeFichero.getMessage());
        }
    }
}
