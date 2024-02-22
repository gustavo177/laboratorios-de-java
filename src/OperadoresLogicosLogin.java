import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {
        /*
        // los arreglos se inicializan una sola vez con la cantidad de elementos
        String[] usernames = new String[3];
        String[] passwords = new String[3];

        usernames[0] = "andres";
        passwords[0] = "12345";

        usernames[1] = "admin";
        passwords[1] = "12345";

        usernames[2] = "luis";
        passwords[2] = "12345";
        */

        // o se declara de forma explícita con los elementos
        String[] usernames = {"andres","admin","luis"};
        String[] passwords = {"12345","12345","12345"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el username");
        String u = scanner.next();

        System.out.println("Ingrese el password");
        String p = scanner.next();

        boolean esAutenticado = false;

        for (int i = 0; i < usernames.length; i++){
            // aplicando operador ternario
            esAutenticado = ( usernames[i].equals(u) && passwords[i].equals(p) ? true : esAutenticado);
            /*
            if( (usernames[i].equals(u) && passwords[i].equals(p)) ){
                esAutenticado=true;
                break;
            }
            */
        }
        // aplicando operador ternario
        String mensaje=esAutenticado ? "Bienvenido usuario ".concat(u).concat("!") :
                "Username o password incorrectos!\nLo sentimos, requiere autenticación";
        System.out.println("mensaje = " + mensaje);

        /*
        if(esAutenticado){
            System.out.println("Bienvenido usuario ".concat(u).concat("!"));
        } else {
            System.out.println("Username o password incorrectos!");
            System.out.println("Lo sentimos, requiere autenticación");
        }
        */
    }
}
