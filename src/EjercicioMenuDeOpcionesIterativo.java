import java.util.Scanner;

/*
Para la tarea se requiere un menú para administrar a los productos con las opciones:
actualizar, eliminar, crear, listar y salir.

Para la clase con el método main vamos a contar con un menú para poder seleccionar
el tipo de operación, puede ser con la clase Scanner indicando una lista
con las opciones, cada opción asociada a un numero.

Según el numero ingresado usar un if o switch para implementar cada una de
las 4 operaciones y 5 para salir.

Dentro de cada sentencia o switch imprimir un texto relacionado
a la opción, por ejemplo para actualizar:

mediante sout en consola:

System.out.println("Usuario actualizado correctamente");

Para eliminar el mensaje "Usuario eliminado correctamente" y así sucesivamente
dependiendo de la opción.

Usar un do while para iterar hasta que la opción sea salir, cada vez
que se selecciona una operación distinta a salir, al finalizar con
dicha operación debe volver al menú para continuar con otra, al finalizar
con la opción salir (5) se debe mostrar el mensaje "Haz salido con exito!"
y finalizar el programa.

* */
public class EjercicioMenuDeOpcionesIterativo {
    public static void main(String[] args) {
        try {
            boolean iniciar = true;
            Scanner scanner = new Scanner(System.in);
            int numero = 0;

            System.out.println("Menu de administración.\nDebe seleccionar una operación");
            System.out.println("Oprime (1) actualizar usuario");
            System.out.println("Oprime (2) eliminar usuario");
            System.out.println("Oprime (3) crear usuario");
            System.out.println("Oprime (4) listar usuario");
            System.out.println("Oprime (5) salir");

            while (iniciar) {
                numero = scanner.nextInt();
                switch (numero) {
                    case 1:
                        System.out.println("Usuario actualizado correctamente");
                        break;
                    case 2:
                        System.out.println("Usuario eliminado correctamente");
                        break;
                    case 3:
                        System.out.println("Usuario creado correctamente");
                        break;
                    case 4:
                        System.out.println("Usuario listado correctamente");
                        break;
                    case 5:
                        System.out.println("Haz salido con exito!");
                        iniciar = false;
                        break;
                    default:
                        System.out.println("La operación ("+numero+") no existe");
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println("Recuerde ingresar datos numéricos");
        }
    }
}


