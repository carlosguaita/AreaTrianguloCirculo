public class Main {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo();
        triangulo.ingresarCoordenadas();
        if (triangulo.esRectangulo()) {
            Circulo circulo = new Circulo(triangulo);
            double areaCirculo = circulo.obtenerArea();
            double areaTriangulo = triangulo.obtenerArea();
            double area = areaTriangulo-areaCirculo;
            System.out.println("El área entre el triangulo y el circulo es: "+area);
        }else{
            System.out.println("El triángulo no es rectángulo");
        }
    }
}