public class PrimitivosFloat {

    float varFlotante;

    public static void main(String[] args) {
        float realFloat = 1.5e-4f; //0.00015f;
        System.out.println("\n");
        System.out.println("realFloat = " + realFloat);
        System.out.println("tipo float corresponde en byte a " +Float.BYTES );
        System.out.println("tipo float corresponde en bytes a " +Float.SIZE );
        System.out.println("valor máximo de un float: " + Float.MAX_VALUE );
        System.out.println("valor mínimo de un float: " + Float.MIN_VALUE );

        double realDouble = 3.4028235e39;
        System.out.println("\n");
        System.out.println("realDouble = " + realDouble);
        System.out.println("tipo realDouble corresponde en byte a " +Double.BYTES );
        System.out.println("tipo realDouble corresponde en bytes a " +Double.SIZE );
        System.out.println("valor máximo de un realDouble: " + Double.MAX_VALUE );
        System.out.println("valor mínimo de un realDouble: " + Double.MIN_VALUE );

        float varFlotante = 3.1416f;
        System.out.println("\n");
        System.out.println("varFlotante = " + varFlotante);

    }
}
