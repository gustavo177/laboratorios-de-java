import java.util.Scanner;

public class SentenciaSwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número del mes entre 1 - 12:");
        int mes = scanner.nextInt();
        String nombreMes= null;

        switch (mes){
            case 1:
                nombreMes = "Enero";
                break;
            case 2:
                nombreMes = "Febrero";
                break;
            case 3:
                nombreMes = "Marzo";
                break;
            case 4:
                nombreMes = "Abril";
                break;
            case 5:
                nombreMes = "Mayo";
                break;
            case 6:
                nombreMes = "Junio";
                break;
            case 7:
                nombreMes = "Julio";
                break;
            case 8:
                nombreMes = "Agosto";
                break;
            case 9:
                nombreMes = "Septiembre";
                break;
            case 10:
                nombreMes = "Octubre";
                break;
            case 11:
                nombreMes = "Noviembre";
                break;
            case 12:
                nombreMes = "Diciembre";
                break;
            default:
                nombreMes = "Indefinido";
                break;
        }
        System.out.println("nombreMes = " + nombreMes);


        char num = 'z';

        switch (num){
            case '0':
                System.out.println("El numero es cero");
                break;
            case '1':
                System.out.println("EL numero es uno");
            case '2':
                System.out.println("El numero es dos");
                break;
            case '3':
                System.out.println("EL numero es tres");
                break;
            case 'a':
                System.out.println("EL caracter es a");
                break;
            default:
                System.out.println("Numero o caracter desconocido");
        }

        String nombre ="luis";

        switch (nombre){
            case "admin":
                System.out.println("Hola admin, bienvenido");
                break;
            case "luis":
                System.out.println("Hola luis, bienvenido");
                break;
            case "juan":
                System.out.println("Hola juan, bienvenido");
                break;
            case "pedro":
                System.out.println("Hola pedro, bienvenido");
                break;
            default:
                System.out.println("Usuario desconocido");
        }
    }
}
