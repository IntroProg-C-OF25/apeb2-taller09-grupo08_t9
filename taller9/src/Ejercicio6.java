
import java.util.Scanner;

/*Ejercicios 6
Analice el siguiente código

Scanner entrada = new Scanner(System.in);
String[] estudiantes = {"Kimberly", "Hogan", "Teresa", "Luis", "Mark", "Jennifer", "Alcides"};
String inicial;
boolean bandera = true;
while(bandera){
    System.out.println("Ingrese una letra");
    inicial = entrada.nextLine();
 }
Modifique el ciclo repetitivo para que salga del mismo, cuando el usuario ingrese 
por teclado una letra que coincida con la primera letra de los "nombres" contenidos 
en del arreglo estudiantes. Debe usar un ciclo repetitivo para recorrer el arreglo 
estudiantes, y no quemar de forma constante dichas iniciales, imagine que estudiantes
podría contener millón de nombres, por lo que fijar iniciales, es ineficiente.*/
public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] estudiantes = {"Kimberly", "Hogan", "Teresa", "Luis", "Mark", "Jennifer", "Alcides"};
        String inicial;

        boolean bandera = true;
        while (bandera) {
            System.out.println("Ingrese una letra");
            inicial = entrada.nextLine();
            for (int i = 0; i < 7; i++) {
                
                if (inicial.equals(estudiantes[i].substring(0, 1))) {
                    bandera = false;
                    break;

                }
            }
        }
    }
}
/*run:
Ingrese una letra
a
Ingrese una letra
s
Ingrese una letra
H
BUILD SUCCESSFUL (total time: 7 seconds)
*/
