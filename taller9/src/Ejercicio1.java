
import java.util.Scanner;

/*Con el objetivo practicar el uso del ciclo repetitivo for, 
se propone que dado un límite, se presenten las siguientes figuras. 
Por ejemplo si el límite es 4:
 * @author Jorge Guerrero
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int limite;

        System.out.print("Ingrese el limite: ");
        limite = tcl.nextInt();

        System.out.println("Figura 1:");
        for (int i = 1; i <= limite; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Figura 2:");
        for (int i = 1; i <= limite; i++) {
            for (int j = 1; j <= limite - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Figura 3:");
        for (int i = 1; i <= limite; i++) {
            for (int j = 1; j <= limite - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = limite - 1; i > 0; i--) {
            for (int j = 1; j <= limite - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/* 
Ingrese el limite: 5
Figura 1:
*
**
***
****
*****

Figura 2:
    *
   ***
  *****
 *******
*********

Figura 3:
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
*/
