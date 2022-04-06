package principal;

public class Main {
    public static void main(String[] args) {
        boolean primo;

        System.out.println("Son números primos del 2 al 100:");

        for (int num = 2; num <= 100; num++) {
            primo = true;
            for (int i = num - 1; i > 1 && primo; i--) {
                if (num % i == 0) {
                    primo = false;
                }
            }
            if (primo) {
                System.out.print(num + ", ");
            }
        }
    }
}