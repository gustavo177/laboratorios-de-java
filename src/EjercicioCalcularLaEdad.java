/*
Para esta tarea se pide ingresar una fecha de nacimiento en formato string,
convertirla a una fecha del tipo java.util.Date y calcular la edad de la persona 
de acuerdo a la fecha actual.

Intentar usar solo lo visto hasta el momento, no el api de java 8 que lo 
veremos mas adelante, también se pueden apoyar de google que hay varios ejemplos.
* */
import com.sun.jdi.Value;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;
public class EjercicioCalcularLaEdad {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Ingrese una fecha con formato 'yyyy-MM-d'");

        try {
            Date fechaNacimiento = formato.parse(s.nextLine());
            System.out.println("fecha de nacimiento = " + fechaNacimiento);

            Date fechaActual = new Date();
            System.out.println("Fecha actual: " + fechaActual);

            // Formateamos la fecha solo mes y dia
            SimpleDateFormat formatoMes = new SimpleDateFormat("MM");
            SimpleDateFormat formatoDia = new SimpleDateFormat("dd");

            String mesDeNacimiento = formatoMes.format((fechaNacimiento));
            String mesActual = formatoMes.format((fechaActual));
            String diaDeNacimiento = formatoDia.format((fechaNacimiento));
            String diaActual = formatoDia.format((fechaActual));

            // convertimos los String a int
            int mesDeNacimientoNum = Integer.parseInt(mesDeNacimiento);
            int mesActualNum = Integer.parseInt(mesActual);
            int diaDeNacimientoNum = Integer.parseInt(diaDeNacimiento);
            int diaActualNum = Integer.parseInt(diaActual);

            // Formateamos la fecha como una cadena con el año
            SimpleDateFormat formatoAnio = new SimpleDateFormat("yyyy");
            String anioDeNacimiento = formatoAnio.format((fechaNacimiento));
            String anioActual = formatoAnio.format((fechaActual));

            // Convertimos los String a enteros primitivo
            int anio1 = Integer.parseInt(anioDeNacimiento);
            int anio2 = Integer.parseInt(anioActual);
            int edad = 0;

            if (anio1 <= anio2) {

                if ((mesDeNacimientoNum < mesActualNum) && (diaDeNacimientoNum <= 31)) {
                    edad = anio2 - anio1;
                    //System.out.println("Si cumple años" );
                } else if (((mesDeNacimientoNum == mesActualNum) && (diaDeNacimientoNum <= diaActualNum))) {
                    edad = anio2 - anio1;
                    //System.out.println("Si cumple años" );
                } else {
                    edad = anio2 - anio1;
                    edad -= 1;
                    //System.out.println("No cumple años" );
                }
                System.out.println("edad = "+edad);
            }else {
                System.out.println("Ingrese una fecha validad actualmente nos encontramos en el año " + anio2);
            }
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
