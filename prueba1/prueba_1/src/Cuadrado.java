public class Cuadrado extends FiguraGeometrica {
    
    private double lado;

    Cuadrado(double lado){
        this.lado = lado;
        setNombre("Cuadrado");
    }

    @Override
    public double calcularPerimetro(){
        double perimetro  = 4 * lado;
        return perimetro;
    };   

    @Override
    public double calcularArea(){
        double area = lado * lado;
        return area;
    };
}
