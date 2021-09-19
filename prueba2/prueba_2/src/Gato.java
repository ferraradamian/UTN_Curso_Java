public class Gato extends Animal implements Interfaces.Carnivoro{
    
    @Override
    public void hablar(){
        System.out.println("MAULLAR");
    }

    @Override
    public void comerCarne(){
        System.out.println("COMER CARNE");
    }

    @Override
    public void comer() {
        comerCarne();
    }
}
