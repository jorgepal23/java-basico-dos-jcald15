public class withFor {

    /*
3. Desarrolle un algoritmo que realice la sumatoria de los números enteros
comprendidos entre el 1 y el 10, es decir, 1 + 2 + 3 + …. + 10.
Se debe rializar el mismo ejercicio con for.
     */
    public static void main(String[] args) {
        int x = 0;
        for (int i = 1; i <= 10; i++) {
            x += i;
        }
        System.out.println("La suma de los numeros enteros es: " + x);
    }
}