package PracticaMona;


    public class Box extends OctaCat{

        int titulos;
        Box(String nombre, String color,String profecion, int titulos, int edad){
            super(nombre, color , profecion ,edad);
            this.titulos = titulos;
        }
        void Show(){
            System.out.println("-----------------------" +
                    "\nNombre: " + nombre +
                    "\nColor: " + color +
                    "\nProfecion:" + profecion +
                    "\nEdad: " + edad + "Años" +
                    "\nTitulos: " + titulos);
        }
    }

