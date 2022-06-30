import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        /*
         * Primera parte del ejercicio:
         */
        String nameNewFile = "ejercicio.txt";

        try (
                BufferedWriter newFile = new BufferedWriter(new FileWriter(new File(nameNewFile)));) {

            for (int i = 0; i < 3; i++) {
                newFile.write("1");
            }
            newFile.newLine();
            for (int i = 0; i < 6; i++) {
                newFile.write("2");
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (
                BufferedReader readFile = new BufferedReader(new FileReader(new File(nameNewFile)));) {

            String line = null;

            while ((line = readFile.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        /*
         * Segunda parte del ejercicio:
         */
        // La segunda parte de este ejercicio consiste en hacer, que todos los valores
        // “2” del archivo se sustituyan por “3”, mostrándose de nuevo por pantalla el
        // contenido del archivo. Finalmente cerramos el archivo y el programa termina
        try (
                BufferedReader readFile = new BufferedReader(new FileReader(new File(nameNewFile)));
                PrintWriter writeFile = new PrintWriter(nameNewFile);) {

            int c;

            while ((c = readFile.read()) != -1) {
                writeFile.write(c == '2' ? '3' : (char) c);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
