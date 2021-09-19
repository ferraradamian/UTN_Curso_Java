public abstract class FiguraGeometrica {
    
    private String nombre;    

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    } 

    public void printCalculo(){
        System.out.println("Nombre de la figura: " + this.nombre + " Perimetro: " + this.calcularPerimetro()
        + " Area: " + this.calcularArea());
    }

    public abstract double calcularPerimetro();   

    public abstract double calcularArea();
}
