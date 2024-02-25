public class SentenciaSwitchCase {
    public static void main(String[] args) {
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
