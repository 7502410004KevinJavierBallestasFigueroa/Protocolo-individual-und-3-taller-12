package Ejercicio3;

public class Electrodomesticos implements Caminador {

    public String nombre;

    public Electrodomesticos(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void caminar(){
        System.out.println("El "+nombre+" no camina");
    }
    
    
}
