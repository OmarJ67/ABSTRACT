// Clase abstracta Vehículo
abstract class Vehiculo {
private int numeroRuedas;
 private String marca;
 private String modelo;
 public Vehiculo(int numeroRuedas, String marca, String modelo) {
this.numeroRuedas = numeroRuedas;
 this.marca = marca;
this.modelo = modelo;
 }
 public int getNumeroRuedas() {
 return numeroRuedas;
 }
 public void setNumeroRuedas(int numeroRuedas) {
 this.numeroRuedas = numeroRuedas;
}
 public String getMarca() {
return marca;
 }
 public void setMarca(String marca) {
this.marca = marca;
 }
 public String getModelo() {
 return modelo;
}
 public void setModelo(String modelo) {
this.modelo = modelo;
}
public abstract void arrancar();
}
