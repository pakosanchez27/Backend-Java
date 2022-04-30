package PracticaMona;

public class PruebaOcata {

    public static void main(String[] args) {

        Bombero Bom = new Bombero("Sentrytocat", "Azul", "Bombero","Jefe De Bomberos", 35);
        Bom.Show();
        Box box = new Box("Boxertocat", "negro", "Boxeador", 5,20);
        box.Show();
        Surf surf = new Surf("Surftocat","Morado", "Surfista", "Profecional", 26);
        surf.Show();
        Santa santa = new Santa("Saint Nictocat", "Rojo", null, "Galletas", 125);
        santa.Show();
        Dinocat dino = new Dinocat("Dinotocat", "Verde", null, "Dinosorft", 6);
        dino.Show();
        Musico dj = new Musico("Catstello", "Negro","Dj","Electronica",19);
        dj.Show();




    }
}
