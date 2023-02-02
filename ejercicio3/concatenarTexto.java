package ejercicio3;

public class concatenarTexto {

    public static void main(String[] args) {
        
    String[] cadenaNombres = {"Alberto","Angel","Pedro","Jose"};
    String nombresConcatenados="";


    for (String nombre : cadenaNombres) {

        nombresConcatenados+=nombre;
    }
    System.out.println(nombresConcatenados);

    }
    
}
