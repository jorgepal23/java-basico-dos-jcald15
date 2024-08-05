public class withWhile {
        /*
3. Desarrolle un algoritmo que realice la sumatoria de los números enteros
comprendidos entre el 1 y el 10, es decir, 1 + 2 + 3 + …. + 10.
Se debe rializar el mismo ejercicio con while.
     */
    public static void main(String[] args) {
        int x = 0;
        int i = 1;
        while (i <= 10) {
            x += i;
            i++;
        }
        System.out.println("La suma de los numeros enteros es: " + x);
    }
}