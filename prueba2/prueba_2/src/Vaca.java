public class Vaca extends Animal implements Interfaces.Herbivoro {
    
    @Override
    public void hablar(){
        System.out.println("MUGIR");
    }

    @Override
    public void comerHierba(){
        System.out.println("COMER PASTO");
    };

    @Override
    public void comer() {
        comerHierba();
    }

}
