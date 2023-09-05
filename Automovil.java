class Automovil extends Vehiculo {
public Automovil(String marca, String modelo) {
 super(4, marca, modelo); }
 @Override
public void arrancar() {
System.out.println("Arrancando el automóvil " + getMarca() + " " + getModelo()+ ", "+ getNumeroRuedas() + " ruedas.");
}
}
class Motocicleta extends Vehiculo {
public Motocicleta(String marca, String modelo) {
 super(2, marca, modelo);
 }
 @Override
 public void arrancar() {
 System.out.println("Arrancando la motocicleta " + getMarca() + " " + getModelo() + ", "+ getNumeroRuedas() + " ruedas.");
}
}
