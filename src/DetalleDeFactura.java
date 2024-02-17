/* La tarea consiste en crear una nueva clase con el método main llamada DetalleDeFactura, se requiere desarrollar un programa que reciba datos de la factura utilizando la clase Scanner de la siguiente manera:
        Reciba el nombre de la factura o descripción, utilizar método nextLine() para obtener el nombre de la factura con espacios.
        Reciba 2 precios de productos de tipo double, utilizar método nextDouble() para obtener precios con decimales (,).
        Calcule el total, sume ambos precios y agregue un valor de impuesto del 19%
        Se pide mostrar en un solo String el nombre de la factura, el monto total bruto (antes de impuesto), el impuesto y el monto total neto incluyendo impuesto.
        Por ejemplo, el resultado podría ser algo así:
        La factura producto de oficina tiene un total bruto de 134.78, con un impuesto de 25.6082 y el monto después de impuesto es de 160.3882
*/
import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Por favor ingrese el nombre de la factura o descripción:");
            String nombre = scanner.nextLine();
            System.out.println("Por favor dos precios de producto de tipo flotante:");
            System.out.println("Precio del primer producto.");
            Double precio1 = scanner.nextDouble();
            System.out.println("Precio del segundo producto.");
            Double precio2 = scanner.nextDouble();

            Double bruto = precio1 + precio2;
            Double impuesto = (bruto*0.19);
            Double monto = (bruto) + (impuesto);
            System.out.println("La factura producto de oficina tiene un total bruto de "+bruto+",\ncon un impuesto de "+
                    impuesto+",\ny el monto después de impuesto es de "+monto);

        }catch (Exception e){
            System.out.println("Error ingresaste un dato mal");
        }
    }
}
