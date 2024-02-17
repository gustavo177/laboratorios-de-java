public class EjemploStringTestRendimientoCocat {
    public static void main(String[] args) {
        String a = "a";
        String b ="b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);

        long inicio = System.currentTimeMillis();

        for (int i = 0; i<100000; i++){
            //c = c.concat(a).concat(b).concat("\n"); // 500 => 3ms // 1000 => 6ms // 10000 => 151ms // 100000 => 9568ms

            //c = c + a + b + "\n"; // 500 => 24ms // 1000 => 32ms // 10000 => 78ms // 100000 => 2845ms
            //c += a + b + "\n"; // 500 => 24ms // 1000 => 32ms // 10000 => 78ms // 100000 => 2845ms

            sb.append(a).append(b).append("\n"); // 500 => 0ms // 1000 => 0ms //  10000 => 3ms // 100000 => 17ms
        }

        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());
    }
}
