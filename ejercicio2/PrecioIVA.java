package ejercicio2;

public class PrecioIVA {
    public static void main (String[] arg){

        double precioReal= obtenerPrecio(36d);
        System.out.println("El precio real es: "+ precioReal);

    }

    public static  double  obtenerPrecio (double precioNormal){
        double IVA = precioNormal*.16;

        return precioNormal+IVA;

    }

}
