package PracticaMona;

public class Santa extends OctaCat{
    String comida;
    Santa(String nombre, String color, String profecion,String comida, int edad){
        super(nombre, color, profecion, edad);
        this.comida = comida;
    }
    void Show(){
        System.out.println("----------------------------" +
                "\nNombre: " + nombre +
                "\nColor: " + color +
                "\nProfecion" + profecion +
                "\nEdad: " + edad + "Años" +
                "\ncomida: " + comida);
    }
}
