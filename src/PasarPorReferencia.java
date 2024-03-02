public class PasarPorReferencia {
    public static void main(String[] args) {
        int[] edad = {10,11,12};
        System.out.println("Iniciamos el método main");
        for(int i = 0; i<edad.length; i++){
            System.out.println("edad[i] = " + edad[i]);
        }
        System.out.println("Antes de llamar el método test");
        test(edad);
        for(int i = 0; i<edad.length; i++){
            System.out.println("edad[i] = " + edad[i]);
        }
        System.out.println("Finaliza el método main con los datos del arreglo modificado!");
    }

    public static void test(int[] edadArr){
        System.out.println("Iniciamos el método test");
        for(int i = 0; i<edadArr.length; i++){
            edadArr[i]=edadArr[i]+20;
        }
        System.out.println("Finaliza el método test con");
    }
}
