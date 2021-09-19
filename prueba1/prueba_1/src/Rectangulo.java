public class Rectangulo extends FiguraGeometrica {
    
    private double base;
    private double altura;

    Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
        setNombre("rectangulo");
    }

    public double calcularPerimetro(){
        double perimetro = 2 * base + 2 * altura;
        return perimetro;
    };   

    public double calcularArea(){
        double area = base * altura;
        return area;
    };
}
