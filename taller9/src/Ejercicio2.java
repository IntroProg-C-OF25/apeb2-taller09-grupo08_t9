/*Ejercicio 2
Escriba un programa que permita presentar la siguiente serie:

1/2, 1/3, 2/5, 3/7, 5/11, 8/13, . . . fibonaccis / primos */
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int lim, primo, fibo, c, t, nt;
        c = 0;
        t = 1;
        nt = 0;
        fibo = 1;
        primo = 2;
        System.out.println("Ingresar el limite");
        lim = tcl.nextInt();
        for (int i = 0; i < lim; i++) {
            System.out.print(fibo + "/" + primo + ", ");

            fibo = c + t;
            c = t;
            t = fibo;
            primo++;
            nt = 2;
            for (nt = 2; nt < primo; nt++) {
                for (int j = 2; j < primo; j++) {
                    if (primo % j == 0) {
                        primo++;

                    } else {
                        nt = primo + 1;
                        
                    }

                }

            }

        }
        System.out.println(" ");

    }
}

/*run:
Ingresar el limite
5
1/2, 1/3, 2/5, 3/7, 5/11,  
BUILD SUCCESSFUL (total time: 1 second)
*/
