import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DatosDeFactura {
    public static void main(String[] args) {
        // Se requiere desarrollar un programa que reciba datos de la factura utilizando la clase Scanner

        // Se trabajará con los siguientes datos:
        // (1) Número de Factura: Un número único que identifica de manera exclusiva cada factura
        // (2)Fecha de Emisión: La fecha en la que se emitió la factura.
        // (3)Fecha de Vencimiento: La fecha límite para el pago de la factura.
        // (4)Datos del Emisor: Información sobre la entidad que emite la factura, como nombre, dirección, número de identificación

        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);
        Scanner scanner4 = new Scanner(System.in);
        Scanner scanner5 = new Scanner(System.in);
        Scanner scanner6 = new Scanner(System.in);

        System.out.println("Por favor ingrese los datos de la factura");
        int numeroDeFactura = 0;
        String fechaDeEmision ="";
        String fechaDeVencimiento="";
        String nombre = "";
        String direccion = "";
        String numeroDeIdentificacion = "";


        String formatoFecha = "^\\d{2}/\\d{2}/\\d{4}$"; // Expresión regular para el formato "dd/mm/aa"
        // Compilar la expresión regular
        Pattern pattern = Pattern.compile(formatoFecha);

        try {
            System.out.println("(1) Número de Factura: ");
            numeroDeFactura = scanner1.nextInt(); //Integer.parseInt(numeroStr);

            System.out.println("(2) Fecha de Emisión (en formato dd/mm/aaaa): ");
            fechaDeEmision = scanner2.nextLine(); //Integer.parseInt(numeroStr);

            // Crear el matcher con el string de fecha
            Matcher matcher = pattern.matcher(fechaDeEmision);

            // Verificamos si el string coincide con el formato esperado
            while (!matcher.matches()) {
                System.out.println("El formato de fecha no es válido.\nIngrese una fecha válida ejemplo (01/02/2019)");
                fechaDeEmision = scanner2.nextLine();
                // Verificamos hasta que ingrese una fecha validad
                matcher = pattern.matcher(fechaDeEmision);
            }

            System.out.println("(3) Fecha de vencimiento (en formato dd/mm/aaaa): ");
            fechaDeVencimiento = scanner3.nextLine();
            // Verificamos el formato fecha
            matcher = pattern.matcher(fechaDeVencimiento);

            while (!matcher.matches()) {
                System.out.println("El formato de fecha no es válido.\nIngrese una fecha válida ejemplo (01/02/2019)");
                fechaDeVencimiento = scanner3.nextLine();
                // Verificamos hasta que ingrese una fecha validad
                matcher = pattern.matcher(fechaDeVencimiento);
            }

            System.out.println("(4) Ingrese los datos del Emisor: ");
            System.out.println("Ingrese el nombre: ");
            nombre = scanner4.nextLine();
            System.out.println("Ingrese la dirección: ");
            direccion = scanner5.nextLine();
            System.out.println("Ingrese el numero de identificación: ");
            numeroDeIdentificacion = scanner6.nextLine();

        }catch (Exception e){
            System.out.println("Error al ingresar los datos");
            main(args);
            //System.exit(0);
            return;
        }



    }
}
