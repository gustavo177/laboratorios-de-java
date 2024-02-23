/*
Suponiendo un estanque de gasolina (gas) con capacidad 70 litros, se requiere un programa que pida
la medida actual en litros y mostrar el resultado de la forma: Insuficiente, Suficiente, Medio...
La medida o capacidad actual del estanque puede ser en tipo double, para una mejor precisión, pero
tambien puede ser del tipo int.

Si la capacidad actual es 70 litros: imprimir Estanque lleno
Si está entre 60 y menor a 70: imprimir Estanque casi lleno
Si está entre 40 y menor a 60: imprimir Estanque  3/4
Si está entre 35 y menor a 40: imprimir Medio Estanque
Si está entre 20 y menor a 35: imprimir Suficiente
Si está entre 1 y menor a 20: imprimir Insuficiente
*/

import java.util.Scanner;

public class SistemaEstanqueDeGasolina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la medida actual en litros");
        float medida = scanner.nextFloat();

        if (medida == 70){
            System.out.println("Estanque lleno");
        } else if (medida >= 60 && medida < 70) {
            System.out.println("Estanque casi lleno");
        } else if (medida >= 40 && medida < 60) {
            System.out.println("Estanque 3/4");
        } else if (medida >= 35 && medida < 40) {
            System.out.println("Medio Estanque");
        } else if (medida >= 20 && medida < 35){
            System.out.println("Suficiente");
        } else if (medida >= 1 && medida < 20){
            System.out.println("Insuficiente");
        } else {
            System.out.println("Señor usuario el estanque solo tiene un tamaño de 70 litros");
        }
    }
}
