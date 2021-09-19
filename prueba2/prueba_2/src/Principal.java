import jdk.dynalink.beans.StaticClass;

public class Principal {
    public static void main(String[] args) throws Exception {
        
        Perro perro = new Perro();
        Gato gato = new Gato();
        Vaca vaca = new Vaca();

        System.out.println("Hablar segun animal");
        hablarAnimal(perro);
        hablarAnimal(gato);
        hablarAnimal(vaca);

        System.out.println("Comer segun animal");
        comerAnimal(perro);
        comerAnimal(gato);
        comerAnimal(vaca);
    }

    private static void hablarAnimal(Animal a) {
        a.hablar();
    }

    private static void comerAnimal(Animal a) {
        a.comer();
    }
}
