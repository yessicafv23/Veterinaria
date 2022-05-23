
import java.util.Scanner;


/*
Realizar un algoritmo que permita leer por pantalla la longitud de un arreglo y se solicite:
Nombre de una mascota, raza, edad, genero
Si la edad es mayor a 7 años se debe imprimir “Remitir a fisioterapetua”
De lo contrario imprimir “Control cada 6 meses”
 */
public class Ejercicio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int cantidad;
        int contRaza1 = 0, contRaza2 = 0, contRaza3 = 0, contRaza4 = 0, contRaza5 = 0;
        int contGenero1 = 0, contGenero2 = 0;
        int contEdadMy = 0, contEdadMn = 0;

        System.out.println("Ingrese la cantidad de mascotas");
        cantidad = entrada.nextInt();

        String[] nombreMascotas = new String[cantidad];
        int[] raza = new int[cantidad];
        String[] razaNombre = new String[cantidad];
        int[] edad = new int[cantidad];
        String[] edadC = new String[cantidad];
        int[] genero = new int[cantidad];
        String[] generoNombre = new String[cantidad];

        for (int contador = 0; contador < cantidad; contador++) {

            System.out.println("Ingrese el nombre de la mascota " + (contador + 1));
            nombreMascotas[contador] = entrada.nextLine();
            nombreMascotas[contador] = entrada.nextLine();

            do {
                System.out.println("Raza de su mascota");
                System.out.println("----------------------");
                System.out.println("Clave   Raza");
                System.out.println("----------------------");
                System.out.println(" 1.    Pastor alemán");
                System.out.println(" 2.    Pitbull");
                System.out.println(" 3.    Yorkie");
                System.out.println(" 4.    Labrador");
                System.out.println(" 5.    Otra");
                System.out.println("Seleccione clave");
                raza[contador] = entrada.nextInt();

                switch (raza[contador]) {
                    case 1:
                        razaNombre[contador] = "Pastor alemán";
                        contRaza1 = contRaza1 + 1;
                        break;
                    case 2:
                        razaNombre[contador] = "Pitbull";
                        contRaza2 = contRaza2 + 1;
                        break;
                    case 3:
                        razaNombre[contador] = "Yorkie";
                        contRaza3 = contRaza3 + 1;
                        break;
                    case 4:
                        razaNombre[contador] = "Labrador";
                        contRaza4 = contRaza4 + 1;
                        break;
                    case 5:
                        System.out.println("Digite la raza");
                        razaNombre[contador] = entrada.nextLine();
                        razaNombre[contador] = entrada.nextLine();
                        contRaza5 = contRaza5 + 1;
                        break;
                    default:
                        System.out.println("Clave invalida");
                }

            } while (raza[contador] > 5);

            System.out.println("Digite la edad de la mascota");
            edad[contador] = entrada.nextInt();

            if (edad[contador] >= 7) {
                edadC[contador] = "Remitir a fisioterapetua";
                contEdadMy = contEdadMy + 1;
            } else {
                edadC[contador] = "Control cada 6 meses";
                contEdadMn = contEdadMn + 1;

            }

            do {

                System.out.println("");
                System.out.println("Genero de la mascota");
                System.out.println("----------------");
                System.out.println("CLAVE   GENERO");
                System.out.println("----------------");
                System.out.println(" 1. Hembra");
                System.out.println(" 2. Macho");
                System.out.println("Digite la clave");
                genero[contador] = entrada.nextInt();

                switch (genero[contador]) {
                    case 1:
                        generoNombre[contador] = "Hembra";
                        contGenero1 = contGenero1 + 1;
                        break;
                    case 2:
                        generoNombre[contador] = "Macho";
                        contGenero2 = contGenero2 + 1;
                        break;
                    default:
                        System.out.println("Opción incorrecta");
                }

            } while (genero[contador] > 2);

        }

        System.out.println("");
        System.out.printf("%-20s%-20s%-20s%-20s%-20s\n", "MASCOTAS", "RAZA", "EDAD", "GENERO", "OBSERVACIÓN");
        for (int contador = 0; contador < cantidad; contador++) {
            System.out.printf("%-20s%-20s%-20s%-20s%-20s\n", nombreMascotas[contador], razaNombre[contador], edad[contador], generoNombre[contador], edadC[contador]);
        }

        System.out.println("");
        System.out.println("------------------------- REPORTE FINAL -------------------------");
        System.out.println("");
        System.out.println("REPORTE POR RAZA");
        System.out.println("-----------------");
        System.out.println("Pastor Alemán: " + contRaza1);
        System.out.println("Pitbull:       " + contRaza2);
        System.out.println("Yorkie:        " + contRaza3);
        System.out.println("Labrador:      " + contRaza4);
        System.out.println("Otra:          " + contRaza5);

        System.out.println("");

        System.out.println("REPORTE POR GENERO");
        System.out.println("----------------");
        System.out.println("Hembras: " + contGenero1);
        System.out.println("Machos:  " + contGenero2);

        System.out.println("");

        System.out.println("REPORTE DE EDAD:");
        System.out.println("--------------------------");
        System.out.println("Mayores a 7 años: " + contEdadMy);
        System.out.println("Menores a 2 años: " + contEdadMn);

    }

}
