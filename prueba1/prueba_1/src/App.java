public class App {
    public static void main(String[] args) throws Exception {
        
        Circunferencia circulo = new Circunferencia(10);
        Cuadrado cuadrado = new Cuadrado(10);
        Rectangulo rectangulo = new Rectangulo(10, 5);

        circulo.printCalculo();
        cuadrado.printCalculo();
        rectangulo.printCalculo();
    }
}
