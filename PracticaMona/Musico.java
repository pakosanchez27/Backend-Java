package PracticaMona;

public class Musico extends  OctaCat{

    String genero;
    Musico(String nombre, String color, String profecion,String genero, int edad){
        super(nombre, color, profecion, edad);
        this.genero = genero;
    }
    void Show(){
        System.out.println("----------------------------" +
                "\nNombre: " + nombre +
                "\nColor: " + color +
                "\nProfecion" + profecion +
                "\nEdad: " + edad + "Años" +
                "\ngenero: " + genero);
    }
}
