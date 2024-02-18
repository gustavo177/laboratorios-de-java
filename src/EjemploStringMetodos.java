public class EjemploStringMetodos {
    public static void main(String[] args) {
        String nombre = "Luis";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Luis\") = " + nombre.equals("Luis"));
        System.out.println("nombre.equals(\"luis\") = " + nombre.equals("luis"));
        System.out.println("nombre.equalsIgnoreCase(\"luis\") = " + nombre.equalsIgnoreCase("luis"));
        System.out.println("nombre.compareTo(\"Luis\") = " + nombre.compareTo("Luis"));
        System.out.println("nombre.compareTo(\"uis\") = " + nombre.compareTo("uis"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));
        System.out.println("nombre.charAt((nombre.l)) = " + nombre.charAt((nombre.length()-1)));

        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(1) = " + nombre.substring(1,3));
        System.out.println("nombre.substring(1) = " + nombre.substring(2,4));
        System.out.println("nombre.substring(1) = " + nombre.substring(nombre.length()-1));

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.replace(\"a\",\".\") = " + trabalenguas.replace("a","."));
        System.out.println("trabalenguas = " + trabalenguas);
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a'));
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a'));
        System.out.println("trabalenguas.indexOf(\"lenguas\") = " + trabalenguas.indexOf("lenguas"));
        System.out.println("trabalenguas.contains(\"lenguas\") = " + trabalenguas.contains("lenguas"));
        System.out.println("trabalenguas.startsWith(\"tr\") = " + trabalenguas.startsWith("tr"));
        System.out.println("trabalenguas.endsWith(\"s\") = " + trabalenguas.endsWith("s"));
        System.out.println("   trabalenguas   ");
        System.out.println("   trabalenguas   ".trim());
    }
}
