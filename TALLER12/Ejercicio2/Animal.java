package Ejercicio2;

public class Animal implements Nadador, Volador {

    public String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public void nadar(){
        System.out.println("El "+ nombre+ " puede nadar");
    }
    @Override
    public void volar(){
        System.out.println("El "+nombre+" puede no puede volar");
    }
    
}
