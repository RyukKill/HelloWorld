public class PrimitivoFloat {
    static float varFloat;
    public static void main(String[] args) {
        
        float realFloat = 1.5e-10f;//2120f;

        System.out.println("realFloat = " + realFloat);
        System.out.println("float corresponde en byte a " + Float.BYTES);
        System.out.println("float corresponde en bites a " + Float.SIZE);
        System.out.println("Máximo de float " + Float.MAX_VALUE);
        System.out.println("Mínimo de float " + Float.MIN_VALUE);

        double realDouble = 3.4028235E38;
        System.out.println("realDouble = " + realDouble);
        System.out.println("double corresponde en byte a " + Double.BYTES);
        System.out.println("double corresponde en bites a " + Double.SIZE);
        System.out.println("Máximo de double " + Double.MAX_VALUE);
        System.out.println("Mínimo de double " + Double.MIN_VALUE);
        
        System.out.println("varFloat = " + varFloat);
    }
}
