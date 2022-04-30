package PracticaMona;

public class Bombero extends OctaCat{

    String puesto;
    Bombero(String nombre, String color, String profecion,String puesto, int edad){
        super(nombre, color, profecion, edad);
        this.puesto = puesto;
    }
    void Show(){
        System.out.println("----------------------------" +
                "\nNombre: " + nombre +
                "\nColor: " + color +
                "\nProfecion" + profecion +
                "\nEdad: " + edad + "Años" +
                "\nPuesto: " + puesto);
    }
}

