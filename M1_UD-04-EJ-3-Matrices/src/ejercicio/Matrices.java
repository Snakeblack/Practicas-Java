package ejercicio;

public class Matrices {

    /**
     * Dado un array de elementos de tipo double, devuelve su valor medio.
     * @param nums array de doubles
     * @return valor medio
     */
    public static double mediaArray(double[] nums) {
        double resultado = 0;
        for (double num : nums)
            resultado += num;
        resultado /= nums.length;
        return resultado;
    }

    /**
     * Dado un array de elementos de tipo entero, calcula el mínimo y el máximo 
     * de sus valores y los devuelve como un array de dos elementos. 
     * El primer valor será el mínimo y el segundo valor será el máximo. 
     * La función minMax debe usar bucles estilo for-each.
     * @param nums Array de enteros
     * @return Array con dos enteros, el primero será el mínimo y el segundo el máximo
     */
    public static int[] minMax(int[] nums) {
        int [] res = {nums[0], nums[0]};
        for (int num : nums) {
            if (num < res[0])
                res[0] = num;
            if (num > res[1])
                res[1] = num;
        }
        return res;
    }
}