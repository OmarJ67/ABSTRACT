public class App {
    public static void main(String[] args) throws Exception {
        Circulo circulo = new Circulo (5.0);
        Rectangulo rectangulo = new Rectangulo (4.0,3.0);
        System.out.println("Area del Circulo:" + circulo.calcularArea());
        System.out.println("Area de Rectangulo" + rectangulo.calcularArea());

        circulo.mostrarNombre();
        rectangulo.mostrarNombre();
    } 
}

