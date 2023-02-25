import java.util.Scanner;

public class DetalleFactura {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese de la Factura: ");
        String facturaStr = sc.nextLine();
        System.out.println("Ingrese 1er Precio de Producto: ");
        double primerPrecio = sc.nextDouble();
        System.out.println("Ingrese 2do Precio de Producto: ");
        double segundoPrecio = sc.nextDouble();

        double suma = primerPrecio + segundoPrecio;
        double iva = suma * 0.19;
        double total = suma + iva;
        
        String mensaje = "La factura " + facturaStr;
        mensaje += " tiene un total bruto de " + suma;
        mensaje += ", con un impuesto de " + iva;
        mensaje += " y el monto después de impuesto es de " + total;

        System.out.println("mensaje = " + mensaje);
    }
}
