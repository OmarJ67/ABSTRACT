class Rectangulo extends Figura {
    private double longitud;
    private double anchura;
    public Rectangulo(double longitud, double anchura) {
        this.longitud = longitud;
        this.anchura = anchura;
    }
    @Override
    double calcularArea() {
        return longitud*anchura;
    }
}
