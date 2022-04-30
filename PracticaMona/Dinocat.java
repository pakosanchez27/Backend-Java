package PracticaMona;

public class Dinocat extends OctaCat{
    String PersonajeFavorito;
    Dinocat(String nombre, String color, String profecion,String PersonajeFavorito, int edad){
        super(nombre, color, profecion, edad);
        this.PersonajeFavorito = PersonajeFavorito;
    }
    void Show(){
        System.out.println("----------------------------" +
                "\nNombre: " + nombre +
                "\nColor: " + color +
                "\nProfecion" + profecion +
                "\nEdad: " + edad + "Años" +
                "\nPersonajeFavorito: " + PersonajeFavorito);
    }
}
