import java.util.Scanner;

/*
Pedir 20 notas finales de alumnos en una escala de 1 a 7, manejar decimales en
las notas (double). Mostrar el promedio de las notas mayores a 5, promedio de
notas inferiores a 4 y la cantidad de notas 1, ademas mostrar el promedio total.

Ayuda: usar un bucle for que itere hasta 20 (notas) y dentro del ciclo pedir las
notas una a una para realizar los cálculos (contadores, sumas).

Opcional: si una de las notas ingresadas es 0 debe salirse del ciclo for
y mostrar un mensaje de error finalizando el programa.

* */
public class EjercicioSistemaDeNotasDeAlumnos {
    public static void main(String[] args) {
        boolean inicia = true;
        try{
            while (inicia){
                int cantidadDeNotas = 20;
                double notasMayoresCinco = 0.0;
                double contadorNotasMayoresCinco = 0.0;
                double notasMenoresCuatro = 0.0;
                double contadorNotasMenoresCuatro = 0.0;
                double notasIgualUno = 0.0;
                double nota = 0.0;
                double promedioTotal=0.0;
                Scanner scanner = new Scanner(System.in);
                System.out.println("Ingrese 20 notas entre un rango de 1 a 7");
                control:
                for (int i = 0; i < cantidadDeNotas; i++){
                    System.out.println("Ingrese el valor de la nota ("+i+")");
                    nota = scanner.nextDouble();
                    if (nota < 1 || nota > 7) {
                        System.out.println("Recuerde que solo se aceptan numeros entre un rango de 1 a 7");
                        break control;
                    }
                    if(nota >= 5){
                        contadorNotasMayoresCinco += 1;
                        notasMayoresCinco += nota;
                    }else if (nota <=4) {
                        contadorNotasMenoresCuatro += 1;
                        notasMenoresCuatro += nota;
                    }
                    if (nota == 1.0){
                        notasIgualUno += 1;
                    }
                    promedioTotal += nota;
                }
                if(!(nota < 1 || nota > 7)){
                    System.out.println("Promedio total de notas mayores a 5 = "+(notasMayoresCinco / contadorNotasMayoresCinco));
                    System.out.println("Promedio total de notas menores a 4 = "+(notasMenoresCuatro / contadorNotasMenoresCuatro));
                    System.out.println("Cantidades de uno = "+(notasIgualUno));
                    System.out.println("Promedio general de notas = "+(promedioTotal / cantidadDeNotas));
                }
                inicia = false;
                System.out.println("Finalizado");
            }
        }catch (Exception e){
            System.out.println("Recuerde que solo se trabajan con numero flotantes");
        }
    }
}
