import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese Primer Nombre");
        String n1 = sc.nextLine();
        System.out.println("Ingrese Segundo Nombre");
        String n2 = sc.nextLine();
        System.out.println("Ingrese Tercer Nombre");
        String n3 = sc.nextLine();

        String fname = new String();
        StringBuilder sb = new StringBuilder();
        int largo = n1.length();
        sb.append(n1.substring(1,2).toUpperCase());
        sb.append(".");
        sb.append(n1.substring(largo-2));
        fname+=sb.toString();

        sb = new StringBuilder();
        largo = n2.length();
        sb.append(n2.substring(1,2).toUpperCase());
        sb.append(".");
        sb.append(n2.substring(largo-2));
        fname+="_" + sb.toString();

        sb = new StringBuilder();
        largo = n3.length();
        sb.append(n3.substring(1,2).toUpperCase());
        sb.append(".");
        sb.append(n3.substring(largo-2));
        fname+="_" + sb.toString();

        System.out.println("Name Complete = " + fname);
    }
}
