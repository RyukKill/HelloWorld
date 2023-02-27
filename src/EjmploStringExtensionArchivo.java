public class EjmploStringExtensionArchivo {
    public static void main(String[] args) {
        
        String archivo = "alguna_imagen.js";
        int i = archivo.indexOf(".");
        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo.su = " + archivo.substring(i+1));

    }
}
