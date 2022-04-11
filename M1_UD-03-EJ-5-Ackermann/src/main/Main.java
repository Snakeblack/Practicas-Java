package main;

<<<<<<< HEAD
=======

>>>>>>> da68578485efd6a5e2b0a88fcabd7dc50de3269e
public class Main {

    public static int A(int m, int n) {
        if (m == 0) {
            return n++;
        }
        if (m > 0 && n == 0) {
<<<<<<< HEAD
            return A(m - 1, 1);
        }
        if (m > 0 && n > 0) {
            return A(m - 1, A(m, n - 1));
=======
            return A(m-1, 1);
        }
        if (m > 0 && n > 0) {
            return A(m-1, A(m, n-1));
>>>>>>> da68578485efd6a5e2b0a88fcabd7dc50de3269e
        }
        return 0;
    }

    public static void main(String[] args) {
<<<<<<< HEAD

        System.out.println(A(1, 0));
=======
        System.out.println(A(1,0));
>>>>>>> da68578485efd6a5e2b0a88fcabd7dc50de3269e
    }

}
