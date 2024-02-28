/*
Mediante el teclado pedir dos números enteros positivos o negativos y
multiplicarlos, pero sin usar el símbolo de multiplicación (*).

Puede utilizar una sentencia for para realizar la multiplicación y
tener en cuenta los unarios, donde menos por menos es positivo.
* */

import java.util.Scanner;

public class EjercicioMultiplicarDosNumeros {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese el primer numero positivo o negativo");
            int primerNumero = scanner.nextInt();
            System.out.println("Ingrese el segundo numero positivo o negativo");
            int segundoNumero = scanner.nextInt();
            int almacenar = 0;
            if(segundoNumero>0){
                for (int i = 0; i < segundoNumero; i++){
                    almacenar += primerNumero;
                }
            }else{
                for (int i = 0; i > segundoNumero; i--){
                    almacenar += -primerNumero;
                }
            }
            System.out.println("Multipicación es = " + almacenar);
        }catch (Exception e){
            System.out.println("Recuerde que solo se aceptan números enteros ya sea entero o negativo");
        }
    }
}
