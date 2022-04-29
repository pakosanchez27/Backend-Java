package PracticaHarry;

public class PruebaPersonaje {
    public static void main(String[] args) {

        Personaje harry = new Personaje();
        harry.setNombre("Harry James Potter");
        harry.setSexo("Masculino");
        harry.setCasa("Gryffindor");
        harry.setBoggart("Dementor");
        harry.setPatronus("ciervo");

        String msg = "Mi nombre es: " + harry.getNombre();
        msg += "\nSexo: " + harry.getSexo();
        msg += "\nCasa: " + harry.getCasa();
        msg += "\nBoggart: " + harry.getBoggart();
        msg += "\nPatronus: " + harry.getPatronus();

        System.out.println(msg);

    Personaje luna = new Personaje();
    luna.setNombre("Luna Lovegood");
    luna.setSexo("Femenino");
    luna.setBoggart("Desconocido");
    luna.setPatronus("Liebre");
    luna.setCasa("Ravenclaw");
    String msg2 = "Mi nombre es: " + luna.getNombre();
        msg2 += "\nSexo: " + luna.getSexo();
        msg2 += "\nCasa: " + luna.getCasa();
        msg2 += "\nBoggart: " + luna.getBoggart();
        msg2 += "\nPatronus: " + luna.getPatronus();


        System.out.println(msg2);

        Personaje leta = new Personaje();
        leta.setNombre("leta lestrange");
        leta.setSexo("fermenina");
        leta.setCasa("slitherin");
        leta.setBoggart(" El cadáver de su hermano Corvus flotando en el agua");
        leta.setPatronus("desconocido");

        String msg3 = "Mi nombre es: " + leta.getNombre();
        msg3 += "\nSexo: " + leta.getSexo();
        msg3 += "\nCasa: " + leta.getCasa();
        msg3 += "\nBoggart: " + leta.getBoggart();
        msg3 += "\nPatronus: " + leta.getPatronus();

        System.out.println(msg3);

      Personaje neville = new Personaje();
      neville.setNombre("Neville Longbottom");
      neville.setSexo("Maculino");
      neville.setCasa("Gryffindor");
      neville.setBoggart("El profesor Severus Snape");
      neville.setPatronus("No corporeo");

        String msg4 = "Mi nombre es: " + neville.getNombre();
        msg4 += "\nSexo: " + neville.getSexo();
        msg4 += "\nCasa: " + neville.getCasa();
        msg4 += "\nBoggart: " + neville.getBoggart();
        msg4 += "\nPatronus: " + neville.getPatronus();

        System.out.println(msg4);

        Personaje newt = new Personaje();
        newt.setNombre("Newton Scamander");
        newt.setSexo("Maculino");
        newt.setCasa("Hufflepuff");
        newt.setBoggart("Tener que trabajar en una oficina");
        newt.setPatronus("puercoespín");

        String msg5 = "Mi nombre es: " + newt.getNombre();
        msg5 += "\nSexo: " + newt.getSexo();
        msg5 += "\nCasa: " + newt.getCasa();
        msg5 += "\nBoggart: " + newt.getBoggart();
        msg5 += "\nPatronus: " + newt.getPatronus();

        System.out.println(msg5);
    }



}
