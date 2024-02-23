import javax.swing.*;

/*
* Obtener el nombre mas largo de tres personas, según los siguientes requerimientos:

* Mediante el teclado pedir el nombre completo (nombre + apellido) de tres miembros de la familia
* o amigos usando la clase JOptionPane y método showInputDialog().

* Calcular e Imprimir el nombre de la persona que tenga el nombre más largo (en cantidad de caracteres)
* (Imprimir sólo uno de los tres, el de más caracteres en el nombre.)

* Podría usar .split(" "); del objeto String para separar nombre y apellido en un arreglo,
* y con el indice cero accedemos al nombre de la persona.

Restricción no usar loops en el desarrollo de la tarea.
* */
public class ObtenerElNombreMasLargoDeTresPersonas {
    public static void main(String[] args) {

        String familiarUno = String.format((JOptionPane.showInputDialog("Por favor ingrese su primer nombre y apellido (familiar uno)")));
        String familiarDos = String.format((JOptionPane.showInputDialog("Por favor ingrese su primer nombre y apellido (familiar dos)")));
        String familiarTres = String.format((JOptionPane.showInputDialog("Por favor ingrese su primer nombre y apellido (familiar tres)")));

        String[] separarNombreUno = familiarUno.split(" ");
        String[] separarNombreDos = familiarDos.split(" ");
        String[] separarNombreTres = familiarTres.split(" ");

        if (separarNombreUno.length >= 3 || separarNombreDos.length >= 3 || separarNombreTres.length >= 3) {
            JOptionPane.showMessageDialog(null, "Señor usuario solo tienes que ingresar un nombre y un apellido");
        } else if (separarNombreUno.length <= 1 || separarNombreDos.length <= 1 || separarNombreTres.length <= 1) {
            JOptionPane.showMessageDialog(null, "Señor usuario al parecer solo ingreso un nombre\n" +
                    "recuerde que tiene que ingresar el nombre mas el apellido\n" +
                    "ejemplo \"luis bautista\" ");
        }else{
            // Operador ternaria
            String[] nombreMasLargo = (separarNombreUno[0].length() > separarNombreDos[0].length()) ? separarNombreUno : separarNombreDos;
            nombreMasLargo = (nombreMasLargo[0].length() > separarNombreTres[0].length() ? nombreMasLargo : separarNombreTres);
            JOptionPane.showMessageDialog(null, nombreMasLargo[0] + " " + nombreMasLargo[1] + " tiene el nombre mas largo");
        }
    }
}
