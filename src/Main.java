import Conicas1.Parabola;
import conicas2.*;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

/*Esta clase contiene un menú compuesto por el package del equipo 2, realizado por todos los integrantes del equipo 1

* Equipo 1 - Integrantes
* ----> Parabola:
* ----> Hiperbole:
*---->  Circunferencia:
* ----> Elipse:

* */
public class Main {
    public static void main(String[] args) {

        //Llamamos al m[etodo para el scanner
        Scanner entrada = new Scanner(System.in);

        /* En esta seccion agregaremos las instancias, dependiendo de cada sub equipo y conica */
        //Parabola
        Parabola_Equipo2 figura3  = new Parabola_Equipo2(6.3f, 7.9f,8.7f, 6.12f,4.5f);
        Parabola_Equipo2 figura4  = new Parabola_Equipo2(2.33f, 3.33f, 5.55f, 6.66f, 7.77f);

        //Hiperbola
        hiperbole figura1 = new hiperbole(2.63, 5.78);
        hiperbole figura2 = new hiperbole(6.33, 12.96);

        //Circunferencia
        circunferencia_grupo2 figura5 = new circunferencia_grupo2(6.37f, 9.99f);
        circunferencia_grupo2 figura6 = new circunferencia_grupo2(1.23f, 4.635f);

        //Elipse
        Elipse figura7 = new Elipse(6.453, 12.44);
        Elipse figura8 = new Elipse(9.99, 6.66);

        //Creamos la pantalla del menu principal
        System.out.println("\n\t------------------------------------Figuras 3D con Package Equipo 2----------------------------------");

        System.out.println("\nEl presente sistema permite al usuario el calcular diferentes operaciones de cónicas, mediante el empleo" +
                            "de un menu y selección. \nLas conicas que se ofrecen son:");

        System.out.println("\n----> a. Parabola");
        System.out.println("----> b. Hiperbole");
        System.out.println("----> c. Circunferencia");
        System.out.println("----> d. Elipse");

        System.out.println("\nPara continuar, seleccione la letra de la conica a usar: ");
        String opt = entrada.next();


        switch (opt) {
            case ("a") -> {
                System.out.println("\n-----> Ha seleccionado Parabola");
                System.out.println("\n\t-----> Para primera instancia: ");
                    figura3.Parabola_Equipo2_ImpVer();
                System.out.println("\n\t-----> Para segunda instancia: ");
                    figura4.Parabola_Equipo2_ImpVer();
            }
            case ("b") -> {
                System.out.println("\n-----> Ha seleccionado Hiperbole");
                System.out.println("\n\t-----> Para primera instancia: ");
                    figura1.variables();
                System.out.println("\n\t-----> Para segunda instancia: ");
                    figura2.variables();
            }
            case ("c") -> {
                System.out.println("\n-----> Ha seleccionado Circunferencia");
                System.out.println("\n\t-----> Para primera instancia: ");
                    figura5.imprimir_Datos();
                System.out.println("\n\t-----> Para segunda instancia: ");
                    figura6.imprimir_Datos();
            }
            case ("d") -> {
                System.out.println("\n-----> Ha seleccionado Elipse");
                System.out.println("\n\t-----> Para primera instancia: ");
                    figura7.imprimir_Datos();
                System.out.println("\n\t-----> Para segunda instancia: ");
                    figura8.imprimir_Datos();
            }
            default -> System.out.println("----> ERROR! Esta conica no se encuentra en el sistema!");
        }

    }
}
