import java.util.Scanner;

/* La tarea consiste en crear una clase llamada ProgramaManejoDeNombres de la siguiente manera:

Se requiere desarrollar un programa que reciba los nombres de 3 integrantes de tu familia o amigos como argumentos de línea de comandos.

Se pide por cada nombre de la persona una nueva variable del tipo String al tomar el segundo carácter pero convertido en mayúscula y se le concatena un punto y los dos últimos caracteres de la persona. Por ejemplo para Andres debe quedar como N.es

Debe imprimir como resultado los tres nuevos nombres separado con guion bajo (como una única variable).

Ejemplo, un resultado final esperado para los nombres Andres, Maria y Pepe podría ser:

N.es_A.ia_E.pe */
public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingrese 3 nombres ya se familiares o amigos");
        System.out.println("Ingrese el primer nombre ");
        String integranteUno = scanner.nextLine();
        System.out.println("Ingrese el segundo nombre ");
        String integranteDos = scanner.nextLine();
        System.out.println("Ingrese el tercer nombre ");
        String integranteTres = scanner.nextLine();

        // convertimos en mayúscula la segunda letra
        String mayusculaIntegranteUno = Character.toString(integranteUno.toUpperCase().charAt(1));
        String mayusculaIntegranteDos = Character.toString(integranteDos.toUpperCase().charAt(1));
        String mayusculaIntegranteTres = Character.toString(integranteTres.toUpperCase().charAt(1));

        // puntos
        String punto = ".";

        // extraemos los dos últimos caracteres del nombre
        String ultimosDosCaracteresDeIntegranteUno = integranteUno.substring(integranteUno.length()-2);
        String ultimosDosCaracteresDeIntegranteDos = integranteDos.substring(integranteDos.length()-2);
        String ultimosDosCaracteresDeIntegranteTres = integranteTres.substring(integranteTres.length()-2);

        // unimos las palabras
        String nombreUno = mayusculaIntegranteUno+punto+ultimosDosCaracteresDeIntegranteUno;
        String nombreDos = mayusculaIntegranteDos+punto+ultimosDosCaracteresDeIntegranteDos;
        String nombreTres = mayusculaIntegranteTres+punto+ultimosDosCaracteresDeIntegranteTres;

        // unimos los nombres
        System.out.println(nombreUno+"_"+nombreDos+"_"+nombreTres);

    }
}
