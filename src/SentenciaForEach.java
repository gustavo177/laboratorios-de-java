public class SentenciaForEach {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,9,6,3};

        for(int num: numeros){
            System.out.println("num = " + num);
        }

        String[] nombres = {"Andres","Pepe","Maria","Paco","Pedro"};
        for(String nombre: nombres){
            System.out.println("nombre = " + nombre);
        }
    }
}
