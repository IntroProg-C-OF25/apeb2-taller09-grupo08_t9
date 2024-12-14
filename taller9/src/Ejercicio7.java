/*
El primer ciclo paralelo C, cuenta con 28 estudiantes, de los cuales al 
finalizar el ciclo, la Dirección de la carrera de Computación a solicitado las 
siguientes estadísticas en función a los promedios obtenidos del ciclo por 
estudiantes (use 1 arreglo, no matrices, y para el promedio por estudiante, 
no ingrese el valor, si se debe autogenerar).

Promedio del ciclo, del paralelo C.
Listado de estudiantes con su nota por encima del promedio.
Listado de estudiantes con su nota por debajo del promedio.
Estudiante con la mejor calificación.
Estudiante con la calificación mas baja.
 * @author Jorge Guerrero
 */
public class Ejercicio7 {

    public static void main(String[] args) {

        int lim = 28, b = 0, a = 0;
        int cont = 0;
        double sumatoria = 0, promedio = 0, notagod = 0, notabad = 10;
        double notas[] = new double[lim];
        for (int i = 0; i < notas.length; i++) {
            notas[i] = Math.random() * 10;
            System.out.printf("%s%d%s%.2f%n", "Notas[", i, "] = ", notas[i]);
            sumatoria = sumatoria + notas[i];
        }
        promedio = sumatoria / notas.length;
        System.out.printf("%s%.2f%n", "Promedio = ", promedio);

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < 6.5) {
                cont++;
            }
        }
        System.out.println("Hay " + cont + " estudiantes que reprueban");
        System.out.println("Hay " + (notas.length - cont) + " estudiantes que aprueban");

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > notagod) {
                notagod = notas[i];
                b = i;
            }
            if (notas[i] < notabad) {
                notabad = notas[i];
                a = i;
            }
        }
        System.out.printf("%s%d%s%.2f%n", "El estudiante con mayor nota es el ", b, " con nota de = ", notagod);
        System.out.printf("%s%d%s%.2f%n", "El estudiante con menor nota es el ", a, " con nota de = ", notabad);

    }
}
/* 
Notas[0] = 7,81
Notas[1] = 5,44
Notas[2] = 2,29
Notas[3] = 8,67
Notas[4] = 2,75
Notas[5] = 8,26
Notas[6] = 8,45
Notas[7] = 0,53
Notas[8] = 6,28
Notas[9] = 2,22
Notas[10] = 0,40
Notas[11] = 1,93
Notas[12] = 9,42
Notas[13] = 7,77
Notas[14] = 6,95
Notas[15] = 4,10
Notas[16] = 7,87
Notas[17] = 6,25
Notas[18] = 2,41
Notas[19] = 6,46
Notas[20] = 9,50
Notas[21] = 3,26
Notas[22] = 7,30
Notas[23] = 2,69
Notas[24] = 0,83
Notas[25] = 5,94
Notas[26] = 0,55
Notas[27] = 5,95
Promedio = 5,08
Hay 18 estudiantes que reprueban
Hay 10 estudiantes que aprueban
El estudiante con mayor nota es el 20 con nota de = 9,50
El estudiante con menor nota es el 10 con nota de = 0,40
BUILD SUCCESSFUL (total time: 0 seconds)
 */
