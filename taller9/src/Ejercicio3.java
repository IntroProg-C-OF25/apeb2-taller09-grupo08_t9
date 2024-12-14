
import java.util.Scanner;

/* Genera una aplicación que permita ingresar valores a un arreglo de cadenas. 
El arreglo almacena el número de elementos que el usuario lo disponga. 
Se puede plantear el escenario que se ingresen nombres de marcas de vehículos.
Por ejemplo, si el usuario decide ingresar 5 marcas; el arreglo solo debe permitir ingresar ese número elementos.
Considerar las siguientes excepciones, no se contabilizan dentro del número de 
elementos, marcas que empiecen con las letras A, C, T.
 * @author Jorge Guerrero
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int num, i = 0, cont = 0;
        String marca[] = new String[100000];
        String xd;

        System.out.print("Ingrese el numero de elementos a ingresar: ");
        num = tcl.nextInt();

        while (i < num) {
            System.out.print("Ingrese la marca: ");
            marca[cont] = tcl.next();
            xd = marca[cont].substring(0, 1);
            if (xd.equals("A") || xd.equals("T") || xd.equals("C")) {
                i += 0;
                System.out.println("Marca no valida, ingresa otra");
            } else {
                i++;
            }
            cont++;

        }
    }

}

/* Ingrese el numero de elementos a ingresar: 3
Ingrese la marca: Aston
Marca no valida, ingresa otra
Ingrese la marca: Aston
Marca no valida, ingresa otra
Ingrese la marca: BMW
Ingrese la marca: FERRARI
Ingrese la marca: PIPE
BUILD SUCCESSFUL (total time: 42 seconds)
 */
