import java.util.Scanner;

public class EjercicioCalcularElAreaDeUnCirculo {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese el radio del círculo para calcular el área");
            double area = scanner.nextDouble();
            area = Math.PI * (Math.pow(area,2));
            System.out.println("area = " + area);
        }catch (Exception e){
            System.err.println("Ingrese un número válido");
            main(args);
        }
    }
}
