import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

/*
Crear una clase con el método main donde el desafío es buscar el número
menor de mínimo 10 valores enteros, usando la clase Scanner ingresar la
cantidad de números a comparar, luego utilizando una sentencia for iterar
el numero de veces (ingresado) para pedir el numero entero, entonces se requiere:

Calcular el menor número e imprimir el valor.

Si el menor número es menor que 10, imprimir "El número menor es menor que 10!".
si no, imprimir " el numero menor es igual o mayor que 10!".
* */
public class EjercicioCalcularElNumeroMenos {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int cantidad = 0;
            int num1 = 0;
            int menor = 0;

            System.out.println("Ingrese la cantidad de numeros a comparar");
            cantidad = scanner.nextInt();

            int[] numeros = new int[cantidad];

            for (int i = 0; i < cantidad; i++){
                System.out.println("Ingrese el valor del numero "+i);
                num1 = scanner.nextInt();
                numeros[i]=num1;
            }
            menor = numeros[0];
            // De forma manual recorremos el arreglo
            for (int i = 0; i < numeros.length; i++){
                if (numeros[i]<=menor){
                    menor=numeros[i];
                }
            }
            System.out.println("El numero menor es = " + menor);
            // Buscamos el menor número menor usando métodos predefinidos en Java
            System.out.println("El numero menor es = " + Arrays.stream(numeros).min().getAsInt());

            if (menor < 10){
                System.out.println("El número menor es (" +menor+") y es menor que 10!");
            }else {
                System.out.println("El numero menor es (" +menor+") y es igual o mayor que 10!");
            }
        }catch (Exception e){
            System.out.println("Solo tiene que ingresar datos enteros");
        }
    }
}
