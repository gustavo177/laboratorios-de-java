import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {
    public static void main(String[] args) {

        // (System.in) recibe datos del usuario por consola
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        // (scanner.nextLine) espera en consola hasta que el cliente ingrese un dato
        //String numeroStr = scanner.nextLine();

        int numeroDecimal = 0;
        try {
            numeroDecimal = scanner.nextInt(); //Integer.parseInt(numeroStr);
        }catch (Exception e){
            System.out.println("Error debe ingresar un número entero");
            main(args);
            //System.exit(0);
            return;
        }
        System.out.println("numeroDecimal = " + numeroDecimal);

        String resultadoBinario = "numero binario = " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);

        String resultadoOctal = "numero octal de = " + numeroDecimal+ " = " + Integer.toOctalString(numeroDecimal);

        String resulatadoHex = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        String mensaje = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resulatadoHex;

        System.out.println(mensaje);
    }
}
