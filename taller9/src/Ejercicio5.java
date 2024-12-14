/*
Dados los siguientes arreglos

double[] promedios = {10, 10, 9.1, 7, 6.1, 4, 8};
String[] estudiantes = {"Kimberly Gonzalez", "Mark Hogan", "Teresa Martinez", "Julia Johnson", "Mark Cook", "Jennifer Manning", "Juan Vasquez"};
Genere los datos para el arreglo

String[] promediosCualitativos = new String[7];

Promedio Regular son todas las notas >=0 y <=5.9
Promedio Bueno son todas las notas >=6 y <=8.9
Promedio Sobresaliente son todas las notas >=9 y <=10
Finalmente presentar un reporte como el que sigue:

Kimberly Gonzalez promedio: 10,00 promedio cualitativo ?
Mark Hogan promedio: 10,00 promedio cualitativo ?
Teresa Martinez promedio: 9,10 promedio cualitativo ?
Julia Johnson promedio: 7,00 promedio cualitativo ?
Mark Cook promedio: 6,10 promedio cualitativo ?
Jennifer Manning promedio: 4,00 promedio cualitativo ?
Juan Vasquez promedio: 8,00 promedio cualitativo ?
 * @author Jorge Guerrero
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        double[] promedios = {10, 10, 9.1, 7, 6.1, 4, 8};
        String[] estudiantes = {"Kimberly Gonzalez", "Mark Hogan", "Teresa Martinez", "Julia Johnson", "Mark Cook", "Jennifer Manning", "Juan Vasquez"};

        for (int i = 0; i < 7; i++) {
            if ((promedios[i] >= 0) && (promedios[i] <= 5.9)) {
                System.out.println(estudiantes[i] + " con promedio de " + promedios[i] + ". Su promedio es regular");
            } else if ((promedios[i] >= 6) && (promedios[i] <= 8.9)) {
                System.out.println(estudiantes[i] + " con promedio de " + promedios[i] + ". Su promedio es bueno");
            } else if ((promedios[i] >= 9) && (promedios[i] <= 10)) {
                System.out.println(estudiantes[i] + " con promedio de " + promedios[i] + ". Su promedio es sobresaliente");
            }
        }
    }

}

/* 
Kimberly Gonzalez con promedio de 10.0. Su promedio es sobresaliente
Mark Hogan con promedio de 10.0. Su promedio es sobresaliente
Teresa Martinez con promedio de 9.1. Su promedio es sobresaliente
Julia Johnson con promedio de 7.0. Su promedio es bueno
Mark Cook con promedio de 6.1. Su promedio es bueno
Jennifer Manning con promedio de 4.0. Su promedio es regular
Juan Vasquez con promedio de 8.0. Su promedio es bueno
BUILD SUCCESSFUL (total time: 0 seconds)
*/
