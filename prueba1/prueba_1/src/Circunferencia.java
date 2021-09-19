public class Circunferencia extends FiguraGeometrica {
    
    private double radio;

    Circunferencia(double radio){
        this.radio = radio;
        setNombre("circunferencia");
    }

    @Override
    public double calcularPerimetro(){
        double perimetro = 2* 3.14 * radio; 
        return perimetro;
    };   

    @Override
    public double calcularArea(){
        double area = 3.14 * radio * radio;
        return area;
    };

}
