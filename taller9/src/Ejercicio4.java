
/*Ejercicio 4
Dado el arreglo; determinar cuantos elementos están arriba de la media aritmética y cuantos están por debajo de la medía aritmética.

int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};*/
public class Ejercicio4 {
    public static void main(String[] args) {
        int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        double prom=0;
        int cont=0, cont2=0;
        
        for (int i = 0; i < 13; i++) {
            prom=prom+arreglo[i];
        }
        prom=prom/13;
        for (int i = 0; i < 13; i++) {
            if (arreglo[i]<prom) {
                cont++;
            } else{
                cont2++;
            }
                
            
        }
        System.out.println("La media aritmetica es: "+prom);
        System.out.println(cont+" estan debajo de la media aritmetica y "+cont2+" estan por ensima de la media aritmetica");
    }
}
/*run:
La media aritmetica es: 9.538461538461538
5 estan debajo de la media aritmetica y 8 estan por ensima de la media aritmetica
BUILD SUCCESSFUL (total time: 0 seconds)
*/