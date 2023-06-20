//librería para el ingreso de usuario

import conicas2.Elipse;
import conicas2.Parabola_Equipo2;
import conicas2.circunferencia_grupo2;
import conicas2.hiperbole;

import java.util.Scanner;

//la nueva clase de menu creada con mi nombre
public class menu_washington {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //instancias copiadas de mi compañero parabola
        Parabola_Equipo2 figura3  = new Parabola_Equipo2(6.3f, 7.9f,8.7f, 6.12f,4.5f);
        Parabola_Equipo2 figura4  = new Parabola_Equipo2(2.33f, 3.33f, 5.55f, 6.66f, 7.77f);

        //instancias copiadas de mi compañero hiperbola
        hiperbole figura1 = new hiperbole(2.63, 5.78);
        hiperbole figura2 = new hiperbole(6.33, 12.96);

        //instancias copiadas de mi compañero circunferencia
        circunferencia_grupo2 figura5 = new circunferencia_grupo2(6.37f, 9.99f);
        circunferencia_grupo2 figura6 = new circunferencia_grupo2(1.23f, 4.635f);

        //instancias copiadas de mi compañero elipse
        Elipse figura7 = new Elipse(6.453, 12.44);
        Elipse figura8 = new Elipse(9.99, 6.66);
//menú:
        System.out.println("\n\t------------------------------------Figuras 3D----------------------------------");
        System.out.println("\nEl presente sistema permite al usuario calcular diferentes operaciones dentro de la carpeta de cónicas, mediante el empleo de un menú y selección.");
        System.out.println("\nLas cónicas disponibles son:");
        System.out.println("\n----> 1. Parábola");
        System.out.println("----> 2. Hipérbola");
        System.out.println("----> 3. Circunferencia");
        System.out.println("----> 4. Elipse");

        System.out.println("\nPara continuar, seleccione la letra de la operacion a usar: ");
        String opt = entrada.next();

        switch (opt) {
            case "1":
                System.out.println("\n-----> Ha seleccionado Parabola");
                System.out.println("\n\t-----> Para primera instancia: ");
                figura3.Parabola_Equipo2_ImpVer();
                System.out.println("\n\t-----> Para segunda instancia: ");
                figura4.Parabola_Equipo2_ImpVer();
                break;
            case "2":
                System.out.println("\n-----> Ha seleccionado Hiperbole");
                System.out.println("\n\t-----> Para primera instancia: ");
                figura1.variables();
                System.out.println("\n\t-----> Para segunda instancia: ");
                figura2.variables();
                break;
            case "3":
                System.out.println("\n-----> Ha seleccionado Circunferencia");
                System.out.println("\n\t-----> Para primera instancia: ");
                figura5.imprimir_Datos();
                System.out.println("\n\t-----> Para segunda instancia: ");
                figura6.imprimir_Datos();
                break;
            case "4":
                System.out.println("\n-----> Ha seleccionado Elipse");
                System.out.println("\n\t-----> Para primera instancia: ");
                figura7.imprimir_Datos();
                System.out.println("\n\t-----> Para segunda instancia: ");
                figura8.imprimir_Datos();
                break;
            default:
                System.out.println("----> ERROR!!");
                break;
        }
    }
}
