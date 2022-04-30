package PracticaMona;

public class Surf extends OctaCat{
    String tabla;
    Surf(String nombre, String color, String profecion,String tabla, int edad){
        super(nombre, color, profecion, edad);
        this.tabla = tabla;
    }
    void Show(){
        System.out.println("----------------------------" +
                "\nNombre: " + nombre +
                "\nColor: " + color +
                "\nProfecion: " + profecion +
                "\nEdad: " + edad + "Años" +
                "\nTabla: " + tabla);
    }
}
