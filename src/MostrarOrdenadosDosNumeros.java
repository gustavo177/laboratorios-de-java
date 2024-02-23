import java.util.Scanner;

/* El desafío es un programa que pida dos números y los muestre ordenados de mayor a menor.

Podría ser utilizando operador ternario. */
public class MostrarOrdenadosDosNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        float numeroUno = scanner.nextFloat();
        System.out.println("Ingrese el segundo numero");
        float numeroDos = scanner.nextFloat();
        // aplicamos operador ternario
        float numeroMayor = (numeroUno > numeroDos ) ? numeroUno : numeroDos;
        System.out.println("numeroMayor = " + numeroMayor);
    }
}
