package Ejercicio3;

public interface Caminador {

    default void identificacion(String tipo){
        System.out.println("El tipo de caminador es: "+tipo);
    }

    void caminar();
    
}
