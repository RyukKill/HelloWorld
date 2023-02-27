public class EjemploStringMetodos {
    public static void main(String[] args) {
        String nombre = "Fernando";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Fernando\") = " + nombre.equals("Fernando"));
        System.out.println("nombre.equals(\"fernando\") = " + nombre.equals("fernando"));
        System.out.println("nombre.equalsIgnoreCase(\"fernando\") = " + nombre.equalsIgnoreCase("fernando"));
        System.out.println("nombre.compareTo(\"Fernando\") = " + nombre.compareTo("Fernando"));
        System.out.println("nombre.compareTo(\"Andres\") = " + nombre.compareTo("Andres"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(4) = " + nombre.charAt(4));
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));

        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(1,4) = " + nombre.substring(1,4));

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas = " + trabalenguas);

        System.out.println("trabalenguas.replace(\"a\",\".\") = " + trabalenguas.replace("a","."));
        System.out.println("trabalenguas = " + trabalenguas);
        System.out.println("trabalenguas.indexOf(\"a\") = " + trabalenguas.indexOf("a"));
        System.out.println("trabalenguas.lastIndexOf(\"a\") = " + trabalenguas.lastIndexOf("a"));

        System.out.println("trabalenguas.indexOf('z') = " + trabalenguas.indexOf('z'));
        System.out.println("trabalenguas.contains(\"t\") = " + trabalenguas.contains("t"));
        System.out.println("trabalenguas.startsWith(\"traba\") = " + trabalenguas.startsWith("traba"));
        System.out.println("  trabalenguas  ");
        System.out.println("  trabalenguas  ".trim());
    }
}
