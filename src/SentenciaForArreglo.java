import javax.swing.*;

public class SentenciaForArreglo {
    public static void main(String[] args) {
        String[] nombres = {"Andres","Pepe","Maria","Paco","Pedro"};
        int count = nombres.length;
        for (int i = 0 ; i<count; i++){
            if(nombres[i].equalsIgnoreCase("andres") ||
                    nombres[i].equalsIgnoreCase("paco")){
                continue;
            }
            System.out.println(i+" "+nombres[i]);
        }

        String buscar = JOptionPane.showInputDialog("Ingrese un nombre, ejemplo \"Pepe\" o \"Pepe\"");
        System.out.println("buscar = " + buscar);

        boolean encontrado = false;
        for (int i = 0 ; i<count; i++){
            if(nombres[i].equalsIgnoreCase(buscar)){
                encontrado=true;
                break;
            }
        }
        if (encontrado){
            JOptionPane.showMessageDialog(null, buscar + " fue encontrado");
        }else {
            JOptionPane.showMessageDialog(null, "No existe en el sistema");
        }
    }
}
