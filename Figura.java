//Definimos una clase abstracta
abstract class Figura {
    //Metodo abstracto a las subclases
    abstract double calcularArea();
    //Metodo abstracto a las subclases
    void mostrarNombre() {
        System.out.println("Esta es una figura");

    }
}